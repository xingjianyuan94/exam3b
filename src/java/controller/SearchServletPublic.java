/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbHelpers.SearchQueryPublic;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author xingjianyuan
 */
@WebServlet(name = "SearchServletPublic", urlPatterns = {"/searchPublic"})
public class SearchServletPublic extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchServletPublic</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchServletPublic at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //Pass execution on to doPost
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        //Get the text to search
        String ANIMALNAME = request.getParameter("searchValPublic");
        
        
        
        //Create a ReadQuery helper object
        SearchQueryPublic sq = new SearchQueryPublic();
        
        //Get the HTML table from the SearchQuery object
        sq.doSearch(ANIMALNAME);
        String table1 = sq.getHTMLTable1();
        
        //Pass execution control to read.jsp along with the table
        request.setAttribute("table1", table1);
        String url = "/readPublic.jsp";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
        

    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
