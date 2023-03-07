<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	   request.setCharacterEncoding("UTF-8");
	   String custId=request.getParameter("custId");
	   String pwd=request.getParameter("phone");
	   String custName= request.getParameter("custName");
	   String addr= request.getParameter("addr");
	   String birthDate= request.getParameter("birthDate");
	  
%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1"  align="center" >
    <tr align="center" bgcolor="#99ccff">
      <td width="20%"><b>아이디</b></td>
      <td width="20%"><b>비밀번호</b></td>
      <td width="20%" ><b>이름</b></td>
      <td width="20%"><b>주소</b></td>
      <td width="20%"><b>생일</b></td>
   </tr>
   <tr align=center>
      <td><%=custId %> </td>
      <td><%=pwd%> </td>
      <td><%=custName %> </td>
      <td><%=addr %> </td>
      <td><%=birthDate %> </td>
   </tr>   
   <tr align=center>
   <!-- request.getParameter을 param으로 받는 -->
      <td>${param.custId } </td>
      <td>${param.phone } </td>
      <td>${param.custName } </td>
      <td>${param.addr }</td>
      <td>${param.birthDate }</td>
   </tr>
</table>
</body>
</html>