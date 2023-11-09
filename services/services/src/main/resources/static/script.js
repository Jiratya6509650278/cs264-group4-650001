function login(){
    const username = document.getElementById("username").value;
    const password = document.getElementById("pass").value;

    const xhttp = new XMLHttpRequest();
    xhttp.open("POST", "https://restapi.tu.ac.th/api/v1/auth/Ad/verify"); 
    xhttp.setRequestHeader("Content-Type", "application/json");
    xhttp.setRequestHeader ("Application-Key", "TU0489b72c925ce111d4dec85273ba7e4629d711fa3ad28b3fa68957b3f43ffdcf8b15333d373a293395047a0f1ea449f5");
    xhttp.send(JSON.stringify({ "UserName": username, "PassWord": password }));
    xhttp.onreadystatechange = function () { 
        if (this.readyState == 4 && this.status == 200) { 
                const object = JSON.parse (xhttp.responseText); 
                //console.log(object); 
                if(object.type == "student"){
                    //alert("this is student");
                    window.location = "index1.html"; // Redirecting to other page.
                }
                else if(object.type == "employee"){
                    //alert("this is employee");
                    window.location = "employeeHomepage.html";
                }
                
         }
         if(this.readyState != 4 && this.status != 200){
            alert("invalid username or password");
         }
         
  }
}


function loginProfessor() {
  var user = document.getElementById("username").value;
  var pass = document.getElementById("pass").value;
  if(user == "staff@dome.tu.ac.th" && pass == "staff1234") {
      window.location = "https://chat.openai.com/";
      return false;
  } else {
      alert("invalid username or password");
  }
}