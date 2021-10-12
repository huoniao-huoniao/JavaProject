package com.pattern.structure.flyweight;

public class Location {
    private String mapX;

    public void setX(String x) {
        this.mapX = x;
    }

    public String getX() {
        return mapX;
    }

    private String mapY;

    public void setY(String y) {
        this.mapY = y;
    }

    public String getY() {
        return this.mapY;
    }

    public Location(String x, String y) {
        this.mapX = x;
        this.mapY = y;
    }
}
