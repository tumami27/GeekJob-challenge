<%-- 
    Document   : db12
    Created on : 2017/05/18, 17:29:12
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
             out.println("<p>ユーザー名とパスワードを入力してログインして下さい。</p>");

       

      
        Object status = session.getAttribute("status");
////////////////////////////////////////////////////////////////
        if (status != null){
            out.println("<p>認証に失敗しました</p>");
            out.println("<p>再度ユーザー名とパスワードを入力して下さい</p>");

            session.setAttribute("status", null);
        }
            
            %>

        
        <form action="./db12" method="post">
           名前 <input type="text" name="textname"> <br> <br>
            
           パスワード <input type="text" name="textpassword"> <br> <br>
            <input type="submit" name="btnsubmit" value="送信">
        </form>      
    </body>
</html>
