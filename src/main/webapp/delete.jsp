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
  text-align:center; padding-top: 20%;margin-left: auto;margin-right:auto;">

<script type="text/javascript">
  function validate(){
      var nam=document.f1.bk.value;
     
      
      if(nam!=""){
          document.getElementById("namelocation").innerHTML="correct";
          status= false;

      }
      else{
          document.getElementById("namelocation").innerHTML=alert("plz enter proper values");
          status=true;
      }
     
  }
  </script>

<form action="delete" name="f1" onsubmit="return validate()">

BookName
<input type="text" name="bk"><br><span id="namelocation" style="color:red;"></span>



<input type="submit" value="delete">

</form>

</body>
</html>