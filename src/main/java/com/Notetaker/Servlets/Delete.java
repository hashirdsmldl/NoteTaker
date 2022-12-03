/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Notetaker.Servlets;

import com.Notetaker.entity.Note;
import com.Notetaker.helper.FactoryProvider;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author win10
 */
public class Delete extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    
       
        try 
        {
            Session s = FactoryProvider.getFactory().openSession(); 
            Transaction tx = s.beginTransaction();
            int note_id=Integer.parseInt(request.getParameter("note_id").trim());
           Note note=(Note)s.get(Note.class, note_id);
           s.delete(note);
            tx.commit();
             s.close();
            response.sendRedirect("ViewNotes");
      
              }
        catch(Exception e)
        {
            
        }
          
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
