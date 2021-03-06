<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>绑定小区</title>
    <%@include file="common/head.jsp" %>
</head>
<body>
<div class="container">
    <form class="form-horizontal" role="form" style="margin-top: 20px" action="${ctx}/bind/submit.shtml" method="POST">
        <div class="form-group">
            <label class="col-sm-2 control-label">绑定小区</label>

            <div class="col-sm-10">
                <div id="chosen-select-box">
                    <select class="chosen-select" id="form-field-select-3"
                            data-placeholder="选择一个小区">
                        <option value="1">捷瑞新时代</option>
                        <option value="1">利君明天</option>
                        <option value="1">呵呵呵</option>

                    </select>
                </div>
            </div>

        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">身份选择</label>

            <div class="col-sm-10">
                <label class="radio-inline">
                    <input type="radio" name="identity" id="inlineRadio1" value="0"> 业主
                </label>
                <label class="radio-inline">
                    <input type="radio" name="identity" id="inlineRadio2" value="1"> 物业
                </label>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">昵称</label>

            <div class="col-sm-10">
                <input type="text" class="form-control" id="nickName" placeholder="请输入您的昵称">
            </div>
        </div>


        <div class="form-group">
            <label class="col-sm-2 control-label">头像选择</label>

            <div class="col-sm-10">
                <%--<div>--%>
                <%--<input type="radio" name="image" value="0">--%>
                <%--<img data-src="${ctx}/upload/1.png" alt="..." width="50" height="50">--%>

                <%--</div>--%>
                <div>
                    <input type="radio" name="image" value="0">
                    <img src="${ctx}/upload/1.png" width="50" height="50">
                </div>
                <div>
                    <input type="radio" name="image" value="0">
                    <img src="${ctx}/upload/1.png" width="50" height="50">
                </div>


            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">提交</button>
            </div>
        </div>
    </form>


</div>


<script>
    seajs.use("${ctx}/static/src/js/bind");
</script>
</body>
</html>