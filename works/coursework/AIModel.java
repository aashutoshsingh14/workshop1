/**
 * This is the parent abstract class for all subscription plan's classes.
 *
 * @author (Aashutosh Singh)
 * @version (a version number or a date)
 */


public abstract class AIModel {

    private String modelName;
    private double price;
    private int parameterCount;
    private int contextWindow; 
    private int systemTokens=50;
    
    public AIModel(String modelName, double price, int parameterCount, int contextWindow) {
        this.modelName = modelName;
        this.price = price;
        this.parameterCount = parameterCount;
        this.contextWindow = contextWindow;
    }

    // getter methods for other classes to read these values


    public String getModelName() {
        return modelName;
    }

    
    public double getPrice() {
        return price;
    }

    
    public int getParameterCount() {
        return parameterCount;
    }

  
    public int getContextWindow() {
        return contextWindow;
    }

    
    public abstract String display();

    
    public int calculateTotalToken(String promptText, int outputTokens) {

        String[] words = promptText.split(" ");
        int inputTokens = words.length;
        

        int totalTokens = systemTokens+ inputTokens + outputTokens;

        if (totalTokens > contextWindow) {
            throw new IllegalArgumentException("Total tokens (" + totalTokens + ") exceeds the context window limit of " + contextWindow + " tokens.");
        }

        return totalTokens;
    }
}
