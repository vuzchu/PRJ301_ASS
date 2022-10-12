<%-- 
    Document   : list
    Created on : Oct 12, 2022, 7:12:42 PM
    Author     : vu
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Index</th>
                    <th>Code</th>
                    <th>Surname</th>
                    <th>Middle name</th>
                    <th>Given name</th>
                    <th>Email</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.students}" var="s">
                    <tr>
                        <td>${s.studentid}</td>
                        <td>${s.studentcode}</td>
                        <td>${s.studentsurname}</td><!-- <td></td> -->
                        <td>${s.studentmiddlename}</td><!-- comment -->
                        <td>${s.studentgivenname}</td><!-- comment -->
                        <td>${s.studentemail}</td><!-- comment -->
                        <td style="color: green">Attended</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

    </body>
</html>
