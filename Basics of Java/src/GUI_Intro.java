//Graphical User Interface
import javax.swing.JOptionPane;
public class GUI_Intro {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name? ");
        JOptionPane.showMessageDialog(null, "Hello "+name);
        //dialogue box takes string as input
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age?"));
        JOptionPane.showMessageDialog(null,"You are "+age+ " years old");

        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height?"));
        JOptionPane.showMessageDialog(null,"You are "+height+ " cms");

    }
}
