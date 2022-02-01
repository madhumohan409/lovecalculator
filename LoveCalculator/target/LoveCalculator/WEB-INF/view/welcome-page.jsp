<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcomepage</title>

<style type="text/css">
.error{
color: red;
position:fixed;
text-align:left;
margin:10px;

}


</style>


<script type="text/javascript">
	function validateuserName() {
		var userName = document.getElementById("un").value;
		if (userName.length < 3) {
			alert("userName should be atleast 3 char");
			return false;
		} else {
			return true;
		}

	}
</script>

</head>
<body>

	<h1>WELCOME TO SERVER PAGE</h1>

	<form:form action="displayDetails" method="get"
		modelAttribute="userinfo" >
		<div align="center">
			<p>
				<label>UserName:</label>
				<form:input path="userName" id="un" />
				<form:errors path="userName" cssClass="error"></form:errors>
			</p>
			<p>
				<label>CrushName</label>
				<form:input path="crushName" id="cn" />
				<form:errors path="crushName" cssClass="error"></form:errors>
			</p>
			<p>
			<form:checkbox path="termsAndConditions" id="tc" />
			<label> I have agreed to terms and conditions</label>
			<form:errors path="termsAndConditions" cssClass="error"/>	
				</p>
			<input type="submit" value="search">
		</div>
	</form:form>

</body>
</html>