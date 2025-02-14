package com.mylearnings.programs.solid;

public class LisovSubstutionalPrinciple {
}

//Bad Idea
class Rectangle {
    protected int width, height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = this.height = height;
    }
}

// Good Practice
interface ShapeInt {
    int getArea();
}

 class RectangleShape implements ShapeInt {
    private int width, height;

    public RectangleShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
 class SquareShape implements ShapeInt {
    private int side;

    public SquareShape(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}
