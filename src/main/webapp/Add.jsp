<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;background-image: url('library.jpg');background-repeat:no-repeat;
  background-attachment:fixed;  
  background-size: cover;
  text-align:center; padding-top: 20%">
  
  <script type="text/javascript">
  function validate(){
      var nam=document.f1.id.value;
      var bknm=document.f1.bknm.value;
      var author=document.f1.atrnm.value;
      var pr=document.f1.price.value;
      
      if(nam!="" && bknm!="" && author!="" && pr!=""){
          document.getElementById("namelocation").innerHTML="correct";
          status= false;

      }
      else{
          //document.getElementById("namelocation").innerHTML=alert("plz enter proper values");
          status=true;
      }
     
  }
  

  </script>
  <h1 style="text-align: center;font-family: Brush Script MT, cursive">Add Book Details</h1>
<form action="add" name="f1" onsubmit="return validate()">
<table style="text-align:center; margin-left: auto;
  margin-right: auto;">
<tr>
<th></th>
<th></th>
</tr>

<tr>


<td>ID:</td>
<td> <input type="text" name="id"/> <span id="namelocation" style="color:red;">
            </span></td>

</tr>
<tr>
<td>BookName:</td>
<td><input type="text" name="bknm"/> <span id="namelocation" style="color:red;">
            </span><br><br></td>
</tr>
<tr>
<td>Author Name:</td>
<td><input type="text" name="atrnm"/> <span id="namelocation" style="color:red;">
            </span></td>
</tr>
<tr>
<td>Price :</td>
<td><input type="text" name="price"/> <span id="namelocation" style="color:red;">
            </span></td>
</tr>


</table>

 <input type="submit" value="Add this book"> <span id="namelocation" style="color:red;">
            </span><br>
 
 
</form>


</body>
</html>