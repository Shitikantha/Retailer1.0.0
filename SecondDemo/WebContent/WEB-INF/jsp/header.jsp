<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
<title>Tag Example</title>
</head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
alert()
$( document ).ready(function() {
	alert( "ss1!" );
	 $.ajax({  
         type : "Get",   
         url : "getAccess.html",   
         /* data : "name=" + name + "&gender=" + gender + "&email="  
           + email + "&phone=" + phone + "&city=" + city,  */ 
         success : function(response) {  
          alert(response);   
         },  
         error : function(e) {  
          alert('Error: ' + e);   
         }  
        });  
     	});
</script>
<body>
<c:set var="userName" scope="session" value="${sessionScope.name}"/>
Hi,<c:out value="${userName}"/>
		<BR>
		<a href="./logout.html">Logout</a><br>

  <fmt:bundle basename="com.situ.SampleDB">
     <td><fmt:message key="${userName}">
     </fmt:message></td>
  </fmt:bundle>
     </body>
     <br>
     <hr>
</html>

