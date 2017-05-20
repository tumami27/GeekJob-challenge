<%-- 
    Document   : challenge1-5
    Created on : 2017/04/25, 12:06:42
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
           int x =  2 ;
           if(x==1){
           out.print("1です");
           }else if(x==2){
            out.print("プログラミングキャンプです");
           }else{
               out.print("その他です");
                   
            
          }
%>             

    </body>
</html>
