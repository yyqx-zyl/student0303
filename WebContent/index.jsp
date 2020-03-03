<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>学生信息</title>
</head>
<body>
	<table>
		<tr>
			<td>学号</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>班级</td>
		</tr>
		<c:forEach items="${list }" var="s" >
			<tr>
				<td>${s.id }</td>
				<td>${s.name }</td>
				<td>${s.age }</td>
				<td>${s.clas }</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>