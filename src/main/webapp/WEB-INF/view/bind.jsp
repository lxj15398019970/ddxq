<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/taglibs.jsp" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>绑定小区</title>
    <%@include file="common/head.jsp" %>

    <style>
        #chosen-select-box {
            width: 300px;
            margin: 10px;
        }
    </style>


</head>
<body>


<%--<!-- Button trigger modal -->--%>
<%--<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">--%>
<%--Launch demo modal--%>
<%--</button>--%>

<%--<!-- Modal -->--%>
<%--<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">--%>
<%--<div class="modal-dialog">--%>
<%--<div class="modal-content">--%>
<%--<div class="modal-header">--%>
<%--<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span--%>
<%--class="sr-only">Close</span></button>--%>
<%--<h4 class="modal-title" id="myModalLabel">Modal title</h4>--%>
<%--</div>--%>
<%--<div class="modal-body">--%>

<%--</div>--%>
<%--<div class="modal-footer">--%>
<%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
<%--<button type="button" class="btn btn-primary">Save changes</button>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>


<div class="container">

    <form class="form-horizontal" role="form" style="margin-top: 20px">
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
                <input type="text" class="form-control" id="head" placeholder="Password">
            </div>
        </div>


        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="button" class="btn btn-primary">提交</button>
            </div>
        </div>
    </form>


</div>





<script>
    seajs.use("${ctx}/static/src/js/bind")
    seajs.use("${ctx}/static/sea-modules/external/jquery/1.11.1/chosen.jquery.min.js")
</script>
</body>
</html>