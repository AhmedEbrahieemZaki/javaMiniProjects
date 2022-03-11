import java.util.Scanner;

public class SEC1 {
    public static void main(String[] args) {
        double division;
        Scanner s= new Scanner(System.in);
        System.out.println("PUT the First NUM");
        int num1= s.nextInt();
        System.out.println("Put Second NUM");
        int num2=s.nextInt();
        division=(double) num1/num2;
        System.out.println(num1+num2);
        System.out.println(num1*num2);
        System.out.println(division);
        System.out.println(num1-num2);
    }
}
