package Figures;

public class Square extends Figure {
    public Square(int width) {
        super(width);

    }

        @Override
        public void findFigureArea(){
            this.setArea(super.getWidth()*super.getWidth());

        }
    }
