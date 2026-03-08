
/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel
{
    private String modelName;
    private double price;
    private int parameters;
    private int contextWindow;

    private int systemTokens = 50;

    public AIModel(String modelName, double price, int parameters, int contextWindow)
    {
        this.modelName = modelName;
        this.price = price;
        this.parameters = parameters;
        this.contextWindow = contextWindow;
    }

    public String getModelName()
    {
        return modelName;
    }

    public double getPrice()
    {
        return price;
    }

    public int getParameters()
    {
        return parameters;
    }

    public int getContextWindow()
    {
        return contextWindow;
    }

    public int calculateTokenUsage(int inputTokens, int outputTokens)
    {
        int totalTokens;

        totalTokens = systemTokens + inputTokens + outputTokens;

        return totalTokens;
    }

    public boolean checkContextLimit(int inputTokens, int outputTokens)
    {
        int total;

        total = calculateTokenUsage(inputTokens, outputTokens);

        if(total > contextWindow)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public String display()
    {
        return "Model Name: " + modelName +
               "\nPrice (NPR per 1L tokens): " + price +
               "\nParameters (billions): " + parameters +
               "\nContext Window: " + contextWindow;
    }
}