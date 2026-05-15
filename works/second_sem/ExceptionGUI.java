import javax.swing.*;
import java.awt.event.*;

public class ExceptionGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exception GUI");

        JTextField field = new JTextField(10);
        JButton button = new JButton("Check");
        JLabel label = new JLabel();

        JPanel panel = new JPanel();
        panel.add(field);
        panel.add(button);
        panel.add(label);

        frame.add(panel);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(field.getText());
                    label.setText("Number: " + num);
                } catch (NumberFormatException ex) {
                    label.setText("Invalid input!");
                }
            }
        });

        frame.setSize(300,200);
        frame.setVisible(true);
    }
}