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
    println it.getName();  //eachFile() 列出的每一项是一个 File 实例
}