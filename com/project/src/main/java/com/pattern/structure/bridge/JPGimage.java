package com.pattern.structure.bridge;

public class JPGimage implements Image {

    @Override
    public void Drawing() {
        System.out.println("JPG图片");
    }

}
