package org.Geekster;

public class Rectangle implements Shapes{

    private int length;
    private int breadth;


    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public void getArea()
    {
        System.out.println(length * breadth);
    }

}
