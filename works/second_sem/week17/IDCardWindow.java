package week17;


/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;

public class IDCardWindow extends JFrame {

    public IDCardWindow(Student s) {

        JLabel l = new JLabel(s.showInfo());
        add(l);

        setTitle("ID Card");
        setSize(450, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}