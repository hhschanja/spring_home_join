<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<c:choose>
<c:when test="${empty member}">
<a href="./member/memberJoin">JOIN</a>
<a href="./member/memberLogin">Login</a>
</c:when>
<c:otherwise>
<a href="./member/memberMypage">MyPage</a>
<a href="./member/memberLogout">Logout</a>
</c:otherwise>
</c:choose>

<h1><a href="./member/memberTest">ONLY TEACHER</a></h1>

</body>
</html>
