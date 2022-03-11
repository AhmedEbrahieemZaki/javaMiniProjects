import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lotteryNum= scanner.nextInt();
        switch (lotteryNum){
            case  50:
                System.out.println("Congratulation you won 20k EGP");
                break;
            case 99:
                System.out.println("Congratulation you won 10k EGP");
                 break;
            default:
                System.out.println(" good luck with another Number");
                break;

        }
    }
}
