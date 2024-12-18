package Figures;

import java.util.Random;

public class Generator {
    public static Square generateSquare() {
        Random rdn = new Random();
        return new Square(rdn.nextInt(1, 100));
    }

    public static Circle generateCircle() {
        Random rdn = new Random();
        return new Circle(rdn.nextInt(1, 100));
    }

    public static Triangle generateTriangle() {
        Random rdn = new Random();
        return new Triangle(rdn.nextInt(1, 100), rdn.nextInt(1, 100));
    }

//    public static double[] getArrayOfCircles() {
//        double[] arrayOfCircles = new double[10];
//        for (int i = 0; i < 10; i++) {
//            Generator.generateCircle();
//            arrayOfCircles[i] = Circle.getArea();
//        }
//        return arrayOfCircles;
//    }

}



