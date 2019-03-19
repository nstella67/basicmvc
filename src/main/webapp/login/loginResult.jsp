<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8">
		<title>loginResult.jsp</title>
	</head>
	
	<body>
		<h3>* 로그인 결과 *</h3>
		1) JSP<br>
		<%=request.getAttribute("msg") %><br>
		아이디 : <%=request.getAttribute("r_id") %><br>
		비번 : <%=request.getAttribute("r_pw") %><br>
		아이디(세션) : <%=session.getAttribute("s_id") %><br>
		비번(세션) : <%=session.getAttribute("s_pw") %><br>
		
		2) EL<br>
		${mag }<br>
		아이디 : <%=request.getAttribute("r_id") %><br>
		비번 : <%=request.getAttribute("r_pw") %><br>
		아이디(세션) : <%=session.getAttribute("s_id") %><br>
		비번(세션) : <%=session.getAttribute("s_pw") %><br>
	</body>
</html>