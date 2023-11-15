
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
                    //alert("this is student");
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
