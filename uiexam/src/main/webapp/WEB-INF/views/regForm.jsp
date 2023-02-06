<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Reg Form</h1>
<hr>
<form name="frm" action="regist.do" method="post">
	<input type="text" name="sno" value=""><br>
	<input type="text" name="name" value=""><br>
	<input type="text" name="id" required>
	<input type="button" value="id중복확인" ><br>
	<p id="confirmID"></p>
		<input type="hidden" name="c1">
	<input type="text" name="pw" required><br>
	<input type="text" name="confirm_txt" value=""><input type="button" value="재발급">
	<input type="text" name="confirm_input" required><input type="button" value="확인">
	<p id="confirmTxt"></p>
		<input type="hidden" name="c2">
	<input type="submit" value="등록" onclick="regist()">
</form>
<hr>
<script>
	
	function regist(e){
		e.preventDefault();
		if(document.frm.c1.value === 1 && document.frm.c2.value == 1){
			alert("good");
			document.frm.submit();
		}else{
			aler("bad");
			location.href = "regForm";
		}
			
	}
</script>
</body>
</html>