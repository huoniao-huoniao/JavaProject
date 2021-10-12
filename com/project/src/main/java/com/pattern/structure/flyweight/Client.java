package com.pattern.structure.flyweight;

public class Client {
    public static void main(String[] args) {

        FlyFactory factory = FlyFactory.getInstance();
        BlackPiece blackPiece = (BlackPiece) factory.getPiece("black");
        BlackPiece blackPiece2 = (BlackPiece) factory.getPiece("black");
        blackPiece.display(new Location("1", "2"));
        blackPiece2.display(new Location("2", "3"));
        if (blackPiece.equals(blackPiece2)) {
            System.out.println("对象一致");
        }
    }
}
