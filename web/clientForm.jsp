<%-- 
    Document   : clientForm
    Created on : 29 Oct, 2019, 3:35:29 PM
    Author     : Lenc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="http://localhost:8080/HelloWS/webresources/hellows" method="GET">
            Username: <input type="text" name="username"/>
            <br>
            <br>
            <input type="submit"/>
        </form>
        <form action="http://localhost:8080/HelloWS/webresources/calculatews" method="GET">
            <h2>Calculator: Please enter 2 numbers</h2>
            Number 1: <input type="number" name="num1"/>
            <br>
            <br>
            Number 2: <input type="number" name="num2"/>
            <br>
            <br>
            <select name="operator">
                <option value="add">Add</option>
                <option value="subtract">Subtract</option>
                <option value="multiply">Multiply</option>
                <option value="divide">Divide</option>
            </select>
            <br>
            <br>
            <input type="submit"/>
        </form>
            
    </body>
</html>
