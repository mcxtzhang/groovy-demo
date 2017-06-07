/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */

def srcFile = new File('list.groovy')
srcFile.eachLine {
    line-> println line
}


println srcFile.getBytes()
