<%@ page language="java" pageEncoding="GBK"%>
<html>
	<head>
	<title>户口本查询页面</title>
	</head>
	<body>
	<div>
		
			<form action="http://localhost:8080/spring/rcp/getHKB" method="post">
				<div >身份证号：
					<div><input name="paras" value="${paras }" id="name"/><input  type="submit" value="查询"></div>
				</div>
			</form>
				<div>返回信息：</div>
				<div><textarea id="showInfo" style="width:600px;height:300px;" >${result }</textarea></div>
	
		
		
	</body>
</html>
