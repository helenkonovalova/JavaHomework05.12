package Figures;

public class Circle extends Figure {
    private int radius;

    public Circle(int width) {
        super(width);
        radius = width / 2;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void findFigureArea() {
        this.setArea(Math.PI * radius * radius);

    }


    }

