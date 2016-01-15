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
 		<form id="form" action="">
			<spring:bind path="board.boardseq">
				<input name="<c:out value="${status.expression}"/>" type="hidden" value="<c:out value="${status.value}"/>"/>
			</spring:bind>
		</form>
		<table class="board_view">
			<tbody>
				<tr>
					<th scope="row">力格</th>
					<td><c:out value="${board.title}"/></td>
				</tr>
				<tr>
					<th scope="row">累己磊</th>
					<td><c:out value="${board.create_user}"/></td>
				</tr>
				<tr>
					<th scope="row">累己老</th>
					<td><c:out value="${board.create_date}"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<c:out value="${board.content}"/>
					</td>
				</tr>
			</tbody>
		</table>
	</body>
</html>