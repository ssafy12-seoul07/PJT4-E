<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>비디오 목록</title>
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
        table {
            margin: 0 auto;
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
        
        iframe {
            width: 100%;
            height: 200px; /* 높이는 필요에 따라 조정 */
            border: none;
        }
        
        
    </style>
</head>
<body>
    <h2>비디오 목록</h2>

    <table>
        <tr>
            <th>제목</th>
            <th>영상 미리보기</th>
            <th>리뷰 보기</th>
        </tr>
        
        <c:forEach items="${list}" var="video">
            <tr>
                <td>${video.title}</td>
                <td>
                    <iframe src="https://www.youtube.com/embed/${video.id}" allowfullscreen></iframe>
                </td>
                <td><a href="main?action=reviewlist&id=${video.id}">상세보기</a></td>        
            </tr>
        </c:forEach>
    
    </table>
</body>
</html>
