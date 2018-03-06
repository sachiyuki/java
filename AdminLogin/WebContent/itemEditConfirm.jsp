<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>登録する商品情報は以下でよろしいですか。</h3>
<s:form action="ItemEditCompleteAction">
<table>
<tr>
	<td>商品ID</td>
	<td><s:property value="id"/></td>
</tr><tr>
	<td>商品名</td>
	<td><s:property value="newName"/></td>
</tr><tr>
	<td>値段</td>
	<td><s:property value="newPrice"/></td>
</tr><tr>
	<td>在庫</td>
	<td><s:property value="newStock"/></td>
</tr>
</table>
<s:submit value="確認"/>
</s:form>

</body>
</html>