package Figures;

public class Figure {
    private int width;
    private static double area;

    public Figure(int width) {
        this.width = width;
    }

    public static double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public void findFigureArea(){

    }

}
