<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/common/taglib.jsp"%>
<%@ include file="/common/commonImport.jsp"%>

<html lang="ko">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge"/>
		<title>basic-board</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	</head>
	<body class="method-page" data-page="methods">
 		<table class="board_list">
			<col style="width: 150px;" />
			<col style="min-width: 250px;" />
			<col style="width: 150px;" />
			<col style="width: 300px;" />
			<thead>
				<tr>	
					<th scope="col">번호</th>
					<th scope="col">제목</th>
					<th scope="col">작성자</th>
					<th scope="col">작성일자11</th>
				</tr>
			</thead>
			<tbody>
				<c:choose>
					<c:when test="${listBoard eq null}">
						<tr>
							<td colspan="4">조회 결과 없음</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="item" items="${listBoard}" varStatus="status">
							<tr >
								<td><c:out value="${item.boardseq}"/></td>
								<td class="text-left">
									<a href='<c:url value="/readBoard.do?boardSeq="/><c:out value="${item.boardseq}"/>'><c:out value="${item.title}"/></a>
								</td>
								<td><c:out value="${item.create_user}"/></td>
								<td><c:out value="${item.create_date}"/></td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</tbody>
		</table>
	</body>
</html>


