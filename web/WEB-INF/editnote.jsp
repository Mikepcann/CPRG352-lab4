<%-- 
    Document   : editnote
    Created on : 1-Oct-2021, 8:35:39 AM
    Author     : mikep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
        <h1>Edit Note</h1>
        <form method="POST" action="note">
        <p><strong>Title: </strong><input type="text" name="title" value="${note.title}"></p>
        <p><strong>Contents:</strong>
            <textarea name="contents" rows="4" cols="50">${note.contents}</textarea>
            ${note.contents}
        </p>
        <input type="submit" value="save"> 
        </form>
    </body>
</html>
