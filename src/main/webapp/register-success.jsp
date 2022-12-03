<%-- 
    Document   : register-success
    Created on : Nov 28, 2022, 3:30:44 AM
    Author     : win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
           <%@include file='all_js_css.jsp' %>
    </head>
    <body>
         <%@include file='header.jsp' %>
         <div class="container">
              <%  
             if((Boolean)request.getAttribute("condition"))
            {%>
            <h1 class="subtitle">
                Successfully Added !!
            </h1>
            
             <%}

              %>
             <div class="card">
                 
                 <div class="card-content mt-5">
                     
                     <a href="ViewNotes" class="is-primary button" >View Notes</a>
                 </div>
              
             </div>
                            
         </div>
    </body>
</html>
