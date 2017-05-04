package controller;

import dbHelpers.UpdateQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.EndangeredAnimals;


@WebServlet(name = "UpdateServlet", urlPatterns = {"/updateAnimal"})
public class UpdateServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //pass execution on to doPost
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //get the form data and set up an Animal object
        int ANIMALID = Integer.parseInt(request.getParameter("animalid"));
        String ANIMALNAME = request.getParameter("animalname");
        String SCIENTIFICNAME = request.getParameter("scientificname");
        String STATUS = request.getParameter("status");
        String LOCATION = request.getParameter("location");
        String HABITAT= request.getParameter("habitat");
        
        EndangeredAnimals animal = new EndangeredAnimals();
        animal.setANIMALID(ANIMALID);
        animal.setANIMALNAME(ANIMALNAME);
        animal.setSCIENTIFICNAME(SCIENTIFICNAME);
        animal.setSTATUS(STATUS);
        animal.setLOCATION(LOCATION);
        animal.setHABITAT(HABITAT);
        
        //create an UpdateQuery and use it to update the friend
        UpdateQuery uq = new UpdateQuery();
        uq.doUpdate(animal);
        
        //pass control to the ReadServlet
        String url ="/read";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
        
        

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
