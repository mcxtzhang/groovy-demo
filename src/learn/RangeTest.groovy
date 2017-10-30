package learn
/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/2.
 * History:
 */
def aRange = 1..5

println aRange
println aRange.getClass().getCanonicalName()

//如果不想包含最后一个元素
def range2 = 1..<5
println range2


def step = aRange.step(2)
println step