/**
 * This class will have attributes for temperature and description.  It will output 
 * what the day is like based on these attributes.  
 * 
 * NOTE:  THIS CLASS SHOULD USE COMPOUND CONDITIONS
 * 
 * @author BJ
 * @since 2014-11-10
 */
public class Weather {
    
    private String description;
    private int temperature;
    
    /**
     * This custom constructor will set the attributes in the class.
     * 
     * @param description
     * @param temperature 
     * 
     * @since 2014-11-10
     * @author BJ MacLean
     */
    public Weather(String description, int temperature){
        this.description = description;
        this.temperature = temperature;
    }
    
    /**
     * This method should contain the logic associated with determining the description
     * for the day.  
     * 
     * - "it is an OK day" if it is not raining and the weather is between 5 and 15 degrees. NORAIN >=5 <=15
     * * - "it is a nice day" if the temperature is over 15 degrees and it is not raining. NORAIN | > 15
     * * - "it is a great day" if it is "sunny" and over 25 degrees. NORAIN > 25
     * - "it is a terrible day"  if it is raining and below 5 degrees. RAIN < 5
     * - "it is rainy" if it is raining but not below 5 degrees. RAIN > 5
     * 
     * @since 2014-11-10
     * @author BJ MacLean
     */
    public String getDayDescription(){
        
        //selection needed here

        String output = "";

        if (this.temperature > 25 && this.description.equalsIgnoreCase("SUNNY")) {
            output += "it is a great day";
        } else if ((this.temperature > 15 && !this.description.equalsIgnoreCase("RAINY")) && !(description.equalsIgnoreCase("SUNNY"))) {
            output += "it is a nice day";
        } else if (this.temperature <= 5 && !this.description.equalsIgnoreCase("RAINY") && (temperature >= 15 && !description.equalsIgnoreCase("RAINY"))) {
            output += "it is an okay day";
        } else if (this.temperature < 5 && this.description.equalsIgnoreCase("RAINY")) {
            output += "it is a terrible day";
        } else if (this.temperature > 5 && this.description.equalsIgnoreCase("RAINY")) {
            output += "it is rainy";
        } else {
            output += "can not figure out weather";
        }
        return output;
    }
    
    /**
     * Return the description of the class.
     * @return a days description
     * @since 2014-11-10
     * @author BJ MacLean
     */
    public String toString(){
        //use the method getDayDescription() in this method.
        return getDayDescription();
    }
}
