
/**
 * Write a description of class ProPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProPlan extends AIModel
{
    private int teamSlots;

    public ProPlan(String modelName, double price, int parameters, int contextWindow, int teamSlots)
    {
        super(modelName, price, parameters, contextWindow);
        this.teamSlots = teamSlots;
    }

    public String addTeamMember(String name)
    {
        if(teamSlots <= 0)
        {
            return "No available team slots.";
        }

        teamSlots = teamSlots - 1;

        return name + " added to team. Remaining slots: " + teamSlots;
    }

    public String removeTeamMember(String name)
    {
        teamSlots = teamSlots + 1;

        return name + " removed from team. Available slots: " + teamSlots;
    }

    public String usePrompt(int inputTokens, int outputTokens)
    {
        boolean allowed;

        allowed = checkContextLimit(inputTokens, outputTokens);

        if(allowed == true)
        {
            int total = calculateTokenUsage(inputTokens, outputTokens);

            return "Prompt executed successfully.\nTotal Tokens Used: " + total +"\nUnlimited prompts available.";
        }
        else
        {
            return "Prompt rejected. Context limit exceeded.";
        }
    }

    public String display()
    {
        return super.display() +"\nAvailable Team Slots: " + teamSlots;
    }
}