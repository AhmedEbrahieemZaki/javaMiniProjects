import java.lang.Math;

import static java.lang.Math.round;

public class Dda {
    public static void drawingDDA(int x0,int y0 , int xn , int yn){
        double dx = xn-x0;
        double dy=yn-y0;
        double steps=0;
        double x =x0;
        double y = y0;
        if (dx>dy)
            steps=dx;
        else
            steps=dy;
        double xIncrement=dx/steps;
        double yInrement = dy/steps;
        System.out.println("("+round(x)+","+round(y)+")");
        while (x < xn && y < yn){
            x= x+xIncrement;
            y=y+yInrement;
            System.out.println("("+round(x)+","+round(y)+")");
        }
    }
    public static void main(String[] args) {
        drawingDDA(2,2,10,7);
    }
}
