<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>ADD TODO</h1>
<form action="/add-todo" method="POST">
        Description : <input name="desc" type="text" /> <input type="submit" value="add" />
    </form>

</body>
</html>