<%@page import="jums.UserDataBeans"%>

<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper" %>
<%
    HttpSession hs = request.getSession();
    UserDataBeans data = new UserDataBeans();
    if(session.getAttribute("DATE") != null){
     data = (UserDataBeans)request.getAttribute("DATE");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録画面</title>
    </head>
    <body>
    <form action="insertconfirm" method="POST">
        名前:
        <%if(data.getName()==null){%>
        <input type="text" name="name" value="">
        <br><br>
         <% }else{ %>
        <input type="text" name="name" value="<%=data.getName()%>">
        <br><br>
         <%}%>
         
        生年月日:
        <%if(data.getYear()==null){%>
        <select name="year">
            <option value="">----</option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%> </option>
            <% } %>
        </select>年
         <% }else{ %>
          <select name="year">
              <option value=""><%=data.getYear()%></option>
            <%
            for(int i=1950; i<=2010; i++){ %>
            <option value="<%=i%>"> <%=i%> </option>
            <% } %>
            
        </select>年<%}%>
        
        <%if(data.getMonth()==null){%>
        <select name="month">
            <option value="">--</option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>月
         <% }else{ %>
        <select name="month">
            <option value=""><%=data.getMonth()%></option>
            <%
            for(int i = 1; i<=12; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>月<%}%>
        
        
        <%if(data.getDay()==null){%>
        <select name="day">
            <option value="">--</option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>日
        <br><br>
        <% }else{ %>
        <select name="day">
            <option value=""><%=data.getDay()%></option>
            <%
            for(int i = 1; i<=31; i++){ %>
            <option value="<%=i%>"><%=i%></option>
            <% } %>
        </select>日
        <br><br><%}%>

        種別:
        <%if(data.getType()==null){%>
        <br>
        <input type="radio" name="type" value="1">エンジニア<br>
        <input type="radio" name="type" value="2">営業<br>
        <input type="radio" name="type" value="3">その他<br>
        <br>
        <%}else if(data.getType()=="1"){%>
        <br>
        <input type="radio" name="type" value="1"checked>エンジニア<br>
        <input type="radio" name="type" value="2">営業<br>
        <input type="radio" name="type" value="3">その他<br>
        <br>
        <%}else if(data.getType()=="2"){%>
         <br>
        <input type="radio" name="type" value="1">エンジニア<br>
        <input type="radio" name="type" value="2"checked>営業<br>
        <input type="radio" name="type" value="3">その他<br>
        <br>
        <%}else{%>
        <br>
        <input type="radio" name="type" value="1">エンジニア<br>
        <input type="radio" name="type" value="2">営業<br>
        <input type="radio" name="type" value="3"checked>その他<br>
        <br><%}%>
         
         

        電話番号:
        <%if(data.getTell()==null){%>
        <input type="text" name="tell" value="">
        <br><br>
        <%}else{%>
        <input type="text" name="tell" value="<%=data.getTell()%>">
        <%}%>

        

        自己紹介文
        <%if(data.getComment()==null){%>
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"></textarea><br><br>
        <%}else{%>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%=data.getComment()%></textarea><br><br>
        <%}%>
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
    </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
