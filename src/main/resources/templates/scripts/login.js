const username = document.getElementById("username").value;
const password = document.getElementById("password").value;
const url = "http://localhost:8080/login/session";
const root = url+"?user=" +username+"&pass="+password;


function getAccess() {
    debugger
    console.log(root);
    /* fetch(root, {
        mode: 'no-cors'
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error)); */
}