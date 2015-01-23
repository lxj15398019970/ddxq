<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/taglibs.jsp" %>
<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <%@include file="common/head.jsp" %>
    <style>
        .list li{
            padding: 4px;
        }
        .list img{
            margin: 0;
        }
        .list p.name{
            padding: 0;
            margin: 0;
            text-align: center;
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
<div class="am-container">
    <div class="am-g">
        <div class="am-slider am-slider-default" data-am-flexslider>
            <ul class="am-slides">
                <li><img src="http://s.cn.bing.net/az/hprichbg/rb/CardinalsBerries_ZH-CN10679090179_1366x768.jpg" /></li>
                <li><img src="http://s.cn.bing.net/az/hprichbg/rb/CardinalsBerries_ZH-CN10679090179_1366x768.jpg" /></li>
                <li><img src="http://s.cn.bing.net/az/hprichbg/rb/CardinalsBerries_ZH-CN10679090179_1366x768.jpg" /></li>
                <li><img src="http://s.cn.bing.net/az/hprichbg/rb/CardinalsBerries_ZH-CN10679090179_1366x768.jpg" /></li>
                <li><img src="http://s.cn.bing.net/az/hprichbg/rb/CardinalsBerries_ZH-CN10679090179_1366x768.jpg" /></li>
            </ul>
        </div>
    </div>
    <div class="am-g">
        <div class="am-panel-bd">
            <ul class="am-avg-sm-3 list">
                <li>
                    <img class="am-thumbnail img" src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg" alt="">
                    <p class="name">name</p>
                </li>
                <li>
                    <img class="am-thumbnail img" src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg" alt="">
                    <p class="name">name</p>
                </li>
                <li>
                    <img class="am-thumbnail img" src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg" alt="">
                    <p class="name">name</p>
                </li>
                <li>
                    <img class="am-thumbnail img" src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg" alt="">
                    <p class="name">name</p>
                </li>
                <li>
                    <img class="am-thumbnail img" src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg" alt="">
                    <p class="name">name</p>
                </li>
                <li>
                    <img class="am-thumbnail img" src="http://img4.duitang.com/uploads/blog/201406/15/20140615230220_F5LiM.thumb.224_0.jpeg" alt="">
                    <p class="name">name</p>
                </li>

            </ul>
        </div>
    </div>




    <div class="am-g am-panel-bd">
        <div class="am-tabs" data-am-tabs>
            <ul class="am-tabs-nav am-nav am-nav-tabs">
                <li class="am-active"><a href="javascript: void(0)">流浪</a></li>
                <li><a href="javascript: void(0)">流浪</a></li>
            </ul>

            <div class="am-tabs-bd">
                <div class="am-tab-panel am-active">
                    ...
                </div>
                <div class="am-tab-panel">
                    ...
                </div>
            </div>
        </div>
    </div>
</div>



<script>
    seajs.use("${ctx}/static/src/js/home");
</script>
</body>
</html>