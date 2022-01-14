<%-- 
    Document   : arithmeticcalculator
    Created on : Jan. 12, 2022, 7:12:09 p.m.
    Author     : neild
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
         <form action = "arithmetic" method = "post">
            <label for = "first">First: </label>
            <input type ="number" name = "first" id = "first">
            <br>
            <label for = "second">Second: </label>
            <input type ="number" name = "second" id = "second">
            <br>
            <input type="submit" name = "btn" value="+">
            <input type="submit" name = "btn" value="-">
            <input type="submit" name = "btn" value="*">
            <input type="submit" name = "btn" value="%">
     
        </form>
        <p>${message}</p>
              <a href="age">Age Calculator</a>
    </body>
</html>
