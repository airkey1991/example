<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import = "model.SiteEV" %>

<%
SiteEV siteEV = (SiteEV)application.getAttribute("siteEV");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タケシ君のページ</title>
</head>
<body>
<h1>タケシ君のページへようこそ</h1>
<p>
<a href = "/example/TakeshiIndex?action=like">good</a>:<%= siteEV.getLike() %>人
<a href = "/example/TakeshiIndex?action=dislike">bad</a>:<%= siteEV.getDislike() %>人
</p>
<h2>タケシ君とは!?</h2>
<p>…</p>
</body>
</html>