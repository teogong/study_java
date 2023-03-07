<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post"   action="customer1.jsp">
	<h1  style="text-align:center">회원 가입창</h1>
	<table  align="center">
	    <tr>
	       <td width="200"><p align="right">아이디</td>
	       <td width="400"><input type="text" name="custId"></td>
	    </tr>
	    <tr>
	        <td width="200"><p align="right">비밀번호</td>
	        <td width="400"><input type="password"  name="phone"></td>
	    </tr>
	    <tr>
	        <td width="200"><p align="right">이름</td>
	        <td width="400"><p><input type="text"  name="custName"></td>
	    </tr>
	    <tr>
	        <td width="200"><p align="right">주소</td>
	        <td width="400"><p><input type="text"  name="addr"></td>
	    </tr>
	    <tr>
	        <td width="200"><p align="right">생일</td>
	        <td width="400"><p><input type="text"  name="birthDate"></td>
	    </tr>
	    <tr>
	        <td width="200"><p>&nbsp;</p></td>
	        <td width="400">
		<input type="submit" value="가입하기">
		<input type="reset" value="다시입력">
	  </td>
	    </tr>
	</table>
</form>
</body>
</html>