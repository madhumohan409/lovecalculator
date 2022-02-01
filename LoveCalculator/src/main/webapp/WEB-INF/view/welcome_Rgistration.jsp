<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
.error{
color:red;
position:fixed;
text-align:left;
margin:10px;
}
</style>
</head>
<body>
<div align="center">

<h1>WELCOME TO LOVE PLEASE REGISTER HERE</h1>
<div align="center">
<form:form action="showdetails" method="get" modelAttribute="registerinfo">
<p><label>NAME</label>
<form:input path="name"/>
<form:errors path="name" cssClass="error"></form:errors>
</p>
<p>
<label> USERNAME</label>
<form:input path="username"/>
<form:errors path="username" cssClass="error"></form:errors>
</p>
<p>
<label> PASSWORD</label>
<form:input path="password"/><br>
</p>
<p>
<label>COUNTRY</label>
<form:select path="country"><br>
<form:option value="IND" label="india"/>
<form:option value="PAK" label="pakistan"/>
<form:option value="SRI" label="srilanka"/>
</form:select>
</p>
<p>

<label>HOBBIES</label>
CRICKET:<form:checkbox path="hobbies" value="cricket"/>
VOLLY BALL:<form:checkbox path="hobbies" value="vollyball"/>
READING:<form:checkbox path="hobbies" value="reading"/>
</p>
<p>
<label>GENDER</label>
MALE<form:radiobutton path="gender" value="male"/>
FEMALE<form:radiobutton path="gender" value="female"/>
</p>
<p>
<label>age</label>
<form:input path="age"/>
</p>
<p>
<h3>Communication</h3>

<p>
<label> EMAIL</label>
<form:input path="communicationDto.email"/>
</p>
<p>
<label> PHONE</label>
<form:input path="communicationDto.phone"/>
</p>


<input type="submit" value="Register">
</form:form>
</div>
</div>
</body>
</html>