
package com.Notetaker.Servlets;

import com.Notetaker.entity.Note;
import com.Notetaker.helper.FactoryProvider;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class AddNotes1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          boolean x=false;
              PrintWriter out = response.getWriter();
              String title=request.getParameter("title");
              String content=request.getParameter("content");
              
         Note note=new Note(title,content,Date.valueOf(LocalDate.now()));
          Transaction tx=null;
            try (Session session = FactoryProvider.getFactory().openSession()) {
                 tx=session.beginTransaction();
                 session.save(note);
                tx.commit();
                x=true;
                request.setAttribute("condition", x);
            }
        
        catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
        }
       
        RequestDispatcher dispatcher = request.getRequestDispatcher("register-success.jsp");
        dispatcher.forward(request, response);
       
          
        
       
    }

   
   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    
}
