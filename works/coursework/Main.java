
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        PersonalPlan personal = new PersonalPlan("AI-Lite", 10.5, 7, 1000, 2);
        ProPlan pro = new ProPlan("AI-Pro", 20.0, 20, 2000, 3);

        int choice;

        do
        {
            System.out.println("\n==== AI MODEL SYSTEM ====");
            System.out.println("1. Use Personal Plan Prompt");
            System.out.println("2. Buy Personal Plan Prompts");
            System.out.println("3. Use Pro Plan Prompt");
            System.out.println("4. Add Pro Team Member");
            System.out.println("5. Display Plan Info");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            if(choice == 1)
            {
                int inputTokens;
                int outputTokens;

                System.out.print("Enter input tokens: ");
                inputTokens = sc.nextInt();

                System.out.print("Enter output tokens: ");
                outputTokens = sc.nextInt();

                System.out.println(personal.usePrompt(inputTokens, outputTokens));
            }

            else if(choice == 2)
            {
                int amount;

                System.out.print("Enter prompts to buy: ");
                amount = sc.nextInt();

                System.out.println(personal.buyPrompts(amount));
            }

            else if(choice == 3)
            {
                int inputTokens;
                int outputTokens;

                System.out.print("Enter input tokens: ");
                inputTokens = sc.nextInt();

                System.out.print("Enter output tokens: ");
                outputTokens = sc.nextInt();

                System.out.println(pro.usePrompt(inputTokens, outputTokens));
            }

            else if(choice == 4)
            {
                String name;

                sc.nextLine();

                System.out.print("Enter team member name: ");
                name = sc.nextLine();

                System.out.println(pro.addTeamMember(name));
            }

            else if(choice == 5)
            {
                System.out.println("\nPERSONAL PLAN:");
                System.out.println(personal.display());

                System.out.println("\nPRO PLAN:");
                System.out.println(pro.display());
            }

        }
        while(choice != 0);

       
    }
}