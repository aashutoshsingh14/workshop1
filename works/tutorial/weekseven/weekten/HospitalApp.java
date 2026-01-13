package weekten;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp {

    public static void main(String[] args) {

        Doctor doctor = new Doctor(1, "Dr. Ram", 50000,"Cardiologist", 15000);

        Nurse nurse = new Nurse(2, "Sita", 30000,"Night", 5000);

        System.out.println("Doctor Ko Details ");
        System.out.println(doctor);
        System.out.println("Salary (Normal): " + doctor.calculateSalary());
        System.out.println("Salary (With Emergency Cases): " + doctor.calculateSalary(3));

        System.out.println();

        System.out.println("Nurse Ko Details ");
        System.out.println(nurse);
        System.out.println("Salary: " + nurse.calculateSalary());
    }
}
