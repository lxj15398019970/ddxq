module.exports = function (grunt) {
    // 项目配置
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),
        uglify: {
            "my_target": {
                "files": {
                    'app/main.min.js': ['src/js/main.js'],
                    'app/bind.min.js': ['src/js/bind.js']
                }
            }
        },
        combo: {
            build: {
                files: [{
                    expand: true,
                    cwd: 'sea-modules/external',
                    src: '**/*.js',
                    dest: 'sea-modules/external',
                    ext: '.js'
                }]
            }
        }
    });
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-cmd-combo');
    // 默认任务
    grunt.registerTask('default', ['uglify','combo']);
}