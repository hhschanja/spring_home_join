<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>${member.id}</p>
<p>${member.pw}</p>
<p>${member.name}</p>
<p>${member.age}</p>
<p>${member.grade}</p>

<c:if test="${member.grade=='student'}">
<p>${member.phone}</p>
<p>${member.tid}</p>
</c:if>

<c:if test="${member.grade=='teacher'}">
<p>${member.subject}</p>
<p>${member.hiredate}</p>
</c:if>

</body>
</html>