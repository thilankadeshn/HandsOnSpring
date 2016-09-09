/**
 * Created by thilanka on 12/3/15.
 */


$('#Uni_viewAllStudents').on('click',loadStudents);

var loadStudents=function(){

    var ajaxLoadUserData = {
        url: "universitySMS/viewAllStudents",
        data: $.toJSON(),
        async: true,
        contentType: 'application/json'
    };
}

