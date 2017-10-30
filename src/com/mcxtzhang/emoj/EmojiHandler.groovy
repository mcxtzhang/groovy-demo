package com.mcxtzhang.emoj
/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/9.
 * History:
 */

/*String oldFilename = "learn.test.groovy"
String newFilename = "new.groovy"

new File(newFilename).renameTo(oldFilename)*/

new File(".").eachFile {   //这里的 File 表示的是一个路径
    println "源文件名："+it.getName();  //eachFile() 列出的每一项是一个 File 实例
    def index = it.getName().indexOf('_')
    if(index>-1){
        def emojiTag = it.getName().subSequence(index+1,it.getName().length());
        def newName = "emoji_"+emojiTag;
        println "新文件名:"+newName;
        println "脚本名称："+  "sEmojisMap.put(0x$emojiTag, R.drawable.$newName);"
        new File(it.getName()).renameTo(newName)
    }

}