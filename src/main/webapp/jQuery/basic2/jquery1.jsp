<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
<script type="text/javascript">
  function checkElement(state){
	  $("input[name='lesson']").each(function(){
			this.checked=state;
		});
  }
	$(function(){
		$("input[type='checkbox']").click(function(){
			console.log(this.value+' '+$(this).val());
			/* if($(this).is(":checked")){
				
			} */
			$(this).is(":checked")?$("span#sr").append("<b>"+$(this).val()+"선택</b><br>"):
				$("span#sr").append("<b>"+$(this).val()+"비선택</b><br>")
		});
		$("button").eq(0).click(function(){   //전체갯수
			$("span#totalCt").text($("input[name=lesson]").length+'개');
		});
		$("button").eq(1).click(function(){   //선택갯수
			$("span#choiceTotal").text($("input[name=lesson]:checked").length+'개');
		});
		$("input#total").click(function(){
			//$(this).is(':checked')
			checkElement($(this).is(":checked"));
		});
	});
</script>
</head>
<body>
<form action="jquery1_result.jsp">

<fieldset style="width: 60%;">
<legend>Lesson</legend>
	<div>
		<input type="checkbox" name="total" value="total" id="total">전체
		<input type="checkbox" name="lesson" value="java">Java
		<input type="checkbox" name="lesson" value="oracle">Oracle
		<input type="checkbox" name="lesson" value="jsp">Jsp
		<input type="checkbox" name="lesson" value="spring">Spring
		<button>전체갯수</button>
		<button>선택갯수</button>
		<input type="submit" value="전송">
	</div>
</fieldset>
</form>
<span id="sr"></span>전체갯수:<span id="totalCt"></span> 선택갯수:<span id="choiceTotal"></span>
</body>
</html>