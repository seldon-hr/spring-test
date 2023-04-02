const API_URL = "./scripts/array.json";


$(document).ready(function () {
    $('#example').DataTable({
        ajax: API_URL,
    });
});
