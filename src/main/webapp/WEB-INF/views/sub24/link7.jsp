<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
	<h1>${employee.id}번 직원 정보수정</h1>
	<form action="link8" method="post">
		<input type="hidden" name="id" value="${employee.id }" /> <br />
		 lastName : <input type="text" name="lastName" value="${employee.lastName }" /> <br />
		firstName : <input type="text" name="firstName" value="${employee.firstName }" /> <br />
		birth     : <input type="date" name="birth" value="${employee.birth }" /> <br />
		photo     : <input type="text" name="photo" value="${employee.photo }" /> <br />
		<%-- notes     : <input type="text" name="notes" value="${employee.notes }" /> <br /> --%>
		notes     : <textarea name="motes">${employee.notes }</textarea> <br />
		<input type="submit" value="수정" />
	</form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>