<%-- 
    Document   : form
    Created on : Nov 26, 2022, 11:54:32 PM
    Author     : win10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
      <title>Add notes</title>
        <%@include file='all_js_css.jsp' %>
        
    </head>
    <body>
       <%@include file='header.jsp' %>
       <div class="container mt-5">
           <form class="box card" action="AddNotes1" method="post">
            <h1 class="title is-text-center"> Add your Notes</h1>
        <div class="field">
  <label class="label">Title</label>
  <div class="control">
      <input name="title" class="input" type="text" placeholder="Enter Title" required>
  </div>
</div>
            <div class="field">
            <label class="label">Content</label>
  <div class="control">
   <textarea name="content" class="textarea" placeholder="e.g. Hello world" required></textarea>
  </div>
</div>
               
      
  
          <button id="hover" type="submit" class="button is-orange  ">Add Here</button>
  

           
        </form>
       </div>
      
    </body>
</html>
