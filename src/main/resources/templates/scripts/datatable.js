const API_URL = "./scripts/array.json";


$(document).ready(function () {
    $('#data-users').DataTable({
        ajax: API_URL,
    });
});
