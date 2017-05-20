<%-- 
    Document   : challenge1-6
    Created on : 2017/04/25, 12:06:09
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
        String type="2";
        if(type.equals("1")){
            out.print("雑貨");
        }else if(type.equals("2")){
            out.print("生鮮食品");
        }else{
            out.print("その他");
        }
        
        
 
        %>        
    </body>
</html>
