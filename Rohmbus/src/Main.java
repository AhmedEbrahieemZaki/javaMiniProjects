public class Main {
    public static void main(String[] args) {
Rhombus r1 = new Rhombus(10 , 8);
r1.setAxisX(15);
r1.setAxisY(10);
r1.setSide(20);
double angle;
angle = r1.CalculateAngle();
        System.out.println(r1.CalculateSideOfRohmbus());
        System.out.println(r1.CalaculateRohmbusArea());
        System.out.println(angle);
        angle *= 3.14;
        System.out.println( Math.toDegrees(angle));

}}
