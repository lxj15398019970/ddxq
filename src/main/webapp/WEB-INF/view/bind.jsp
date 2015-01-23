<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/taglibs.jsp" %>
<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <%@include file="common/head.jsp" %>
    <style>
        .am-form-label{
            font-size: 12px;
        }
    </style>
</head>
<body>
<%--header--%>
<header data-am-widget="header" class="am-header am-header-default">
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
            <i class="am-header-icon am-icon-home"></i>
        </a>
    </div>
    <h1 class="am-header-title">
        <a href="#title-link" class="">Amaze UI</a>
    </h1>
</header>
<div class="am-container am-margin-top-sm">
    <form class="am-form">
        <div class="am-form-group">
            <label>邮件</label>
            <select>
                <option value="option1">选项一...</option>
                <option value="option2">选项二.....</option>
                <option value="option3">选项三........</option>
            </select>
        </div>
        <div class="am-form-group">
            <label>您的身份</label>
            <div class="am-g">
            <label class="am-radio-inline">
                <input type="radio" name="docInlineRadio">业主
            </label>
            <label class="am-radio-inline">
                <input type="radio" name="docInlineRadio">物业
            </label>
            </div>
        </div>
        <div class="am-form-group">
            <label for="nicheng">昵称</label>
            <input type="text" class="" id="nicheng" placeholder="">
        </div>
        <div class="am-form-group">
            <label>头像</label>
            <div class="am-g">
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
                <img class="am-circle am-u-sm-3 am-margin-bottom-sm" src="http://7jpqbr.com1.z0.glb.clouddn.com/bw-2014-06-19.jpg?imageView/1/w/1000/h/1000/q/80" width="50" height="50"/>
            </div>
        </div>
        <button type="button" class="am-btn am-btn-primary am-btn-block">主色按钮</button>

    </form>
</div>



<script>
    seajs.use("${ctx}/static/src/js/bind");
</script>
</body>
</html>