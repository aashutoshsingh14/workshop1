package week17;


/**
 * Write a description of class MainLauncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.SwingUtilities;

public class MainLauncher {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                Student s1 = new Student("1", "Ram", "Computing");
                Student s2 = new Student("2", "Hari", "Networking");

                new IDCardWindow(s1);
                new IDCardWindow(s2);
            }

        });

    }
}