<%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="css/gossip.css" type="text/css">
		<title>會員申請</title>
	</head>
	<body>
	    <h1>會員申請</h1>
	    
        <%
            List<String> errors = (List<String>) request.getAttribute("errors");
            if(errors != null) {
        %>
            <ul style='color: rgb(255, 0, 0);'>
        <%
                for(String error : errors) {
        %>
                    <li><%= error %></li>
        <%
                }
        %>
            </ul>
        <%
            }
        %>
      
		<form method='post' action='register'>
			<table>
				<tr>
					<td>郵件位址：</td>
					<td><input type='text' name='email' value='${param.email}' size='25' maxlength='100'></td>
				</tr>
				<tr>
					<td>名稱（最大 16 字元）：</td>
					<td><input type='text' name='username' value='${param.username}' size='25' maxlength='16'></td>
				</tr>
				<tr>
					<td>密碼（8 到 16 字元）：</td>
					<td><input type='password' name='password' size='25' maxlength='16'></td>
				</tr>
				<tr>
					<td>確認密碼：</td>
					<td><input type='password' name='password2' size='25' maxlength='16'></td>
				</tr>
				<tr>
					<td colspan='2' align='center'><input type='submit' value='註冊'></td>
				</tr>
			</table>
		</form>
	</body>
</html>