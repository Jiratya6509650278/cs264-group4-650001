function getForm(){
var storedObjectUserName = localStorage.getItem('objectUserName');
document.getElementById("username1").value = storedObjectUserName;

var storedObjectDisplayNameTH = localStorage.getItem('objectDisplayNameTH');
document.getElementById("displayNameTH").value = storedObjectDisplayNameTH;
}