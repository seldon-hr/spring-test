const URL = "http://localhost:8080/api/data";

/* const done = API_URL.json(); */





/* Tester of reaching the data */
async function loadData(url) {
    try {
        const res = await fetch(url, {
            mode: 'no-cors'
        });
        const data = await res.json();
        console.log(data)
    } catch (error) {
        console.error(error);
    }
}

loadData(URL);




$(document).ready(function () {
    $('#example').DataTable({
        ajax: URL,
    });
});