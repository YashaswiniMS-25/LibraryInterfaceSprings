<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;margin-top:auto;text-align: center;background-image: url('library.jpg');background-repeat:no-repeat;
  background-attachment:fixed;  
  background-size: cover;
  text-align:center; padding-top: 20%;">
  
  <script type="text/javascript">
  function validate(){
      
      var bknm=document.f1.bknm.value;
      
      var pr=document.f1.pr.value;
      
      if(bknm!="" &&pr!=""){
          document.getElementById("namelocation").innerHTML="correct";
          status= false;

      }
      else{
          document.getElementById("namelocation").innerHTML=alert("plz enter proper values");
          status=true;
      }
     
  }
  

  </script>
  
  
  
  
  
  
  
  
<form action="update"name="f1" onsubmit="return validate()">
<table style="margin-left: auto;margin-right:auto;">
<tr>
<td>Bookname</td>
<td><input type="text" name="bknm"><br><span id="namelocation" style="color:red;"></span></td>

</tr>
<tr>
<td>Price</td>
<td><input type="text" name="pr"><span id="namelocation" style="color:red;"></span></td>


</tr>



</table>


<input type="submit" value="update">
</form>

</body>
</html>