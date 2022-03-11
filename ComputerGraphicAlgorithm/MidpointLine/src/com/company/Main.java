package com.company;

public class Main {
    public  static  void drawingMidPoint (int x0 ,int y0 , int x1 , int y1) {
        int dx, dy, p, x, y;
        dx = x1 - x0;
        dy = y1 - y0;
        x = x0;
        y = y0;
        p =  dy - dx/2;
        System.out.println("(" + x + "," + y + ")");
        while (x < x1) {
            if (p >= 0) {
                y = y + 1;
                p = p +  dy -  dx;
            } else {
                p = p +  dy;
            }
            x = x + 1;
            System.out.println("(" + x + "," + y + ")");
        }
    }
    public static void main(String[] args) {
        drawingMidPoint(2,2,10,7);
    }
}
