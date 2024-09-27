<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>리뷰 수정</title>
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
    </style>
</head>
<body>
    <h2>리뷰 수정</h2>
    
    <form action="main" method="post">
        <fieldset>
            <legend>리뷰 수정</legend>
            <input type="hidden" name="action" value="update">
            <input type="hidden" name="id" value="${review.id}">
            <input type="hidden" name="videoId" value="${review.videoId}">
            
            <label for="content">내용</label>
            <input type="text" name="content" value="${review.content}" required>
            
            <input type="hidden" name="userId" value="${review.userId}">
            <input type="submit" value="수정">
        </fieldset>
    </form>
</body>
</html>
