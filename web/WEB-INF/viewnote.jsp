<%-- 
    Document   : viewnote
    Created on : 1-Oct-2021, 8:35:11 AM
    Author     : mikep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
 
        <h2>View Note</h2>
        
        <p><strong>Title: </strong>${note.title}</p>
        <p><strong>Contents:</strong>
            <br>
            ${note.contents}
        </p>
        <br>
        <a href="note?edit">Edit</a>
    </body>
</html>
