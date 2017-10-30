package com.mcxtzhang.xml

import groovy.util.slurpersupport.GPathResult

/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */
//第一步，创建XmlSlurper类
def xparser = new XmlSlurper()
def targetFile = new File("test.xml")
//轰轰的GPath出场
GPathResult gpathResult =xparser.parse(targetFile)

//开始玩test.xml。现在我要访问id=4的book元素。
//下面这种搞法，gpathResult代表根元素response。通过e1.e2.e3这种
//格式就能访问到各级子元素....
def book4 = gpathResult.value.books.book[3]
println book4
//得到book4的author元素
def author = book4.author

//再来获取元素的属性和textvalue
println author.text()
println author.@id
println author['@id']


author.@id.toInteger() == 4

def androidManifest = new XmlSlurper().parse("AndroidManifest.xml")
println androidManifest['@android:versionName']

println androidManifest.@'android:versionName'

println androidManifest.application.activity[1]['@android:name']

println androidManifest.application.activity[0].text()