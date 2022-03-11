import static java.lang.StrictMath.sqrt;

public class Rhombus extends Geometric {
    double axisX , axisY ;
    double side;
    double angleOfRohmbus;
    double angle;
     public Rhombus (double axisX , double axisY){
         this.axisX =axisX;
         this.axisY=axisY;
     }

    public double getAngleOfRohmbus() {
        return angleOfRohmbus;
    }

    public void setAngleOfRohmbus(double angleOfRohmbus) {
        this.angleOfRohmbus = angleOfRohmbus;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAxisX() {
        return axisX;
    }

    public void setAxisX(double axisX) {
        this.axisX = axisX;
    }

    public double getAxisY() {
        return axisY;
    }

    public void setAxisY(double axisY) {
        this.axisY = axisY;
    }

   public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public  double CalculateSideOfRohmbus (){
        side= sqrt((axisX*axisX) + (axisY*axisY) );
       return side;
    }
    public  double CalculateAngle (){
        angleOfRohmbus =  axisY / side ;
        return  angleOfRohmbus;
    }
    @Override
    public double CalaculateRohmbusArea(){
        return 0.5*axisX*axisY;
    }
}
