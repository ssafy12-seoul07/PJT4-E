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
		
		<input type="hidden" neme="id" value ="${review.id}">
		
		<label for="videoId">videoId</label>
		<input type="text" name="videoId" value="${review.videoId}"> <br>
		
		<label for="content">content</label>
		<input type="text" name="content" value="${review.content}"> <br>
		
		<label for="userId">videoId</label>
		<input type="text" name="userId" value="${review.userId}"> <br>
		
		<input type="submit" value="수정">
	</form>
		

</body>
</html>