<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰 수정</title>
</head>
<body>
	<h2>리뷰 수정</h2>
	
	<form action="main" method="post">
		
		<input type="hidden" name="action" value="update">
		
		<input type="hidden" name="id" value="${review.id}">
		
		<input type="hidden" name="videoId" value="${review.videoId}">
		
		<label for="content">content</label>
		<input type="text" name="content" value="${review.content}"> <br>
		
		<input type="hidden" name="userId" value="${review.userId}">
		
		<input type="submit" value="수정">
	</form>
		

</body>
</html>