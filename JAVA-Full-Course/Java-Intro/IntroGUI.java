import javax.swing.JOptionPane;

public class IntroGUI {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}

// GUI => Graphical User Interface. it is a visual program that we can see and
// interact with dailogue boxes.
// JOptionPane => to create input dailogue box we will use this
// Integer.parseInt => this method is used to convert integer to string
// double.parseDouble => this method is used to convert double to string