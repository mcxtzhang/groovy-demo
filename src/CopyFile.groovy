/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/7.
 * History:
 */

def srcPath = "./CopyFile.groovy"
def outPath = "./CopyFile_bak.groovy"

def writer = new PrintWriter(new File(outPath))
new File(srcPath).eachLine {line->
    writer.println(line)
}
writer.flush()
writer.close()