/**
 * This class will have attributes for temperature and description.  It will output 
 * what the day is like based on these attributes.  
 * 
 * NOTE:  THIS CLASS SHOULD PROVIDE THE FUNCTIONALITY USING NESTED IF STATMENTS.
 * 
 * @author BJ
 * @since 2014-11-10
 */
public class Weather2 {
    
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
    public Weather2(String description, int temperature){
        this.description = description;
        this.temperature = temperature;
    }
    
    /**
     * This method should contain the logic associated with determining the description
     * for the day.  
     * 
     * - "it is a nice day" if the temperature is over 15 degrees and it is not raining.
     * - "it is an OK day" if it is not raining and the weather is between 5 and 15 degrees.
     * - "it is a terrible day"  if it is raining and below 5 degrees.
     * - "it is rainy" if it is raining but not below 5 degrees.
     * - "it is a great day" if it is "sunny" and over 25 degrees.
     * 
     * @since 2014-11-10
     * @author BJ MacLean
     */
    public String getDayDescription() {
        String output = "";

        if (description.equals("rainy")) {
            if (temperature >= 5) {
                output += "it is rainy";
            } else {
                output += "it is a terrible day";
            }
        }
        if (description.equals("sunny")) {
            if (temperature >= 25) {
                output += "it is a great day";
            } else {
                if (temperature >= 15) {
                    output += "it is a nice day";
                } else if (temperature >= 5) {
                    output += "it is a terrible day";
                }
            }
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
