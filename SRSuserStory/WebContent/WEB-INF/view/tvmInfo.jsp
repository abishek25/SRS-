<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<style>
.error{color:red}
</style>
<body>
Ticket Vending Machine
<br><br>
    <form:form action="processForm" modelAttribute="info" >

Name of the card holder: <form:input path="name"/>
<br><br>
Identification number of Tvm card(*): <form:input path="identification"/>
<form:errors path="identification" cssClass="error"/>
<br><br>

Enter number of Trips you want to Recharge for(Enter "0" if opting weekly options below)(*): <form:input path="trips"/>
<form:errors path="trips" cssClass="error"/>
<br><br>
Customize:( if customized in the above column please select "others")
<form:select path="customize">
 <form:option value="Monthly" label="Monthly"/>
 <form:option value="3weeks" label="3weeks"/>
 <form:option value="2weeks" label="2weeks"/>
 <form:option value="1week" label="1week"/>
 <form:option value="others" label="others"/>
</form:select>
<br><br>
Payment Method: 
Credit Card: <form:radiobutton path="payment" value="card"/>
Cash: <form:radiobutton path="payment" value="cash"/>

<br><br>

<input type="submit" />

</form:form>

</body>
</html>