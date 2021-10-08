package com.pattern.structure.bridge;

public class Linux implements OS {

    private Image _image;

    public Linux(Image image) {
        this._image = image;
    }

    @Override
    public void doPaint() {
        System.out.println("linux操作系统");
        _image.Drawing();
    }

}
