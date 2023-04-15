package org.Geekster;

public class Main {
    public static void main(String[] args) {

        Triangle t1=new Triangle(5,3);
        Square s1=new Square(10);
        Rectangle r1=new Rectangle(5,4);
        AreaCalculator ac=new AreaCalculator(s1);
        ac.printfn();
    }
}