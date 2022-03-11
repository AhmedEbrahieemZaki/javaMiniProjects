import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int Number=0;
        Scanner scanner =new Scanner(System.in);

        while (Number!=10){
            System.out.println("Guess another number");
            Number= scanner.nextInt();
        }
        System.out.println("Congratulation "+Number+" is the lottery winner Number");
    }
}
