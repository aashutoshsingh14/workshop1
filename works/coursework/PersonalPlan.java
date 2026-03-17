
/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    private int monthlyQuota;

    public PersonalPlan(String modelName, double price, int parameters, int contextWindow, int quota)
    {
        super(modelName, price, parameters, contextWindow);
        this.monthlyQuota = quota;
    }

    public int getMonthlyQuota()
    {
        return monthlyQuota;
    }

    public String buyPrompts(int amount)
    {
        if(amount <= 0)
        {
            return "Enter positive value or upgrade to Pro plan.";
        }

        monthlyQuota = monthlyQuota + amount;

        return "Prompts purchased. New quota: " + monthlyQuota;
    }

    public String usePrompt(int inputTokens, int outputTokens)
    {
        if(monthlyQuota <= 0)
        {
            return "Monthly quota reached.";
        }

        boolean allowed;

        allowed = checkContextLimit(inputTokens, outputTokens);

        if(allowed == true)
        {
            monthlyQuota = monthlyQuota - 1;//was inluded after identifying logical error

            int total = calculateTokenUsage(inputTokens, outputTokens);

            return "Prompt executed successfully.\nTotal Tokens Used: " + total +"\nRemaining prompts: " + monthlyQuota;
        }
        else
        {
            return "Prompt rejected. Context limit exceeded.";
        }
    }

    public String display()
    {
        return super.display() +
               "\nRemaining Monthly Prompts: " + monthlyQuota;
    }
}