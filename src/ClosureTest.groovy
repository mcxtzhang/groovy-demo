/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/2.
 * History:
 */
//定义闭包
/*def aClosure ={
    String param1,int param2 ->
        println "this is the code :"
}
//调用闭包
aClosure.call("a",1)
aClosure("a",1)*/

//如果闭包没定义参数的话，则隐含有一个参数，it，和this的作用类似。 it 代表闭包的参数。

/*def greeting = {
    "hello $it"
}
println greeting("a")
println greeting.call(1)*/

//闭包使用注意事项：
//1省略圆括号 : 当函数的最后一个参数是闭包的话，可以省略圆括号
/*def iamList= [1,2,3,4,5]
iamList.each {
    println it
}
iamList.each {
    it=it+1
    println it
}
println iamList*/

/*def testClosure(int a1,String b1,Closure closure){
    //调用闭包
    closure()
}
//调用时 可以免括号
testClosure(1,"2",{
    println 'I am closesure'
})
testClosure 1,"2",{
    println 'I am closure without ()'
}*/

//2 确定 closure的参数，只能通过sdk了。
/*def aMap  = [k1:'value1',k2:true]
def result  = aMap.findAll {
    key,value->
        println "key = $key ,value = $value"
        if (key == 'k1')
            return true
        return false
}
println result*/

def closure1 = {
    p1,p2-> println "The params is p1:$p1,p2:$p2"
}
closure1("wtf",2)