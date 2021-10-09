package com.pattern.structure.composite;

public abstract class File {

    private String Name;

    public File(String name) {
        this.Name = name;
    }

    public String GetName() {
        return this.Name;
    }

    public abstract void GetSize();

}
