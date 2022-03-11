import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " + s );
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        System.out.printf("%-10s%02d%n",s,i);*/
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=scan.next();
            int x=scan.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
        }
        System.out.println("==========");
    }
}
