<%@page import="jums.UserDataDTO"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    UserDataDTO userdata =(UserDataDTO) request.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        名前:<%=userdata.getName()%><br>
        生年月日:<%=userdata.getBirthday()%><br>
        種別:<%=userdata.getType()%><br>
        電話番号:<%=userdata.getTell()%><br>
        自己紹介:<%=userdata.getComment()%><br>
        以上の内容で登録しました。<br>
    </body>
    <%=jh.home()%>
    </body>
</html>
