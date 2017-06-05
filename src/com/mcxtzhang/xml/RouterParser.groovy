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

def srcFilePath = "./AndroidManifest.xml"
def targetFilePath = "./temp2.txt"

GPathResult result = new XmlSlurper().parse(new File(srcFilePath))
//println result //这里输出的是<> xxxx</>里的xxx
def String packageName = result.@package
//println packageName

new File(targetFilePath).withPrintWriter { printWriter ->
    printWriter.println("{")
    def String body="";
    result.application.activity.each { activity ->
        def String activityValue = activity['@android:name']
        //println activityValue
        def index = activityValue.lastIndexOf('.')
        //println index

        def key = activityValue.substring(index + 1)
        //println key
        def value = packageName + activityValue
        //println value

        //println key + ":\"" + value + "\","
        body+=key + ":\"" + value + "\",\n";

    }
    printWriter.println(body.substring(0,body.length()-1))
    printWriter.println("}")
}



