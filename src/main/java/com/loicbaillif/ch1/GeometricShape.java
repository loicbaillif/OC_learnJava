package com.loicbaillif.ch1;

public class GeometricShape {
    // Attributes
    private int x;
    private int y;

    //Constructor
    GeometricShape(int x, int y) {
        setX(x);
        setY(y);
    }

    // Getters & Setters
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Methods
    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }
}
