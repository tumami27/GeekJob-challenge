<%-- 
    Document   : challenge2-9
    Created on : 2017/04/26, 11:58:40
    Author     : guest1Day
--%>

<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HashMap<String,String>hMap=new HashMap<String,String>();
        hMap.put("1","AAA");
        hMap.put("hello","world");
        hMap.put("soeda", "33");
        hMap.put("20", "20");
        out.print(hMap.get("1"));
        out.print(hMap.get("hello"));
        out.print(hMap.get("soeda"));
        %>