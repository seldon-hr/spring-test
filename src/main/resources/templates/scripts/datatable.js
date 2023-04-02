const API_URL = "http://localhost:8080/login/example";


$(document).ready(function () {
    $('#data-users').DataTable({
        ajax: API_URL,
    });
});


async function loadData() {
    const res = await fetch(API_URL);
    const data = await res.json();

    console.log(data)
}

loadData();