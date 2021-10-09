package com.pattern.structure.composite;

import java.util.ArrayList;

public class Folder extends File {

    private ArrayList<File> list;

    public Folder(String Name) {
        super(Name);
        this.list = new ArrayList<File>();
    }

    @Override
    public void GetSize() {
        System.out.println("获取文件夹的大小");
    }

    public void AddFile(File file) {
        boolean repeat = false;
        for (File singlefile : list) {
            if (singlefile.GetName() == file.GetName()) {
                repeat = true;
            }
        }
        if (!repeat || this.list.size() == 0) {
            this.list.add(file);
        } else {
            System.err.println(file.GetName() + ",文件重名请重新添加!");
        }

    }

    public void RemoveFile(File file) {
        this.list.remove(file);
    }

    public void GetChild() {
        for (File file : list) {
            System.out.println(file.GetName());
        }
    }

}
