<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="white">
	<div align="center">
		<h1>PLEASE CHECK USER DETAILS</h1>
		<div align="left">
			<p>NAME : ${registerinfo.name}</p>
			<p>USERNAME : ${registerinfo.username}</p>
			<p>PASSWORD : ${registerinfo.password}</p>
			<p>COUNTRY : ${registerinfo.country}</p>

			<p>
				HOBBIES ::
				<c:forEach var="temp" items="${registerinfo.hobbies}">
                  ${temp}
                  </c:forEach>
			</p>

			<p>GENDER : ${registerinfo.gender}</p>
			<p>AGE    :${registerinfo.age}</p>
			<p>EMAIL  : ${registerinfo.communicationDto.email}</p>
			<p>PHONE  : ${registerinfo.communicationDto.phone}</p>
		</div>
	</div>
</body>
</html>