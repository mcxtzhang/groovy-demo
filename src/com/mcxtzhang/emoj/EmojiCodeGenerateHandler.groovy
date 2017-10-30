package com.mcxtzhang.emoj

import java.util.function.Consumer
/**
 * Intro: 
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/6/9.
 * History:
 */

/*String oldFilename = "learn.test.groovy"
String newFilename = "new.groovy"

new File(newFilename).renameTo(oldFilename)*/

def List<EmojiBean> list = new ArrayList<>();

new File("./res/").eachFile {   //这里的 File 表示的是一个路径
    //println "源文件名："+it.getName();  //eachFile() 列出的每一项是一个 File 实例
    def index = it.getName().indexOf('_')
    if (index > -1) {
        def emojiTag = it.getName().subSequence(index + 1, it.getName().length())
        def newName = "emoji_" + emojiTag;
        //println "新文件名:"+newName;
        //println "sEmojisMap.put(0x$emojiTag, R.drawable.$newName);"
        //new File(it.getName()).renameTo(newName)

        list.add(new EmojiBean(index
                , it.getName().substring(0, it.getName().lastIndexOf("."))
                , newName.substring(0,newName.lastIndexOf("."))))

/*        //重命名：
        String newFilePath = "./output/"
        String newFilename = newName
        Files.copy(Paths.get("./res/",it.getName()), Paths.get(newFilePath+newName))
        //it.renameTo(newFilePath + newFilename)*/
    }


}
Collections.sort(list)
list.forEach(new Consumer<EmojiBean>() {
    @Override
    void accept(EmojiBean emojiBean) {
        //println getCodeKeyboard(emojiBean)
        println getCodeTextShow(emojiBean)
    }
})

/**
 * 输出 对应的键盘的代码
 * @param emojiBean
 * @return
 */
String getCodeKeyboard(EmojiBean emojiBean) {
    //Emojicon.fromCodePoint(0x1f604),
    def index = emojiBean.fileName.indexOf('_')
    def emojiTag = emojiBean.fileName.subSequence(index + 1, emojiBean.fileName.length() )
    "Emojicon.fromCodePoint(0x$emojiTag),"
}

/**
 * 得到 emoji 对应的code，显示的 代码
 * @param bean
 * @return
 */
def getCodeTextShow(emojiBean) {
    //sEmojisMap.put(0x1f604, R.drawable.emoji_1f604);
    def index = emojiBean.fileName.indexOf('_')
    def emojiTag = emojiBean.fileName.subSequence(index + 1, emojiBean.fileName.length() )
    "sEmojisMap.put(0x$emojiTag, R.drawable.$emojiBean.newFileName);"
}


