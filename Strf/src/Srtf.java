import java.util.Scanner;
public class Srtf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please put number of process  : ");
        int processNumber = input.nextInt();
        if (processNumber<=0)
            System.out.println("put A Positive Number");
        int [] arrivalTime = new int[processNumber];
        int [] burstTime = new int[processNumber];
        for(int i=0 ;i<processNumber;i++){
            System.out.print("enter process" + (i+1) + " Arrival time :");
            arrivalTime [i]= input.nextInt();
            System.out.print("enter process" + (i+1) + " Burst time :");
            burstTime [i]= input.nextInt();
        }
        System.out.println("process " + "Arrival.T  " +"Burst.T");
        for (int i=0; i<processNumber;i++){
            System.out.println((i+1)+"       "+arrivalTime[i] +"          "+burstTime[i]);
        }
        System.out.println("The average Waiting Time  = ");
    }
}
