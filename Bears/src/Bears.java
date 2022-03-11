import java.util.Scanner;

public class Bears {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int limak= input.nextInt();
        int bob = input.nextInt();
        int yearsNumber=0;
        while (limak <= bob){
            limak*=3;
            bob*=2;
            yearsNumber++;
        }

        System.out.println(yearsNumber);
    }
}
