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
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            text-align: center;
            padding: 20px;
        }
        h2 {
            color: #28a745;
            font-size: 2.5em;
            margin-bottom: 20px;
        }
        table {
            margin: 0 auto;
            width: 80%;
            max-width: 1100px;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            overflow: hidden;
        }
        th, td {
            padding: 15px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        th {
            background-color: #28a745;
            color: white;
            font-size: 1.2em;
        }
        td {
            font-size: 1.1em;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        a {
            text-decoration: none;
            color: #fff;
            background-color: #28a745;
            padding: 10px 20px;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #218838;
        }
        iframe {
            width: 100%;
            aspect-ratio: 4/3;
            max-height: 300px;
            max-width: 400px;
            border: none;
            border-radius: 5px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.2);
        }
        td iframe {
            margin-bottom: 10px;
        }
        .video-title {
            font-size: 1em;
            font-weight: bold;
            color: #333;
            margin-top: 10px;
        }
        .video-title:hover {
            color: #28a745;
        }
        #category {
        	width: 4rem;
        }
        #detail {
        	width: 8rem;
        }
    </style>
</head>
<body>
    <h2>비디오 목록</h2>

    <table>
        <tr>
        	<th>분류</th>
            <th>영상 미리보기</th>
            <th>리뷰 보기</th>
        </tr>
        
        <c:forEach items="${list}" var="video">
            <tr>
            	<td id="category">${video.category}</td>
                <td>
                    <iframe src="https://www.youtube.com/embed/${video.id}" allowfullscreen></iframe> <br>
                    <span class="video-title">${video.title}</span>
                </td>
                <td id="detail"><a href="main?action=reviewlist&id=${video.id}">상세보기</a></td>        
            </tr>
        </c:forEach>
    
    </table>
</body>
</html>
