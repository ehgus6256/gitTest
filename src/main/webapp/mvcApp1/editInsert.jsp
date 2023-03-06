<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<%
	request.setCharacterEncoding("UTF-8");
%>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script type="text/javascript">
	$(function(){
		
	});
</script>
</head>
<%-- <jsp:useBean id="b" class=".com.bean.BoardBean"></jsp:useBean> --%>
<%-- <jsp:setProperty property="*" name="b"/> --%>
<jsp:setProperty property="author" name="b"/>
<jsp:setProperty property="title" name="b"/>
<jsp:setProperty property="password" name="b"/>
<jsp:setProperty property="contents" name="b"/>
<body>
  <h1>INSERT CONTENTS</h1>
  <jsp:getProperty property="author" name="b"/>
  <jsp:getProperty property="title" name="b"/>
  <jsp:getProperty property="password" name="b"/>
  <jsp:getProperty property="contents" name="b"/>
  <%-- ${b.author} --%>
  <%-- AUTHOR:<p>${param.author}</p>
  TITLE:<p>${param.title}</p>
  PASSWORD:<p>${param.password}</p>
  CONTENTS:<p>${param.contents}</p> --%>
</body>
</html>