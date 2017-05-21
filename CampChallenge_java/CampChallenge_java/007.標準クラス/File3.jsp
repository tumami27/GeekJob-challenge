<%-- 
    Document   : File3
    Created on : 2017/05/08, 19:37:53
    Author     : guest1Day
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="java.io.File"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        Date date = new Date();
          
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH時mm分ss秒");
          String sdate = sdf.format(date);//
          
          File txt = new File("log.txt");
          FileWriter fw = new FileWriter(txt);
          BufferedWriter bw = new BufferedWriter(fw);
          
             bw.write(sdate + "　開始");
             
             bw.write(sdate + "　終了");
             
  bw.close();


          
          %>
          
    </body>
</html>
