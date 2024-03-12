<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연락처 전달</title>
</head>
<body>
<h1>HEllo java</h1>
<h3>연락처를 적어주세요</h3>
<form action = "contact" method = "post">
<label>이름</label>
<input type="text" name = "name"> <br>
<label>이메일</label>
<input type="text" name = "email"> <br>
<button type = "reset">취소</button>
<button type = "submit">전송</button>
</form>
</body>
</html>