<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="../common/taglibs.jsp" %>
<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <%@include file="common/head.jsp" %>
    <style>
        .am-form-label {
            font-size: 12px;
        }
    </style>

    <style type="text/css">

        /* Apply these styles only when #preview-pane has
           been placed within the Jcrop widget */
           #preview-pane {
            display: block;
            position: absolute;
            z-index: 2000;
            top: 10px;
            right: -280px;
            padding: 6px;
            border: 1px rgba(0, 0, 0, .4) solid;
            background-color: white;

            -webkit-border-radius: 6px;
            -moz-border-radius: 6px;
            border-radius: 6px;

            -webkit-box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.2);
            -moz-box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.2);
            box-shadow: 1px 1px 5px 2px rgba(0, 0, 0, 0.2);
            width: 50;
            height: 50;
        }

        /* The Javascript code will set the aspect ratio of the crop
           area based on the size of the thumbnail preview,
           specified here */
        #preview-pane .preview-container {
            width: 250px;
            height: 170px;
            overflow: hidden;
        }

    </style>


</head>
<body>
<%--header--%>
<header data-am-widget="header" class="am-header am-header-default">
    <div class="error"></div>
    <div class="am-header-left am-header-nav">
        <a href="#left-link" class="">
            <i class="am-header-icon am-icon-home"></i>
        </a>
    </div>
    <h1 class="am-header-title">
        <a href="#title-link" class="">绑定小区</a>
    </h1>
</header>
<div class="am-container am-margin-top-sm">
    <form class="am-form" action="${ctx}/bind/submit.shtml" method="POST" enctype="multipart/form-data">

        <input type="hidden" id="x" name="x"/>
        <input type="hidden" id="y" name="y"/>
        <input type="hidden" id="w" name="w"/>
        <input type="hidden" id="h" name="h"/>

        <div class="am-form-group">
            <label>小区名称</label>
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
                <input type="file" name="image_file" id="image_file" onchange="fileSelectHandler()"/>
                <div style="height: 100px;width: 200px">
                <img id="preview"/>
                </div>

                <div id="preview-pane">
                    <div class="preview-container">
                        <img src="" class="jcrop-preview" alt="" id="pImage"/>
                    </div>
                </div>
            </div>
        </div>
        <button type="submit" class="am-btn am-btn-primary am-btn-block">提交</button>

    </form>
</div>

<script type="text/javascript">


    function fileSelectHandler() {

        var oFile = $('#image_file')[0].files[0];
        $('.error').hide();

        // check for image type (jpg and png are allowed)
        var rFilter = /^(image\/jpeg|image\/png|image\/jpg)$/i;

        if (!rFilter.test(oFile.type)) {
            alert("图片格式非法");
            return false;
        }
////        // check for file size
        if (oFile.size > 1000 * 1024) {
            alert("图片太大,请选择一张小的图片");
            return false;
        }

        // preview element
        var oImage = document.getElementById('preview');
        var pImage = document.getElementById('pImage');

        // prepare HTML5 FileReader
        var oReader = new FileReader();
        oReader.onload = function (e) {
            // e.target.result contains the DataURL which we can use as a source of the image
            oImage.src = e.target.result;
           // e.target.result.
            pImage.src = e.target.result;
            oImage.onload = function () { // onload event handler
                setTimeout(function () {
                    var jcrop_api,
                            boundx,
                            boundy,
                            $preview = $('#preview-pane'),
                            $pcnt = $('#preview-pane .preview-container'),
                            $pimg = $('#preview-pane .preview-container img'),

                            xsize = $pcnt.width(),
                            ysize = $pcnt.height();

                    $('#preview').Jcrop({
                        aspectRatio: 1,
                        onChange: updatePreview,
                        onSelect: updatePreview
                    }, function () {
                        var bounds = this.getBounds();
                        boundx = bounds[0];
                        boundy = bounds[1];
                        // Store the API in the jcrop_api variable
                        jcrop_api = this;
                        // Move the preview into the jcrop container for css positioning
                        $preview.appendTo(jcrop_api.ui.holder);
                    });

                    function updatePreview(c) {
                        $("#x").val(c.x);
                        $("#y").val(c.y);
                        $("#w").val(c.w);
                        $("#h").val(c.h);
                        if (parseInt(c.w) > 0) {
                            var rx = xsize / c.w;
                            var ry = ysize / c.h;

                            $pimg.css({
                                width: Math.round(rx * boundx) + 'px',
                                height: Math.round(ry * boundy) + 'px',
                                marginLeft: '-' + Math.round(rx * c.x) + 'px',
                                marginTop: '-' + Math.round(ry * c.y) + 'px'
                            });
                        }
                    };


                }, 1000);

            };
        };
        oReader.readAsDataURL(oFile);
    }
</script>


<%--<script>--%>
<%--seajs.use("${ctx}/static/src/js/bind");--%>
<%--</script>--%>
</body>
</html>