<%-- 
    Document   : login
    Created on : Oct 18, 2022, 11:42:12 AM
    Author     : sonnt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="login" method="POST">
            username:<input type="text" name="username"/> <br/>
            password:<input type="password" name="password" /> <br/>
            <input type="submit" value="Login" />
        </form>
    </body>
</html>
