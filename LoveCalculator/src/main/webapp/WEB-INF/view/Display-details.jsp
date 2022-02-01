<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>HI ${userName}</h1>
<h2>love calculator results are :</h2>
<p>

user ${userinfo.userName} and ${userinfo.crushName}  both are :${userinfo.result}
</p>

<a href="/LoveCalculator/sendEmail">send your result to Email</a>
</body>
</html>