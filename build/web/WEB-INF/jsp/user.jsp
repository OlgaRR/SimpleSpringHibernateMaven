<%-- 
    Document   : user
    Created on : 27.12.2014, 0:53:04
    Author     : Olya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h1>${u}</h1>
        <ul>
            <c:forEach items="${userlist}" var="user">
                <li>${user.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
