/**
 * Created by thilanka on 12/3/15.
 */

$(document).ready(function(){

    var success=function(){

        var newStudent=loadResult();

        $.ajax ({
            type:'POST',
            url: "universitySMS/addStudents",
            data: $.toJSON(newStudent),
            //async: true,
            contentType: 'application/json',
            success:function(e){

                alert("Successfully added");

            }
        });
    };

    var loadResult=function(){
        var StudentId=$('#studentId').val();
        var StudentName=$('#studentName').val();
        var DepartmentId=$('#Dep_ID').val();
        var AdvisorId=$('#Advisor_Id').val();

        newStudent={
            studentId:StudentId,
            studentName:StudentName,
            DepartmentId:DepartmentId,
            AdvisorId:AdvisorId
        };
        return newStudent;
    };

    $('#addStudentBtn').on('click',success);

});
