<%-- 
    Document   : viewnotes
    Created on : Nov 28, 2022, 4:20:13 AM
    Author     : win10
--%>

<%@page import="java.util.List"%>
<%@page import="com.Notetaker.entity.Note"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
      <meta charset="utf-8">
     <meta name="viewport" content="width=device-width, initial-scale=1">
     <title>NoteTaker App</title>
      <%@include file='all_js_css.jsp' %>
  
    </head>
    
      <%@include file='header.jsp' %>
      <div class="container">
      <%
     List <Note> notes=(List <Note>) request.getAttribute("notes");
     for(Note s:notes){%>
      <div  class="card "  >
  <div class="card-content mt-5 ">
      <p class="title">
   <%=s.getTitle()%>
    </p>
    <p class="subtitle">
    <%=s.getContent()%>
    </p>
    <p class="color is-primary">
        Published on
    <%=s.getSqlDate()%>
    </p>
  </div>
  <footer class="card-footer  has-background-white">
    <p class="card-footer-item">
      <span>
        <a class="button is-success " href="">Edit</a>
      </span>
    </p>
    <p class="card-footer-item">
      <span>
          <a class="button is-danger " href="Delete?note_id= <%=s.getId()%>">Delete</a>
      </span>
    </p>
  </footer>
</div>
            
            <%}
      %>
      </div>
      <script>
        
     
      var colors = [
  ['#ACDDDE', '#FFE7C7', '#f1f58f']
 
   
];
var card = document.querySelectorAll(".card");
 let colorIndex = Math.floor(Math.random());
   for (i = 0; i < card.length; i++) {
         
        card[i].style.backgroundColor = colors[colorIndex][i];
     
  }
  
          </script>
          
</html>
