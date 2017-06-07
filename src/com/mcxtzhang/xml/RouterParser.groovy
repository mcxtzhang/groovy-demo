package com.mcxtzhang.xml
/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */

srcFilePath = "./AndroidManifest.xml"
targetFilePath = "./temp2.json"


def getLaunchActivity() {
    def xmlFile = new File(srcFilePath)
    def rootManifest = new XmlSlurper().parse(xmlFile)
    def result ="";
    rootManifest.application.activity.each { activity ->
        String action = activity."intent-filter".action['@android:name']
        String category = activity."intent-filter".category['@android:name']

        println "android.intent.action.MAIN" == action
        println "android.intent.category.LAUNCHER" == category
        if ("android.intent.action.MAIN" == action
                && "android.intent.category.LAUNCHER" == category) {
            if (result == ""){
                result = activity['@android:name']
                println "ahahhaa :"+result
            }
        }
    }
    return result
}

println getLaunchActivity()



/*GPathResult result = new XmlSlurper().parse(new File(srcFilePath))
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
        body+="\""+key + "\":\"" + value + "\",\n";

    }
    printWriter.println(body.substring(0,body.length()-2))
    printWriter.println("}")
}*/



