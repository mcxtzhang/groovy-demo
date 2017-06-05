package com.mcxtzhang.groovy

/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/5.
 * History:
 */
class Test {
    String name;
    String title;

    Test(String name, String title) {
        this.name = name
        this.title = title
    }
    def print(){
        println 'My name is :'+name+', tile is :'+title;
    }
}
