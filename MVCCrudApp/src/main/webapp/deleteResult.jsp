<%@ page language="java" contentType="text/html" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Result</title>
</head>
<body bgcolor="lightblue">
	<c:choose>
		<c:when test="${status eq 'success'}">
			<h1 style="color:green; text-align:center; "> Record Deleted Successfully</h1>
		</c:when>
		<c:otherwise>
			<h1 style="color:red; text-align:center; ">Record not Deleted</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>