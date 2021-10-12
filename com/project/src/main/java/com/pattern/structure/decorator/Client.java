package com.pattern.structure.decorator;

public class Client {
    public static void main(String[] args) {
        PaperDecorator paperDecorator = new PaperDecorator(new Paper());
        paperDecorator.display();

        PictureDecorator pictureDecorator = new PictureDecorator(new Picture());
        pictureDecorator.display();
    }
}
