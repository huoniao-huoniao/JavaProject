package com.pattern.structure.bridge;

public class Client {
    public static void main(String[] args) {
        JPGimage jpg = new JPGimage();
        PNGimage png = new PNGimage();
        Windows win = new Windows(jpg);
        win.doPaint();
        Linux lin = new Linux(png);
        lin.doPaint();
    }
}
