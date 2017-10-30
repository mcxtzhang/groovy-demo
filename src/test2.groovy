import learn.test

/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */

def test = new test()
//learn.test.printY() 无法访问 因为y在别的类无法访问
test.printZ()//加上@Field 即可访问


def fileName = "./com/mcxtzhang/xml/temp.txt"
new File(fileName).withPrintWriter { printWriter ->
    printWriter.println('The first content of file22222')
}
