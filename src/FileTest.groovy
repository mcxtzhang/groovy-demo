import groovy.io.FileType

/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */

/*def srcFile = new File('learn.list.groovy')
srcFile.eachLine {
    line-> println line
}


println srcFile.getBytes()*/

/*def  oldFilename = ~"tem*"
String newFilename = "new.groovy"

new File(oldFilename).renameTo(newFilename)*/

//1 创建目录
File dir = new File("./temp360/")
if (!dir.exists()) {
    dir.mkdirs()
}

//2 将360加固后apk放入该目录

//3 从该目录取出apk，重命名
dir.traverse(type: FileType.FILES,
        nameFilter: ~/.*\.txt/
) {
    println it
    String newFilePath = "./"
    String newFilename = "new.groovy"
    it.renameTo(newFilePath + newFilename)
}
//4 删除目录
if (dir.exists()) {
    dir.delete()
}

