package com.pattern.structure.composite;

public class Text extends File {

    public Text(String Name) {
        super(Name);
    }

    @Override
    public void GetSize() {
        System.out.println("获取文本文件大小");
    }

}
