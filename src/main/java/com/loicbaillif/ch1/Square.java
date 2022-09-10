package com.loicbaillif.ch1;

public class Square extends GeometricShape{
    // Attributes
    private long side;

    // Constructor
    Square(int x, int y, long side) {
        super(x, y);
        setSide(side);
    }

    // Getters and Setters
    public long getSide() {
        return this.side;
    }

    public void setSide(long side) {
        this.side = side > 0 ? side : (long) 1;
    }

    // Methods
    public long getPerimeter() {
        return 4 * getSide();
    }
}
