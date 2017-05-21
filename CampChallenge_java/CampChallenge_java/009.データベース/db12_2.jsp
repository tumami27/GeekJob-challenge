<%-- 
    Document   : db12-2
    Created on : 2017/05/19, 11:28:25
    Author     : guest1Day
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品登録</title>
    </head>
    <body>
        <form action="./db12-2" method="post">
            商品番号 <input type ="number" name ="goodsId"><br>
           
            商品名<input type ="text" name="neme "><br>
           数 <input type ="number" name ="number"><br>
           個数 <input type ="number" name ="price"><br>
            <input type ="submit" name ="btnsubmit" value="送信">
           
        </form>
        
    </body>
</html>
