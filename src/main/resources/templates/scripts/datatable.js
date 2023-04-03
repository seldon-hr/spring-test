const API_URL = "https://api.thedogapi.com/v1/images/search";
const URL = "http://localhost:8080/login/example";
/* const done = API_URL.json(); */




$(document).ready(function () {
    $('#example').DataTable({
        ajax: URL,
    });
});


$(document).ready(function () {
    $('#example').DataTable({
        initComplete: function () {
            this.api()
                .columns()
                .every(function () {
                    var column = this;
                    var select = $('<select><option value=""></option></select>')
                        .appendTo($(column.footer()).empty())
                        .on('change', function () {
                            var val = $.fn.dataTable.util.escapeRegex($(this).val());
 
                            column.search(val ? '^' + val + '$' : '', true, false).draw();
                        });
 
                    column
                        .data()
                        .unique()
                        .sort()
                        .each(function (d, j) {
                            select.append('<option value="' + d + '">' + d + '</option>');
                        });
                });
        },
    });
});


/* Tester of reaching the data */
async function loadData() {
    const res = await fetch(URL);
    console.log(res);
    const data = await res.json();

    console.log(data)
}

loadData();

