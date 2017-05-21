<%-- 
    Document   : datesousa2
    Created on : 2017/05/09, 11:16:08
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <%
// 受け取るパラメータの文字コード
request.setCharacterEncoding("UTF-8");
// テキストボックスの情報
String name=request.getParameter("txtName");
// ラジオボタンの情報
String sex=request.getParameter("rdoSample");
// テキストエリアの情報
String hobby=request.getParameter("mulText");

out.print(name);
out.print(sex);
out.print(hobby);
%>
    </body>
</html>
