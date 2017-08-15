<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>

<body><center>
<p>EMIDS Page</p>
<table>

 <tr>
    <td><input type="text" class="text" id="name" maxlength="100"><br>Name:</td>
    <td><input type="text" class="text" id="name" maxlength="100"><br>Gender:</td>
    <td><input type="text" class="text" id="name" maxlength="100"><br>Age:</td>

    <td><input type=checkbox name=health VALUE=hypertension> Hypertension <BR>
        <input type=checkbox name=health VALUE=bloodpressure> Blood Pressure <BR>
        <input type=checkbox name=health VALUE=overweight> Overweight <BR>
        <input type=checkbox name=health VALUE=bloodsugar> Blood Sugar <BR></td>
        
    <td><input type=checkbox name=habits VALUE=smoking> Smoking <BR>
        <input type=checkbox name=habits VALUE=alcohol> Alcohol <BR>
        <input type=checkbox name=habits VALUE=dailyexercise> Daily Exercise <BR>
        <input type=checkbox name=habits VALUE=drugs> drugs <BR></td>

    
    
    
    <td><span class="value"><button id="submit">Submit</button></span></td>
 </tr>
  
</table>
</center>
</body>
</html>