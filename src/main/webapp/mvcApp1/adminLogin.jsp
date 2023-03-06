<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!-- 
	Model1(*.jsp---*.jsp) session,request,response,application 
	Model2() Mvc
	Spring (DI,MVC)
	EL,JSTL 
-->

<title>������</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible"  />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="copyright" content="Copyright 2009 @ high1 all rights reserved" />
<link href="/web/resources/css/contents.css" rel="stylesheet" type="text/css" />
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script>
	$(function(){
		$("img#btnSubmit").click(function(){
			//console.log($("input#user_id").val().length);
			//console.log($("input#user_passwd").val().length);
			if($("input#user_id").val().length==0||$("input#user_passwd").val().length==0){
				alert('id or passCheck');
				$("input#user_id").val('');
				$("input#user_passwd").val('');
				$("input#user_id").focus();
				return false;				
			}
			$("form").submit();
		});
	});
</script>
</head>
<body>
<%-- ${pageContext.request.contextPath}  �����Ʈ�� ������ controller���� ��θ� ���� --%>
<form name="login" method="post" action="${pageContext.request.contextPath}/loginCheck">
 <div id="loginWrapper">
  <div class="loginForm">
   <fieldset>
    <legend>������ �ý��� �α���</legend>
    <dl>
     <dt><img src="/web/resources/img/common/th_id.gif" alt="���̵�" /></dt>
     <dd><input type="text" name="user_id" class="text" id="user_id" /></dd>

     <dt><img src="/web/resources/img/common/th_pw.gif" alt="��й�ȣ" /></dt>
     <dd><input type="password" name="user_passwd" class="text" id="user_passwd" /></dd>
    </dl>
    <div class="btn">
     <img id="btnSubmit" src="/web/resources/img/button/btn_login.gif" alt="LOGIN" title="LOGIN"  />
    </div>
    
    <div class="saveId"><input type="checkbox" id="checker" name="checker" /> 
     <img src="/web/resources/img/common/save_id.gif" alt="���̵� ����" />
    </div>
   </fieldset>
  </div>
 </div>
</form>
</body>
</html>