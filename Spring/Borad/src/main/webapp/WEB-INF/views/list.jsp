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
<title>글 목록</title>
<style>
    .cls1 {
	text-decoration: none;
    color: inherit;
    }
    .cls2 {
	text-align: center;
	font-size: 30px;
	display: block;
    }
</style>
</head>
<body>
    <table  align="center" border="1" width="80%">
        <thead>
            <tr height="10" align="center" bgcolor="lightgreen">
                <th>글번호</th>
                <th>작성자</th>
                <th>제목</th>
                <th>작성일</th>
                <th>content</th>
            </tr>
        </thead>
        <c:choose>
            <c:when test="${empty dataList}">
	            <tbody>
	                <tr height="10">
	                    <td colspan="4">
	                        <p align="center">
	                            <b><span style="font-size: 9pt">등록된 글이 없습니다.</span></b>
	                        </p>
	                    </td>
	                </tr>
	            </tbody>
            </c:when>
        
            <c:otherwise>
                <tbody>
                    <c:forEach var="article" items="${dataList}" varStatus="articleNum">
                        <tr align="center">
                            <td width="5%">${articleNum.count}</td>
                            <td width="10%">${article.write_id}</td>
                            <td align="left" width="35%">
                                <span style="padding-right: 30px;"></span>
                                ${article.title}
                            </td>
                            <td width="10%">${article.writedate}</td>
                            <td align="left" width="35%">
                                <span style="padding-right: 30px;"></span>
                                <a class="cls1" href="${contextPath}/board/view?no=${article.article_no}">
                                    ${article.content}
                                </a>
                               
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </c:otherwise>
        </c:choose>
    </table>
    <a class="cls1" href="${contextPath}/board/add"><span class="cls2">글쓰기</span></a>
</body>
</html>