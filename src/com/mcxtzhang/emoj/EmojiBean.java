package com.mcxtzhang.emoj;

/**
 * Intro:
 * Author: zhangxutong
 * E-mail: mcxtzhang@163.com
 * Home Page: http://blog.csdn.net/zxt0601
 * Created:   2017/9/26.
 * History:
 */
public class EmojiBean implements Comparable<EmojiBean> {
    public int index;//sort
    public String fileName;
    private String newFileName;

    public EmojiBean(int index, String fileName, String newFileName) {
        this.index = index;
        this.fileName = fileName;
        this.newFileName = newFileName;
    }

    @Override
    public int compareTo(EmojiBean o) {
        return index - o.index;
    }

    @Override
    public String toString() {
        return "EmojiBean{" +
                "index=" + index +
                ", fileName='" + fileName + '\'' +
                ", newFileName='" + newFileName + '\'' +
                '}';
    }
}
