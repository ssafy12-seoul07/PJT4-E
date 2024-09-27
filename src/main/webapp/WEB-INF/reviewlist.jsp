<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title} 리뷰 목록</title>
</head>
<body>
	<h2>${title} 리뷰 목록</h2>
	
	<form action="main" method="post">
		<fieldset>
			<legend>리뷰 등록</legend>
			<input type="hidden" name="action" value="new">
			
			<input type="hidden" name="videoId" value="${video.id}">
			
			<label for="userId">user id</label>
			<input type="text" name="userId">
			
			<label for="content">내용</label>
			<input type="text" name="content">
			
			<input type="submit" value="등록">
		</fieldset>
	</form>
	
	<table>
		<tr>
			<th>USER ID</th>
			<th>리뷰</th>
			<th>수정</th>
			<th>삭제</th>			
		</tr>
		
		<c:forEach items="${reviewlist}" var="review">
			<tr>
				<td>${review.userId}</td>
				<td>${review.content}</td>
				<td><a href="updateform.jsp?review=${review}">수정</a></td>		
				<td><a href="main?action=delete&id=${review.id}">삭제</a></td>		
			</tr>
		</c:forEach>
	
	</table>
	
	<a href="videolist.jsp">비디오 목록으로 돌아가기</a>
</body>
</html>