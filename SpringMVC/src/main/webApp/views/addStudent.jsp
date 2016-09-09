
<%--
  Created by IntelliJ IDEA.
  User: thilanka
  Date: 12/3/15
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <title>add Student</title>
    <%--<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>--%>
    <script src="<c:url value="/js/addStudent.js" />"></script>
    <script src="<c:url value="/JS/jquery.json-2.2.min.js" />" type="text/javascript"></script>
    <script src="<c:url value="/JS/addStudent.js" />" type="text/javascript"></script>

</head>
<body>

<form method="post" action="">
    Student ID:<input type="text" id="studentId" name="studentId" value=""><br>
    Student Name:<input type="text"  id="studentName" name="studentName" value=""><br>
    Department:<input type="text"  id="Dep_ID" name="Dep_ID" value=""><br>
    Advisor_ID:<input type="text"  id="Advisor_Id" name="Advisor_Id" value=""><br>
    <input type="submit"  id="addStudentBtn" value="Add"><br>
</form>


</body>
</html>
