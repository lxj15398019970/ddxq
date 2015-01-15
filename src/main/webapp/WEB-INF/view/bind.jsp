<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>绑定学校</title>
    <!-- Bootstrap -->
    <link href="${ctx}/static/sea-modules/bootstrap/3.3.0/css/bootstrap.min.css?v=${timestamp}"  rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="${ctx}/static/sea-modules/bootstrap/3.3.0/js/html5shiv.min.js?v=${timestamp}"></script>
    <script src="${ctx}/static/sea-modules/bootstrap/3.3.0/js/respond.min.js?v=${timestamp}"></script>
    <![endif]-->
    <script src="${ctx}/static/sea-modules/seajs/seajs/2.1.0/sea.js?v=${timestamp}"></script>
    <script src="${ctx}/static/sea-modules/seajs-config.js?v=${timestamp}"></script>
</head>
<body>
<h1></h1>
<script>
    seajs.use("${ctx}/static/app/bind/bind")
</script>


</body>
</html>