<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<title>관리자</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible"  />
<meta http-equiv="imagetoolbar" content="no" />
<link href="/web/resources/css/contents.css" rel="stylesheet" type="text/css" />
<script>
$(function(){
	 $("span#save > a#save").click(function(){
		 if($("input[name='author']").val().length==0||$("input#title").val().length==0){
			 alert('name or title Check!');
			 $("input[name='author']").val('');
			 $("input#title").val('');
			 return false;
		 }
		 if($("[type='password']").val().length==0|| $("textarea").val().length==0){
			 alert('password or textarea Check!');
			 $("[type='password']").val('');
			 $("textarea").val('');
			 return false;
		 }
		 $("form").submit();
		 
	 });
  });
</script>
</head>

<body >
	<div id="wrapper">
		<div id="header">
			<div class="topInfoWrap">
				<div class="topInfoArea clfix">
					<div class="loginWrap">
						<span class="fir">2022.05.17</span>
						<span>13:30:22</span>
						<span><em>OOO님</em> 좋은 하루 되세요</span>
						<a href="" class="btnLogout"><img src="/web/resources/img/common/btn_logout.gif" alt="로그아웃" /></a>
					</div>
				</div>
			</div>
			<div class="gnbSubWrap">
				
			</div>
		</div>	
		<div id="container">
			<div id="contentsWrap" class="contentsWrap">
				<div class="contents">
					<h1 class="title">게시판 등록</h1>
					<div class="btnSet clfix mgb15">
						<span class="fr">
							<span class="button" id="save"><a href="#" id="save">저장</a></span>
							<span class="button"><a href="#">수정</a></span>
							<span class="button"><a href="#">목록</a></span>
							<span class="button"><a href="#">삭제</a></span>
						</span>
					</div>
					<form action="editInsert.jsp" name="frm" method="post">
					<table class="bbsWrite">
						<colgroup>
							<col width="90" />
							<col />
						</colgroup>

						<tbody>
						<tr>
							<th scope="row">작성자</th>
							<td><input type="text" name="author" id="author" class="inputText" size="50" /></td>
						</tr>
						<tr>
							<th scope="row">제목</th>
							<td><input type="text" name="title" id="title" class="inputText" size="50" /></td>
						</tr>
						<tr>
							<th scope="row">비밀번호</th>
							<td><input type="password" name="password" id="password" class="inputText" size="50" /></td>
						</tr>
						<tr>
							<th scope="row">내용</th>
							<td class="editer">
								<textarea name="contents" id="contents"></textarea>
							</td>
						</tr>
						<tr>
							<th scope="row">이미지첨부</th>
							<td>
							<input type="file" name="" class="inputText" size="50" />
							</td>
						</tr>
						</tbody>
					</table>
					</form>
					<!-- form end -->

				</div>
			</div>
		</div>
	</div>
</body>
</html>