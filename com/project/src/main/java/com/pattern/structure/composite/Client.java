package com.pattern.structure.composite;

public class Client {
    public static void main(String[] args) {
        Folder folder1 = new Folder("主文件夹");

        Folder folder = new Folder("我的文件夹");
        Text text = new Text("1");
        Text text1 = new Text("2");
        Text text2 = new Text("3");
        Text text3 = new Text("4");
        folder.AddFile(text);
        folder.AddFile(text1);
        folder.AddFile(text2);
        folder.AddFile(text3);
        folder.AddFile(text3);
        folder1.AddFile(folder);
        folder1.AddFile(text1);
        folder.GetChild();
        folder1.GetChild();
    }
}
