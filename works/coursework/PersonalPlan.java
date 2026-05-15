public class PersonalPlan extends AIModel {

    private int availableTokens;

    public PersonalPlan(String modelName, double price, int parameterCount, int contextWindow, int availableTokens) {
        super(modelName, price, parameterCount, contextWindow);
        this.availableTokens = availableTokens;
    }

    public int getAvailableTokens() {
        return availableTokens;
    }
    
    public String purchaseTokens(int tokens) {

    if (tokens <= 0) {
        return "Invalid purchase: Please enter a positive number of tokens.";
    }

    
    if (tokens > 1000000) {
        return "Purchase limit exceeded. Please buy a smaller amount of tokens.";
    }

    availableTokens += tokens;

    return "Purchase successful!\n"
         + "Added: " + tokens + " tokens\n"
         + "Total available tokens: " + availableTokens;
}

    public String enterPrompt(String promptText, int outputTokens) {

        int totalTokens;

        try {
            totalTokens = calculateTotalToken(promptText, outputTokens);
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }

        //  Check if enough tokens
        if (totalTokens > availableTokens) {
            return "INSUFFICIENT_TOKENS:" + totalTokens;
        }

        // Deduct tokens
        availableTokens = availableTokens - totalTokens;

        return "Prompt sent! Tokens used: " + totalTokens +
               ". Tokens remaining: " + availableTokens;
    }

    public String display() {
        String details = "";
        details = details + "Plan Type: Personal Plan\n";
        details = details + "Model Name: " + getModelName() + "\n";
        details = details + "Price (NPR per 1 Lakh tokens): " + getPrice() + "\n";
        details = details + "Parameter Count (Billions): " + getParameterCount() + "\n";
        details = details + "Context Window (tokens): " + getContextWindow() + "\n";
        details = details + "Available Tokens: " + availableTokens;
        return details;
    }
}