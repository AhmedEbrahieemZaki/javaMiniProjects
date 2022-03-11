package com.company;

public class Main {
  public static void midPointCircleDraw( int r) {
        int y = r;
        int x = 0;
        int d = 1 - r;
      System.out.println("(" + x + "," + y + ")");
        while (x<y) {
            if (d <= 0) {
                d=d+2*x+3;
                x++;
                System.out.println("(" + x + "," + y + ")");

            }
           else {
                d=d+2*(x-y)+3;
               x++;
               y--;
                System.out.println("(" + x + "," + y + ")");

            }
        }
    }
    public static void main(String[] args) {
	midPointCircleDraw(8);
    }
}
