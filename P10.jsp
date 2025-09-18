<%@ page import="java.sql.*" %>
<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
    <center>
        <h2>Student Attendance</h2>
        <form method="GET">
            Enrollment Number: <input type="text" name="id" required>
            Subject:
            <select name="subject">
                <option value="4351603">AJP</option>
                <option value="4351602">MCN</option>
                <option value="4351601">AIML</option>
            </select><br><br>
            <input type="submit" value="View Attendance">
        </form>
        <br><br>

        <%
            String id = request.getParameter("id");
            String subject = request.getParameter("subject");


                    Class.forName("com.mysql.jdbc.Driver");
                    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/p10","root","");
                    Statement s = c.createStatement(); 
                    ResultSet rs = s.executeQuery("SELECT * FROM attendance WHERE id="+id+" AND subject="+subject);

            
        %>
                    <table border="1">
                        <tr>
                            <th>Enroll No</th>
                            <th>Date</th>
                            <th>Status</th>
                            <th>Subject</th>
                        </tr>
        <%
                    while(rs.next()) {
                        int sid = rs.getInt("id");
                        String dt = rs.getString("date");
                        String st = rs.getString("status");
                        String sub = rs.getString("subject");
        %>
                        <tr>
                            <td><%= sid %></td>
                            <td><%= dt %></td>
                            <td><%= st %></td>
                            <td><%= sub %></td>
                        </tr>
        <%
                    }
        %>
                    </table>

    </center>
</body>
</html>
