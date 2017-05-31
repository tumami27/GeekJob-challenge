<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%
    HttpSession hs = request.getSession();
    UserDataBeans data = (UserDataBeans)session.getAttribute("DATE");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
        //タスク４
    <% if(! data.getName().equals("")
        &&!data.getYear().equals("")
        &&!data.getMonth().equals("")
        &&!data.getDay().equals("")
        &&!data.getType().equals("")
        &&!data.getTell().equals("")
        &&!data.getComment().equals("")){ %>
       
        <h1>登録確認</h1>
        名前:<%= hs.getAttribute("name")%><br>
        生年月日:<%= hs.getAttribute("year")+"年"+hs.getAttribute("month")+"月"+hs.getAttribute("day")+"日"%><br>
        種別:<%= hs.getAttribute("type")%><br>
        電話番号:<%= hs.getAttribute("tell")%><br>
        自己紹介:<%= hs.getAttribute("comment")%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        </form>
    <% }else{ %>
        <h1>入力が不完全です</h1>
        //タスク４
     <%  if(data.getName().equals("")){
         out.print("名前の項目が未入力です");
        }
      %>
       <%  if(data.getYear().equals("")){
         out.print("年の項目が未入力です");
        }
      %>
      <%  if(data.getMonth().equals("")){
         out.print("月の項目が未入力です");
        }
      %>
      <%  if(data.getDay().equals("")){
         out.print("日の項目が未入力です");
        }
      %>
       
       <%  if(data.getType().equals("")){
         out.print("種別の項目が未入力です");
        }
      %>
      <%  if(data.getTell().equals("")){
         out.print("電話番号の項目が未入力です");
        }
      %>
      <%  if(data.getComment().equals("")){
         out.print("自己紹介の項目が未入力です");
        }
      %>
      <%}%>
      
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
            
        </form>
    </body>
</html>
