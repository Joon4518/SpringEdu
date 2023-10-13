<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var="cpath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Spring MVC09</h2>
		<div class="panel panel-default">
			<div class="panel-heading">Board</div>
			<div class="panel-body">
				<form id="frm" method="post">
					
					<input type="hidden" name="page" value="${cri.page}">
					<input type="hidden" name="perPageNum" value="${cri.perPageNum}">
										
					<input id="memID" type="hidden" name="memID" value="${mvo.memID}">
					<!-- 부모글의 게시글 번호 -->
					<input id="idx" type="hidden" name="idx" value="${vo.idx}">
					<div class="form-group">
						<label>제목</label> <input id="title" type="text" name="title" class="form-control" value="<c:out value='${vo.title}'/>">
					</div>

					<div class="form-group">
						<label>답변</label>
						<textarea id="content" class="form-control" name="content" rows="10" cols=""></textarea>
					</div>

					<div class="form-group">
						<label>작성자</label> <input id="writer" readonly="readonly" value="${mvo.memName}" type="text" name="writer" class="form-control">
					</div>

					<button data-btn="reply" type="button" class="btn btn-default btn-sm">답변</button>
					<button data-btn="reset" type="button" class="btn btn-default btn-sm">취소</button>
					<button data-btn="list" type="button" class="btn btn-default btn-sm">목록</button>

	    		</form>

			</div>
			<div class="panel-footer">스프링게시판 - 박병관</div>
		</div>
	</div>

	<script type="text/javascript">
		$(document).ready(function(){
			$("button").on("click", function(e){
				var formData = $("#frm");
				var btn = $(this).data("btn");
				if(btn == "list"){
					formData.attr("action", "${cpath}/board/list");
					formData.find("#idx").remove();
					formData.attr("method","get");
					
					formData.find("#memberID").remove();
					formData.find("#title").remove();
					formData.find("#content").remove();
					formData.find("#writer").remove();
				}else if(btn == "reply"){
					formData.attr("action", "${cpath}/board/reply");
					
				}else if(btn == "reset"){
					formData[0].reset();
					return;
				}
				
				formData.submit();
				
				
			});
		});
		
   </script>

</body>
</html>
















