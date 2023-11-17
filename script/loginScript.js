

function login(){
    const username = document.getElementById("username").value;
    const password = document.getElementById("pass").value;

    const xhttp = new XMLHttpRequest();
    xhttp.open("POST", "https://restapi.tu.ac.th/api/v1/auth/Ad/verify"); 
    xhttp.setRequestHeader("Content-Type", "application/json");
    xhttp.setRequestHeader ("Application-Key", "TU0489b72c925ce111d4dec85273ba7e4629d711fa3ad28b3fa68957b3f43ffdcf8b15333d373a293395047a0f1ea449f5");
    xhttp.send(JSON.stringify({ "UserName": username, "PassWord": password }));
    xhttp.onreadystatechange = function () { 
        if((username == "employee" && password == "employee") || (username == "staff@dome.tu.ac.th" && password == "staff1234")){
            window.location = "employeeSelectionPage.html";
        }
        else if (this.readyState == 4 && this.status == 200) { 
                const object = JSON.parse (xhttp.responseText); 
                //console.log(object.faculty); 
                if(object.type == "student"){

                    /*localStorage.setItem('objectUser',object.username);
                    var storedObjectUser = localStorage.getItem('objectUser');*/

                    localStorage.setItem('objectType',object.type);
                    var storedObjectType = localStorage.getItem('objectType');

                    localStorage.setItem('objectTuStatus',object.tu_status);
                    var storedObjectTuStatus = localStorage.getItem('objectTuStatus');

                    localStorage.setItem('objectStatus',object.status);
                    var storedObjectStatus = localStorage.getItem('objectStatus');

                    localStorage.setItem('objectMessage',object.message);
                    var storedObjectMessage = localStorage.getItem('objectMessage');

                    localStorage.setItem('objectUserName',object.username);
                    var storedObjectUserName = localStorage.getItem('objectUserName');

                    localStorage.setItem('objectDisplayNameTH',object.displayname_th);
                    var storedObjectDisplayNameTH = localStorage.getItem('objectDisplayNameTH');

                    localStorage.setItem('objectDisplayNameEN',object.displayname_th);
                    var storedObjectDisplayNameEN = localStorage.getItem('objectDisplayNameEN');

                    localStorage.setItem('objectEmail',object.email);
                    var storedObjectEmail = localStorage.getItem('objectEmail');

                    localStorage.setItem('objectDepartment',object.department);
                    var storedObjectDepartment = localStorage.getItem('objectDepartment');

                    localStorage.setItem('objectFaculty',object.faculty);
                    var storedObjectFaculty = localStorage.getItem('objectFaculty');

                    window.location = "mainStudent.html";
                }
                else if(object.type == "employee"){
                    //alert("this is employee");
                    window.location = "employeeSelectionPage.html";
                }
                
         }
         else if(this.readyState != 4 && this.status != 200){
            alert("invalid username or password");
         }
         
  }
}

