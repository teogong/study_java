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
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
<style>
    .class-caption {
		width:100px;
	}
	.class-content {
		width:500px;
	}
</style>
<script>
    function backTolist(frm){
        frm.action = "${contextPath}/board/listarticles";
        //http://lacalhost:8080/프로젝트이름/board/listarticles
        frm.submit();
    }
</script>
</head>
<body>
    <h1 style="text-align: center;">글쓰기</h1>
    <form name="articleForm" method="post" action="${contextPath}/board/addarticle">
        <table border="0" align="center">
            <tbody>
                <tr>
                    <td align="right" class="class-caption">글제목:</td>
                    <td clospan="2">
                        <input type="text" maxlength="100" name="i_title" class="class-content">
                    </td>
                </tr>
                <tr>
                    <td align="right" valign="top" class="class-caption"></td>
                    <td colspan="2">
                        <textarea name="i_content" rows="10" maxlength="2000" class="class-content"></textarea>
                    </td>
                </tr>
                <tr>
                    <td align="right"></td>
                    <td colspan="2">
                        <input type="submit" value="저장">
                        <input type="button" value="목록보기" onclick="backTolist(articleForm)">
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
</body>
</html>