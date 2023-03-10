
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
<title>상세 조회</title>
<script>
    function backTolist(frm){
        frm.action = "${contextPath}/board/listarticles";
        //http://lacalhost:8080/프로젝트이름/board/listarticles
        frm.submit();
    }
</script>
</head>
<body>
    <form name="articleForm" method="post" action="${contextPath}">
        <table border="0" align="center">
            <tbody>
                <tr>
                    <td width="150" align="center" bgcolor="#FF9933">글번호</td>
                    <td>
                        <input type="text" value="${article.article_no}" name="articleNo" disabled>
                    </td>
                </tr>
                <tr>
                    <td widht="150" align="center" bgcolor="#DD9933">작성자</td>
                    <td>
                        <input type="text" value="${article.write_id}" name="write" disabled>
                    </td>
                </tr>
                <tr>
                    <td widht="150" align="center" bgcolor="#DD9933">제목</td>
                    <td>
                        <input type="text" value="${article.title}" name="title" id="i_title" disabled>
                    </td>
                </tr>
                <tr>
                    <td widht="150" align="center" bgcolor="#DD9933">내용</td>
                    <td style="vertical-align: left;">
                    <!-- textarea는 탭을 인식함  -->
                        <textarea rows="20" cols="60" name="content" id="i_content" disabled>${article.content}</textarea>
                    </td>
                </tr>
                <tr>
                    <td widht="20%" align="center" bgcolor="#DD9933">작성일</td>
                    <td>
                        <input type="text" value="${article.writedate}" disabled>
                    </td>
                </tr>
                <tr id="tr_btn">
                    <td colspan="2" align="center">
                        <input type="button" value="수정" onclick="fn_enable(articleForm)">
                        <input type="button" value="삭제" onclick="fn_remove('${contextPath}/board/remove','${article.article_no}')">
                        <input type="button" value="목록보기" onclick="backTolist(articleForm)">
                    </td>
                </tr>
            </tbody>
        </table>

    </form>
</body>
</html>