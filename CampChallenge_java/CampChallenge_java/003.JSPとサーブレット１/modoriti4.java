/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "modoriti4", urlPatterns = {"/modoriti4"})
public class modoriti4 extends HttpServlet {
   
    String name[] = {"松本", "名前2", "名前3"};
     String birthday[] = {"９月２３", "生年月日2", "生年月日3"};
     String address[] = {"埼玉", null, "住所3"};
     String person (int pId, String pName, String pBirthday){
         String pnb = "";
         pnb = pName + "、" + pBirthday;
         return pnb;
     }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet modoriti4</title>");            
            out.println("</head>");
            out.println("<body>");
            for(int i=0;i<3;i++){
                String[]a=prf(i);
                out.print(a[0]);
                out.print(a[1]);
                
                if(a[2]==null){
                    continue;
                }else{
                    out.print(a[2]);
                }
             }
            
            out.println("</body>");
            out.println("</html>");
        }
    }
  String[]prf(int id){
         String[]prf1={"松本","1991.09.23","埼玉"};
         String[]prf2={"名前１","誕生日１","住所１"};
         String[]prf3={"名前２","誕生日２",null};
         
         if(id==0){
             return prf1;
     }else if(id==1){
             return prf2;
     }else{
             return prf3;
     }
     
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
        processRequest(request, response);
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
