/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/2.
 * History:
 */
//Map变量由[:] 定义   ,key 必须是字符串，value可以是任意对象
def aMap = [key1:null,key2:"hello"]
println(aMap)
println aMap.key1
println aMap['key2']
aMap.newKey = "add a new key"
println aMap

def key3 = "iamkey3"
def map2 = [key3:"value3"]
println map2

def map3 = [(key3):"value3"]
println map3