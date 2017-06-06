package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jums.JumsHelper;
import jums.UserDataDTO;

public final class resultdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");
    HttpSession hs = request.getSession();

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JUMSユーザー情報詳細画面</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>詳細情報</h1>\n");
      out.write("        名前:");
      out.print( udd.getName());
      out.write("<br>\n");
      out.write("        生年月日:");
      out.print( udd.getBirthday());
      out.write("<br>\n");
      out.write("        種別:");
      out.print( udd.getType());
      out.write("<br>\n");
      out.write("        電話番号:");
      out.print( udd.getTell());
      out.write("<br>\n");
      out.write("        自己紹介:");
      out.print( udd.getComment());
      out.write("<br>\n");
      out.write("        登録日時:");
      out.print( udd.getNewDate());
      out.write("<br>\n");
      out.write("        \n");
      out.write("       <input type=\"hidden\" name=\"name\"  value=\"");
      out.print( udd.getName());
      out.write("\">\n");
      out.write("         <input type=\"hidden\" name=\"birthday\"  value=\"");
      out.print( udd.getBirthday());
      out.write("\">\n");
      out.write("         <input type=\"hidden\" name=\"type\"  value=\"");
      out.print( udd.getType());
      out.write("\">\n");
      out.write("         <input type=\"hidden\" name=\"tell\"  value=\"");
      out.print( udd.getTell());
      out.write("\">\n");
      out.write("         <input type=\"hidden\" name=\"comment\"  value=\"");
      out.print( udd.getComment());
      out.write("\">\n");
      out.write("         <input type=\"hidden\" name=\"date\"  value=\"");
      out.print( udd.getNewDate());
      out.write("\">\n");
      out.write("        <input type=\"submit\" name=\"delete\" value=\"削除\"style=\"width:100px\">\n");
      out.write("        <form action=\"Update\" method=\"POST\">\n");
      out.write("        <input type=\"hidden\" name=\"id\" value=\"");
      out.print( udd.getUserID());
      out.write("\">\n");
      out.write("        <input type=\"submit\" name=\"update\" value=\"変更\"style=\"width:100px\">\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Delete\" method=\"POST\">\n");
      out.write("         <input type=\"hidden\" name=\"id\" value=\"");
      out.print( udd.getUserID());
      out.write("\"> \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}