<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product</title>
</head>
<body>
    <center>
        <h2>Product</h2>

        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/p11" user="root" password="" />

        <sql:query dataSource="${db}" var="rs">
            SELECT * FROM product;
        </sql:query>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Product_Name</th>
                <th>Description</th>
                <th>Price</th>
                <th>Action</th>
            </tr>
            <c:forEach var="i" items="${rs.rows}">
                <tr>
                    <td><c:out value="${i.id}" /></td>
                    <td><c:out value="${i.productname}" /></td>
                    <td><c:out value="${i.description}" /></td>
                    <td><c:out value="${i.price}" /></td>
                    <td><a href="buy.jsp?id=${i.id}">Buy</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
    </html>

    

    
