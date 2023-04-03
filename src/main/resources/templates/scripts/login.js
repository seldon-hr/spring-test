function getAccess() {
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;
    const url = "http://localhost:8080/login/session";
    let root = url+"?user=" +username+"&pass="+password;
    fetch(root)
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
  }
  

  fetch(root)