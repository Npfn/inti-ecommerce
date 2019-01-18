<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index page</title>
</head>

<body>

<table width="100%" border ="1" cellspacing="1" cellpadding="1" style="margin-top: 60px">
            <tr>
                <td>
                    <div align="center" style="font-weight: bold; color : darkred;  font-family: sans-serif"> INTI FORMATION <br/>
                        Travaux Pratiques Web Services
                    </div>
                </td>
                </tr>
                    </table>
        <br/>
        <br/>
        
        <span style="font-size:24px;  font-weight:bold; text-align: center; margin-left: 400px; margin-top: 100px; font-family: fantasy;"  > Application e-commerce  </span>
        <hr style="font-weight: bold"/>
        <hr style="font-weight: bold"/>
        <h:form>

            <center> <h:commandButton value="Afficher les cargaisons" action="indexCargaison" style="font-size:15px; font-weight:bold; border-radius: 10px"/> </center>
            <br/>
            <br/>
            <center> <h:commandButton value="Afficher les marchandises" action="indexMarchandise" style="font-size:15px; font-weight:bold; border-radius: 10px; text-align: center" /></center>
            <br/>
            <br/>
            <br/>
            <br/>
        </h:form>
        <h:graphicImage  value = "https://blog.lws-hosting.com/wp-content/uploads/2015/07/boutique-en-ligne.jpg" width="100%"/>

            
            

        <br />


</body>
</html>


