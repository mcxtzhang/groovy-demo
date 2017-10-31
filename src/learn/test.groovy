package learn

import com.mcxtzhang.groovy.Test
import groovy.transform.Field

/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */

def test = new Test('zhangxutong','Programmer')
test.print()

/*def x = 1 // 加上 def 或者 类型 ，则是局部变量
def print(){
    println x
}
print()*/

/*y = 1  // 此时相当于函数的参数传递过去的，但是在别的groovy里 不能访问
def printY(){
    println y
}
printY()*/

//使z成为 成员变量  在别的类调用printZ() 时，也能使用 见test2.groovy
@Field z =3
def printZ(){
    println z
    10
}
println printZ()

int x = 1
println x.getClass()




def func(Map map){
    println "Params: $map"
    //println "Param1:$p1,Param2:$p2"
}

func p2:"第二个参数",p1:"第一个参数"

def methodName = "println"

"$methodName" "a"
//输出 a