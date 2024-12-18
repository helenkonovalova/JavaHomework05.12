package Figures;

public class Main {
    public static void main(String[] args) {
        //Circle[] circles = new Circle[10];
            Circle circle = Generator.generateCircle();
            circle.findFigureArea();
            System.out.println(circle.getArea());
            //System.out.println(Arrays.toString(Generator.getArrayOfCircles()));
            //Square square = new Square(5);
            Square square = Generator.generateSquare();
            square.findFigureArea();
            System.out.println(square.getArea());
            //Triangle triangle = new Triangle(5, 7);
            Triangle triangle = Generator.generateTriangle();
            triangle.findFigureArea();
            System.out.println(triangle.getArea());

        }
    }

