<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Login</title>
<script type="text/javascript">

$(function() {
	
	var path = "";
	
	$('#btn').click(function() {
		
	
		$('.grade').each(function() {
			
			if($(this).prop("checked")){
				path = $(this).val();
			}
			
		});
		
			path = path+"Login";
		
			$('#frm').attr('action',path);
			$('#frm').submit();

	});
	
});

</script>
</head>
<body>

<form action="" id="frm" method="post">
<p>ID: <input type="text" name="id"></p>
<p>PW: <input type="text" name="pw"></p>
<p>학생<input type="radio" class="grade" name="grade" value="student" checked="checked"></p>
<p>교사<input type="radio" class="grade" name="grade" value="teacher"></p>
<input type="button" value="로그인"  id="btn">
</form>
</body>
</html>