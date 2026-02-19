package weekeleven;


/**
 * Write a description of class crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop
{
    private String cropName;
    private String season;
    private double landArea;

    public Crop(String cropName, String season, double landArea)
    {
        this.cropName = cropName;
        this.season = season;
        this.landArea = landArea;
    }

    public String getCropName()
    {
        return cropName;
    }

    public void setCropName(String cropName)
    {
        this.cropName = cropName;
    }

    public String getSeason()
    {
        return season;
    }

    public void setSeason(String season)
    {
        this.season = season;
    }

    public double getLandArea()
    {
        return landArea;
    }

    public void setLandArea(double landArea)
    {
        this.landArea = landArea;
    }

    abstract double calculateYield();

    abstract double calculateWaterRequirement();

    void displayCropInfo()
    {
        System.out.println("Crop Name: " + getCropName());
        System.out.println("Season: " + getSeason());
        System.out.println("Land Area : " + getLandArea());
        System.out.println("Yield: " + calculateYield());
        System.out.println("Water Requirement: " + calculateWaterRequirement());
    }
}
