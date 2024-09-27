<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비디오 목록</title>
</head>
<body>
	<h2>비디오 목록</h2>
	
	<table>
		<tr>
			<th>비디오 ID</th>
			<th>제목</th>
			<th>리뷰 및 상세보기</th>
		</tr>
		
		<c:forEach items="${list}" var="video">
			<tr>
				<td>${video.id}</td>
				<td>${video.title}</td>
				<td><a href="main?action=reviewlist&id=${video.id}">상세보기</a></td>		
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>