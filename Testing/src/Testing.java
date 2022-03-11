import java.util.Scanner;

public class Testing {
    private static  Scanner scanner = new Scanner(System.in);
        public static void main(String[] args) {
            int N = scanner.nextInt();
            if(N%2==1)
                System.out.println("Weird");
         else if (N%2==0 && N<=20 && N>=6){
                System.out.println("Weird");}
          else
            System.out.println("Not Weird");


            scanner.close();
        }


}

