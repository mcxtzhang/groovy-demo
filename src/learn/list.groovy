package learn
/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/2.
 * History:
 */

/*println('hello groovy')
def int i = 11;
println(i.getClass().getCanonicalName())*/

//List变量由 []定义,其元素可以是任何对象。
def aList = ["a",2,true]
//变量存取，不用担心越界
println(aList[5])
aList.add("shabi")
println aList
//assert aList[1] == 'string'
assert aList[5]==null
aList[99] = 99
assert aList[99]==99//自动扩容了
println(aList.size())//100 个元素
println aList