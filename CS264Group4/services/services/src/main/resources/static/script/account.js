
function getAll(){

var storedObjectTuStatus = localStorage.getItem('objectTuStatus');
document.getElementById("TuStatus").innerHTML = storedObjectTuStatus;

var storedObjectType = localStorage.getItem('objectType');
document.getElementById("type").innerHTML = storedObjectType;

/*var storedObjectStatus = localStorage.getItem('objectStatus');
document.getElementById("status").innerHTML = storedObjectStatus;

var storedObjectMessage = localStorage.getItem('objectMessage');
document.getElementById("message").innerHTML = storedObjectMessage;*/

var storedObjectUserName = localStorage.getItem('objectUserName');
document.getElementById("username").innerHTML = storedObjectUserName;

var storedObjectDisplayNameTH = localStorage.getItem('objectDisplayNameTH');
document.getElementById("displayNameTH").innerHTML = storedObjectDisplayNameTH;

/*var storedObjectDisplayNameEN = localStorage.getItem('objectDisplayNameEN');
document.getElementById("displayNameEN").innerHTML = storedObjectDisplayNameEN;*/

var storedObjectEmail = localStorage.getItem('objectEmail');
document.getElementById("email").innerHTML = storedObjectEmail;

var storedObjectDepartment = localStorage.getItem('objectDepartment');
document.getElementById("department").innerHTML = storedObjectDepartment;

var storedObjectFaculty = localStorage.getItem('objectFaculty');
document.getElementById("faculty").innerHTML = storedObjectFaculty;
}
