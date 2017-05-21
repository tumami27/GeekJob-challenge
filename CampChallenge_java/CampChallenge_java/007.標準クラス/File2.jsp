<%-- 
    Document   : File2
    Created on : 2017/05/08, 16:18:41
    Author     : guest1Day
--%>

<%@page import="java.io.FileWriter"%>
<%@page import="java.io.File"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        File fp = new File("test.txt");
        // FileReader作成
    FileReader fr = new FileReader(fp);
    // BufferedReader作成
    BufferedReader br = new BufferedReader(fr);
    // 1行読み出し
    out.print(br.readLine());

    br.close();
    %>

  
    </body>
</html>
