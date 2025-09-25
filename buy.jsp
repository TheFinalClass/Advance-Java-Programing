<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Order</title>
</head>
<body>
    <center>
        <h2>Order</h2>

        <%
            int id=Integer.parseInt(request.getParameter("id"));
        %>
        
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/p11" user="root" password="" />

        <sql:query dataSource="${db}" var="rs">
            SELECT * FROM product where id=<%=id%> ;
        </sql:query>

        <form method="GET" action="invoice.jsp">
            
            <c:forEach var="i" items="${rs.rows}">
                
            Product ID:<input type="text" readonly value="${i.id}"  name="id" ><br><br>
            Product Name:<input type="text" readonly value="${i.productname}" name="product" ><br><br>
            Description:<input type="text" readonly value="${i.description}" name="description" ><br><br>
            Price:<input type="text" readonly value="${i.price}"  name="price" ><br><br>
            Customer Name:<input type="text"   name="custname"><br><br>
            Email_Address:<input type="text"   name="email"><br><br>
            Address:<input type="text"   name="address"><br><br>
            Mobile_No:<input type="text"   name="mobile"><br><br>
            
            </c:forEach>
            <input type="submit"   value="order"><br><br>
            
            </form>
            
            
    </center>
</body>
</html>