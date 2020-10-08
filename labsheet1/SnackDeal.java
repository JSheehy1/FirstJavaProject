package labsheet1;

import javax.swing.*;

public class SnackDeal {
    public static void main(String args[])
    {
        String name,course;
        int snack;

        name = JOptionPane.showInputDialog("Please enter your name");
        course = JOptionPane.showInputDialog("Please enter your course");
        snack = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like?"));


        JOptionPane.showMessageDialog(null,"Name: " + name + "\nCourse: " + course + "\nSnacks: " + snack + "\nCost: €" + (snack*2),"Receipt",JOptionPane.INFORMATION_MESSAGE);

    }
}
