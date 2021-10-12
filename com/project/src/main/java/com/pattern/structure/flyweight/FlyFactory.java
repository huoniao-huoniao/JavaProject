package com.pattern.structure.flyweight;

import java.util.HashMap;

public class FlyFactory {

    private static FlyFactory flyFactory = new FlyFactory();

    private static HashMap<String, ImplementsPiece> ht;

    private FlyFactory() {
        ht = new HashMap<String, ImplementsPiece>();
        ht.put("black", new BlackPiece());
        ht.put("white", new WhitePiece());
    }

    public static FlyFactory getInstance() {
        return flyFactory;
    }

    public ImplementsPiece getPiece(String piece) {
        if (piece == "black" || piece == "white") {
            return (ImplementsPiece) ht.get(piece);
        } else {
            System.out.println("输入对象不存在");
            return null;
        }
    }

}
