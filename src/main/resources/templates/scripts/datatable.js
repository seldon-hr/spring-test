const API_URL = "https://api.thedogapi.com/v1/images/search";
const URL = "http://localhost:8080/login/example";
/* const done = API_URL.json(); */




$(document).ready(function () {
    $('#data-users').DataTable({
        ajax: URL,
    });
});

async function loadData() {
    const res = await fetch(URL);
    console.log(res);
    const data = await res.json();

    console.log(data)
}

loadData();

