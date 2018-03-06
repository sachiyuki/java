<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

Login Success.

<hr>

<h3>商品在庫は以下になります。</h3>

<input type="submit" value="削除">

<table border="1">
<tr>
	<th></th>
	<th>商品ID</th>
	<th>商品名</th>
	<th>値段</th>
	<th>在庫数</th>
	<th></th>
</tr>
<s:iterator value="itemList">
<tr>
	<td><input type="checkbox"></td>
	<td><s:property value="id"/></td>
	<td><s:property value="itemName"/></td>
	<td><s:property value="itemPrice"/></td>
	<td><s:property value="itemStock"/></td>
	<td>

	<s:form action="ItemAction" name="Edit" method="post">
	<input type="hidden" name="id" value='<s:property value="id"/>'>
	<input type="hidden" name="itemName" value='<s:property value="itemName"/>'>
	<input type="hidden" name="itemPrice" value='<s:property value="itemPrice"/>'>
	<input type="hidden" name="itemStock" value='<s:property value="itemStock"/>'>
	<input type="submit" value="編集">
	</s:form>

	</td>
</tr>
</s:iterator>
</table>


</body>
</html>