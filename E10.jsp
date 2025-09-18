<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Details</title>
</head>
<body>
    <center>
        <h2>Student Details</h2>

        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/p10" user="root" password="" />

        <sql:query dataSource="${db}" var="rs">
            SELECT * FROM student;
        </sql:query>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Semester</th>

            </tr>
            <c:forEach var="i" items="${rs.rows}">
                <tr>
                    <td><c:out value="${i.id}" /></td>
                    <td><c:out value="${i.name}" /></td>
                    <td><c:out value="${i.sem}" /></td>
                </tr>
            </c:forEach>
