<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.1/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script type="text/javascript">
	function clear() {
		$("input[name='id']").val('');
		$("input#password").val('');
	}
	$(function() {
		$("input[type='button']").click(
				function() {
					if ($("input[name='id']").val().length == 0
							|| $("input#password").val().length == 0) {
						alert('id or passCheck');
						clear();
						return false;
					}
					$("form[name='frm']").submit();
				});
	});
</script>
</head>
<body topmargin="100">
	<form action="jquery9_result.jsp" name="frm">
		<table cellpadding="0" cellspacing="0" width="22%" align="center"
			border="1">
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" id="id"></td>
			</tr>
			<tr>
				<td>PW</td>
				<td><input type="password" name="password" id="password"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="Send"></td>
			</tr>

		</table>

	</form>
</body>
</html>