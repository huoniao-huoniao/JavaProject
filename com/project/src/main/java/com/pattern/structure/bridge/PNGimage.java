package com.pattern.structure.bridge;

public class PNGimage implements Image {

    @Override
    public void Drawing() {
        System.out.println("PNG图片");
    }

}
