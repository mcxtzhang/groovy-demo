

/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/9.
 * History:
 */

String oldFilename = "test.groovy"
String newFilename = "new.groovy"

new File(newFilename).renameTo(oldFilename)