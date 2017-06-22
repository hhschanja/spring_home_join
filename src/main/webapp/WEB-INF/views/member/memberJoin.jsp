<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

$(function() {
	
	var path = "";
	
	$('#btn').click(function() {
		
	
		$('.grade').each(function() {
			
			if($(this).prop("checked")){
				path = $(this).val();
			}
			
		});
		
			path = path+"Join";
		
			$('#frm').attr('action',path);
			$('#frm').submit();

	});
	
});

</script>
</head>
<body>
<form action="" id="frm" method="post" enctype="multipart/form-data">
<p>학생<input type="radio" name="grade" class="grade" value="student" checked="checked"></p>
<p>교사<input type="radio" name="grade" class="grade" value="teacher"></p>

<p>아이디:<input type="text" name="id"></p>
<p>비밀번호:<input type="text" name="pw"></p>
<p>이름:<input type="text" name="name"></p>
<p>나이:<input type="number" name="age"></p>
<p>사진등록: <input type="file" name="mf"></p>

<hr>

<div>
<p>전화번호:<input type="text" name="phone">
<p>tid:<input type="text" name="tid">

<hr>

<p>과목:<input type="text" name="subject">

</div>

<button id="btn">버튼</button>
</form>

</body>
</html>