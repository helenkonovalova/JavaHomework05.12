package Figures;

public class Triangle extends Figure{
    private int side1;
    private int side2;
    private int height;

    public Triangle(int width, int height){
        super(width);
        this.height = height;
    }
    public Triangle(double area, int width, int side1, int side2, int height) {
        super(width);
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void findFigureArea() {
        if (height != 0) {
            this.setArea(super.getWidth() * this.height / 2.0);
        } else {

            int p = (super.getWidth() + side2 + side1) / 2;
            int side3 = this.getWidth();
            this.setArea(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3)));
        }
    }
}

