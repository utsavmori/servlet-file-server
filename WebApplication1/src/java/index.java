/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author umori1
 */
public class index extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println(" <html>\n  <head> <title>Directory Listing</title>\n" +" <meta charset=\"UTF-8\"> </head>");
       
   out.println("<body><form action=\"downloadserv\" method=\"get\"> ");
       
      Gbls g=new Gbls();
      
      
      /*
      Change Here the path of Directory
      
      */
      
      
            g.setdirpath("D:\\Installers") ;
            
            
          
            
            
              File directory = new File(g.getdirpath());
               File[] fList = directory.listFiles();
                       
             
                for (File file : fList) {
                    if (file.isFile()) {
                        
                       out.println("<input type=\"radio\" name=\"fpath\" value=\""+file.getName()+"\">");
                        out.println("&nbsp;"+file.getName()+"<br>");
                        //files.add(file);
                    } 
                }
                out.println(" <input type=\"submit\" value=\"Download\">\n" +
                    "        </form>\n" +
                    "    </body>\n" +
                    "</html>");

    
    
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
