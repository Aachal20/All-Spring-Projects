<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
<meta charset="ISO-8859-1">
<title>Employee Report</title>
</head>
<body>
	<br>
	<div class="container">
		<div class="card">
			<div class="card-header bg-primary text-center text-white">
				<h3>STUDENT REPORT</h3>
			</div>
			<c:choose>
				<c:when test="${!empty studentsInfo}"></c:when>
					<div class="card-body">
						<table class="table table-hover table-bordered">
							<tr class="bg-info text-white">
								<th>Student NO</th>
								<th>Student NAME</th>
								<th>fees</th>
								<th>DOB</th>
								<th>dot</th>
							</tr>
							<c:forEach var="emp" items="${studentsInfo}">
								<tr>
									<td>${emp.sid}</td>
									<td>${emp.sname}</td>
									<td>${emp.addrs}</td>
									<td>${emp.fees}</td>
									<td>${emp.dob}</td>
									<td>${emp.dot}</td>
									<td><a class=" btn btn-warning" href="edit?no=${emp.sid}">Edit <i class="fa fa-pencil-square-o" aria-hidden="true"></i></a>
										 <a class=" btn btn-danger" onclick="return confirm('Do you want to delete')" href="delete?no=${emp.sid}">Delete<i class="fa fa-times" aria-hidden="true"></i>
									</a></td>
								</tr>
							</c:forEach>
						</table>
					<c:when/>
				<c:otherwise>
					<h3 style="color: red; text-align: center">RECORDS NOT FOUND</h3>
				</c:otherwise>
				</div>
				</c:choose>
				
			<!-- 
			<div class="card-footer text-center">
				<a class="btn btn-info" href="./">Home <i class="fa fa-home"
					aria-hidden="true"></i></a>
			</div> -->
		</div>
	</div>
	<br>
	<br>
</body>
</html>