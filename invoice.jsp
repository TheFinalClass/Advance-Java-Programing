<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Invoice</title>
</head>
<body>
    <center>
        <h2>Bill</h2>

        <%
            int id=Integer.parseInt(request.getParameter("id"));
            String product=(String)request.getParameter("product");
            int price=Integer.parseInt(request.getParameter("price"));
            String custname=(String)request.getParameter("custname");
            String email=(String)request.getParameter("email");
            String address=(String)request.getParameter("address");
            String mobile=(String)request.getParameter("mobile");  

        %>
        
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/p11" user="root" password="" />

        <sql:update dataSource="${db}" var="rs">
            Insert into invoice values(<%=id%>,'<%=product%>','<%=custname%>','<%=email%>','<%=address%>',<%=mobile%>);
        </sql:update>
            
            
        <table border="1">
            <tr>
                <th colspan="4">INVOICE</th> 
            </tr>
            <tr>
                <th>ID</th>
                <th>Product_Name</th>
                <th>Price</th>
                <th>Customer_Name</th>
            </tr>
            <tr>
                <td><c:out value="<%=id%>" /></td>
                <td><c:out value="<%=product%>" /></td>
                <td><c:out value="<%=price%>" /></td>
                <td><c:out value="<%=custname%>" /></td>
            </tr>
        </table>

        
            
            
    </center>
</body>
</html>