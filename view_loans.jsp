<%@ page import="java.util.*,com.loan.model.Loan" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Loans</title>
</head>

<body>

<h2>Loan Records</h2>

<table border="1">

<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Amount</th>
    <th>Interest</th>
    <th>Status</th>
    <th>Delete</th>
</tr>

<%
List<Loan> list =
(List<Loan>)request.getAttribute("loanList");

for(Loan loan : list){
%>

<tr>

<td><%= loan.getLoanId() %></td>

<td><%= loan.getBorrowerName() %></td>

<td><%= loan.getLoanAmount() %></td>

<td><%= loan.getInterestRate() %></td>

<td><%= loan.getStatus() %></td>

<td>
<a href="../deleteLoan?id=<%= loan.getLoanId() %>">
Delete
</a>
</td>

</tr>

<%
}
%>

</table>

<br><br>

<a href="add_loan.jsp">Add New Loan</a>

</body>
</html>