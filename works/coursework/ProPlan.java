
/**
 * This is the child class of AiModel and represents the pro plan logic
 *
 * @author (Aashutosh Singh)
 * @version (a version number or a date)
 */

public class ProPlan extends AIModel {

   private int teamSlots;

    public ProPlan(String modelName, double price, int parameterCount, int contextWindow, int teamSlots) {
        
        super(modelName, price, parameterCount, contextWindow);
        this.teamSlots = teamSlots;
    }

   
    public int getTeamSlots() {
        return teamSlots;
    }

    
    public String addTeamMember(String memberName) {
        if (teamSlots <= 0) {
            return "No team slots available. Please upgrade your plan to add more members.";
        }

       teamSlots = teamSlots - 1;
        return memberName + " has been added to the team. Remaining slots: " + teamSlots;
    }

    
    public String removeTeamMember(String memberName) {
        
        teamSlots = teamSlots + 1;
        return memberName + " has been removed from the team. Available slots: " + teamSlots;
    }

    
    public String enterPrompt(String promptText, int outputTokens) {

        int totalTokens;
        try {
            totalTokens = calculateTotalToken(promptText, outputTokens);
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }

        return "Prompt sent! Tokens used this request: " + totalTokens + ". (Pro Plan - no token deduction)";
    }

    
    public String display() {
        String details = "";
        details = details + "Plan Type: Pro Plan\n";
        details = details + "Model Name: " + getModelName() + "\n";
        details = details + "Price (NPR per 1 Lakh tokens): " + getPrice() + "\n";
        details = details + "Parameter Count (Billions): " + getParameterCount() + "\n";
        details = details + "Context Window (tokens): " + getContextWindow() + "\n";
        details = details + "Team Slots Available: " + teamSlots;
        return details;
    }
}
