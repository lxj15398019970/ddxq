seajs.config({
    // 基础路径
    base: "../static/sea-modules/",
    // 别名配置
    alias: {
        "jquery": "jquery/1.11.1/jquery.min",
        "bootstrap": "bootstrap/3.3.0/js/bootstrap.min"
    },
    // 预先加载
    preload: ['jquery','bootstrap'],
    //map,批量更新时间戳
    map: [[/^(.*\.(?:css|js))(.*)$/i, '$1?v=' + new Date().getTime() ]],
    // 文件编码
    charset: 'utf-8'
});