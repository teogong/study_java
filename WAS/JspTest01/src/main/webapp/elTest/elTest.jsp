<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--EL 표현법  -->
	\${"안녕하세요"}: ${"안녕하세요"}<br>
	\${20-10}  : ${20-10}  <br>
	\${100>10} : ${100 > 10}<br>
	\${(10==10) || (20!=30)}  : ${(10==10)||(20==30)} <br>
</body>
</html>