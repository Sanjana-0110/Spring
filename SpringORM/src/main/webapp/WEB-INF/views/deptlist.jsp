<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.spring.orm.model.Dept, java.util.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Departments List through Spring ORM</title>
</head>
<body bgcolor="green">
    <h1>Dept List from Spring ORM</h1>
    <table border="1">
        <tr>
            <th>Dept No</th>
            <th>Dept Name</th>
            <th>Location</th>
        </tr>
        <% 
        List<Dept> dlist = (List<Dept>) request.getAttribute("dlist");
            for (Dept d : dlist) {
        %>
        <tr>
            <td> <%= d.getDeptNo() %> </td>
            <td> <%= d.getDName() %> </td>
            <td> <%= d.getLocation() %> </td>
        </tr>
        <% 
             
        }
        %>
    </table>
</body>
</html>
