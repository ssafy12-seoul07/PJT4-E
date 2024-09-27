<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${title} 리뷰 목록</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            color: #333;
            text-align: center;
            padding: 20px;
        }
        h2 {
            color: #4CAF50;
            font-size: 2.5em;
            margin-bottom: 20px;
        }
        form {
            margin-bottom: 30px;
        }
        fieldset {
            border: 1px solid #ddd;
            padding: 20px;
            width: 50%;
            margin: 0 auto;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        legend {
            font-size: 1.5em;
            color: #4CAF50;
        }
        label, input {
            display: block;
            width: 90%;
            margin: 10px auto;
            padding: 8px;
            font-size: 1.1em;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        table {
            margin: 20px auto;
            width: 80%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }
        th, td {
            padding: 12px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            color: #fff;
            background-color: #4CAF50;
            padding: 8px 16px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <h2>${title} 리뷰 목록</h2>
    
    <form action="main" method="post">
        <fieldset>
            <legend>리뷰 등록</legend>
            <input type="hidden" name="action" value="new">
            <input type="hidden" name="videoId" value="${video.id}">
            
            <label for="userId">User ID</label>
            <input type="text" name="userId" required>
            
            <label for="content">내용</label>
            <input type="text" name="content" required>
            
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
                <td><a href="main?action=toupdateform&id=${review.id}">수정</a></td>        
                <td><a href="main?action=delete&id=${review.id}&videoId=${review.videoId}">삭제</a></td>        
            </tr>
        </c:forEach>
    
    </table>
    
    <a href="main?action=videolist">비디오 목록으로 돌아가기</a>
</body>
</html>
