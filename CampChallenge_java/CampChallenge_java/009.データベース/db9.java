/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author guest1Day
 */
@WebServlet(urlPatterns = {"/db9"})
public class db9 extends HttpServlet {

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
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        request.setCharacterEncoding("UTF-8");
        String dID = request.getParameter("textID");
        String dName = request.getParameter("textName");
        String dtell = request.getParameter("texTell");
        String dAge = request.getParameter("textAge");
        String dBirthday = request.getParameter("textBirthday");

        
                 
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet db9</title>");            
            out.println("</head>");
            out.println("<body>");
            try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/challenge_db","matumoto","aaaa");
            
            db_st = db_con.prepareStatement("insert into profile set profilesID=? name=?, age=?, birthday=?");
            db_st.setInt(1,Integer.parseInt(dID));
            db_st.setString(2,"dName");
            db_st.setInt(3,Integer.parseInt(dAge));
            db_st.setString(4,"dBirthday");
            
            db_st.executeUpdate();
             db_data.close();
               db_st.close();
               db_con.close();
            }catch (SQLException e_sql){
                out.print("接続時にエラーが発生しました："+e_sql.toString());
            }catch (Exception e){
                out.print("接続時にエラーが発生しました："+e.toString());
                  }finally{
                if (db_con != null){
            try {
            db_con.close();
            } catch (Exception e_con) {
            System.out.println(e_con.getMessage());
            }
            }
            } 
            out.println("</body>");
            out.println("</html>");
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
