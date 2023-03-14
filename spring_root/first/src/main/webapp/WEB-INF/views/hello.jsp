
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- jsp에 코어 라이브러리 ,기본 디폴트-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- context root 설정하는 부분 ,기본 디폴트-->
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!-- 페이지 인고딩 ,기본 디폴트 -->
<%
request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hello</title>
    <script src="${contextPath}/js/script.js">

    </script>
</head>
<body>
    안녕<br>
    <h2>${message}</h2>
    <img width="815" height="915" src="${contextPath}/images/gun.jpg" > <br>
    <input type="button" value="테스트" onclick="test()">
</body>
</html>