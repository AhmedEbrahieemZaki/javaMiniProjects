import javax.swing.*;
import javax.xml.transform.Result;

public class Test {
    public static void main(String[] args) {
        int g1 = Integer.parseInt(JOptionPane.showInputDialog("Enter  Your First Grade"));
        int g2 = Integer.parseInt(JOptionPane.showInputDialog("Enter  Your Second Grade"));
        int g3 = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Third Grade"));
        float result = (float) ((g1 + g2 +  g3)/3);
        if (result >= 90) {
            JOptionPane.showMessageDialog(null, "YOUR PERCENTAGE IS = "+ result + "= A", "Your Term Grade", 2);
        }else if (result >= 75){
            JOptionPane.showMessageDialog(null,"YOUR PERCENTAGE IS = "+ result + "= B", "Your Term Grade", 1);
    }
        else if (result >= 65){
            JOptionPane.showMessageDialog(null,"YOUR PERCENTAGE IS = "+ result + "= C", "Your Term Grade",3);
        }
        else {
            JOptionPane.showMessageDialog(null,"You failed and you Term grade is "+ result, "Your Term Grade",1);
        }
        }
}
