import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task {

    public static void insert(String ID,String fName, String lName,String Dept, String GPA, String activity){
        File file = new File("dataBase.csv");
        String newLine = ID+" ; " + fName+" , " + lName+ " , " + Dept+" , " + GPA +" , " + activity  ;
        try {
            PrintWriter   printWriter = new PrintWriter(file);
            printWriter.write(ID);
            printWriter.write(fName);
            printWriter.write(lName);
            printWriter.write(Dept);
            printWriter.write(GPA);
            printWriter.write(activity);
            System.out.println(ID);
        }
        catch (Exception x){
            x.getMessage();
        }
    }
    public static void main(String[] args) {
      insert("2","1","1","1","1","1");

    }
}
