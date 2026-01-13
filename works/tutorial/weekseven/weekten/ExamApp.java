package weekten;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp {

    public static void main(String[] args) 
    {

        ScienceStudent scienceStudent =
        new ScienceStudent(1, "Aman", 44);

        ManagementStudent managementStudent =
        new ManagementStudent(2, "Rohit", 38);

        System.out.println(scienceStudent);
        System.out.println("Result: " + scienceStudent.calculateResult());
        System.out.println("Result with grace: " + scienceStudent.calculateResult(3));

        System.out.println();

        System.out.println(managementStudent);
        System.out.println("Result: " + managementStudent.calculateResult());
        System.out.println("Result with grace: " + managementStudent.calculateResult(5));
    }
}
