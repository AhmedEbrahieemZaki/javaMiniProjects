public class Rectangle extends Geometric {
    double x , y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
      public double CalculateRectangleArea( double x,double y){
        return  x*y;
    }
    @Override
    public double CalculateSquarePremiter(double x ,double y){
        return 2*(x+y);
    }
}
