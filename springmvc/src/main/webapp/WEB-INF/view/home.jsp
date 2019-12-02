<%@page import="com.ustglobal.productspringmvc.dto.ProductBean"%>
<%@page import="com.ustglobal.productspringmvc.dto.RetailerBean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	RetailerBean bean = (RetailerBean) session.getAttribute("bean");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<fieldset>
		<a href="./changepassword">Change Password</a> <br> <a
			href="./logout">LogOut</a> <br>
		<h3>
			Welcome
			<%=bean.getRetailerName()%>
			to DataBase
		</h3>
		<legend>Search Employee</legend>
		<form action="./search">
			<table>
				<tr>
					<td>Enter product Id to search:</td>
					<td><input type="text" name="orderId" required="required"></td>
					<td><input type="submit" value="search"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<%
		ProductBean productBean = (ProductBean) request.getAttribute("bean");
	%>
	<%
		if (productBean != null) {
	%>

	<table border="1px">
		<tr>
			<th>Order Id</th>
			<th>Product Name</th>
			<th>Price per unit</th>
			<th>product Quantity</th>
			<th>Amount payable</th>
			<th>Retailer Id</th>
		</tr>
		<tr>
			<td><%=productBean.getOrderId()%></td>
			<td><%=productBean.getProductName()%></td>
			<td><%=productBean.getPricePerUnit()%></td>
			<td><%=productBean.getProductQuantity()%></td>
			<td><%=productBean.getAmountPayable()%></td>
			<td><%=bean.getRetailerId()%></td>
		</tr>
	</table>

	<%
		}
	%>

	<h4 style="color: red">${message}</h4>
</body>
</html>