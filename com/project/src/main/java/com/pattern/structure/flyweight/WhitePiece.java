package com.pattern.structure.flyweight;

public class WhitePiece implements ImplementsPiece {

    @Override
    public void display(Location location) {
        System.out.println("这是一颗白子" + "位置y:" + location.getY() + "位置x:" + location.getX());
    }

    @Override
    public void getColor() {
        System.out.println("白色");
    }

}