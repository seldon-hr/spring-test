
function getAccess() {
    const username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    password = String(password);
    const url = "http://localhost:8080/login/session";
    const root = url+"?user=" +username+"&pass="+ encodeURIComponent(password);
    /* debugger
    console.log(password); */
    console.log(root);
    fetch(root, {
        mode: 'no-cors'
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error)); 
}


