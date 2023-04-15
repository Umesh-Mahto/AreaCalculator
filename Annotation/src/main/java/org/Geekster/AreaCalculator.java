package org.Geekster;

public class AreaCalculator {

    Shapes genericShape;

    public AreaCalculator(Shapes genericShape){
        this.genericShape=genericShape;
    }
    void printfn(){
     genericShape.getArea();

    }
}
