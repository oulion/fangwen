<%@ page language="java" pageEncoding="GBK"%>
<html>
	<head>
	<title>���ڱ���ѯҳ��</title>
	</head>
	<body>
	<div>
		
			<form action="http://localhost:8080/spring/rcp/getHKB" method="post">
				<div >���֤�ţ�
					<div><input name="paras" value="${paras }" id="name"/><input  type="submit" value="��ѯ"></div>
				</div>
			</form>
				<div>������Ϣ��</div>
				<div><textarea id="showInfo" style="width:600px;height:300px;" >${result }</textarea></div>
	
		
		
	</body>
</html>
