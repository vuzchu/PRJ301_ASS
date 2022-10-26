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
                    <th>Take by</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.students}" var="s">
                    <tr>
                        <td>${s.studentid}</td><!--comment-->
                        <td>${s.studentcode}</td><!--comment-->
                        <td>${s.studentsurname}</td><!--comment-->
                        <td>${s.studentmiddlename}</td><!--comment-->
                        <td>${s.studentgivenname}</td><!--comment-->
                        <td>${s.studentemail}</td><!--comment-->
                        <td>
                            Attended <input type="radio" name="status" value="" />
                            Absent<input type="radio" name="status" value="" />
                        </td>

                        <th>Sonnt5</th>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <input type="submit" value="Save" />
    </body>
</html>
