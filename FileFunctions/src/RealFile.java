import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class RealFile {
    public static void main(String[] args) {
        try {

             File file= new File("data.txt");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.length());
               Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
            scanner.close();
            if (file.exists())
                System.out.println("True n");
            else
                System.out.println("False");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println("There is an Exception");
        }


    }
}
