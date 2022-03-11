import java.util.Scanner;

public class Handling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double num1 = scanner.nextDouble();
       double num2= scanner.nextDouble();

       try  {
           double div= num1/num2;
       }catch (Exception e){
e.getMessage();       }

    }
}
