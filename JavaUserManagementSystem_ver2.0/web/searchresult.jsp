<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
   
    ArrayList<UserDataDTO> dto = (ArrayList<UserDataDTO>)request.getAttribute("resultData");
   UserDataDTO udd = new UserDataDTO();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <% if (dto.size() == 0){ %>
              <h2>該当するデータがありません</h2>
           <%}else{%>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>
            <% for(int i = 0; i < dto.size(); i++){
                 udd = dto.get(i);
            %>
            <tr>
                <td><a href="ResultDetail?id=<%= udd.getUserID()%>"><%= udd.getName()%></a></td>
                <td><%= udd.getBirthday()%></td>
                <td><%= jh.exTypenum(udd.getType())%></td><%--種別は数字で取り扱っているので画面に表示するときは日本語に変換--%>
                <td><%= udd.getNewDate()%></td>
            </tr>
            <%}%>
        </table>
        <%}%>
    </body>
    <%=jh.home()%>
</html>
