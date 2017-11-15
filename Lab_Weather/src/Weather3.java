/**
 * This class will have attributes for temperature and description.  It will output 
 * what the day is like based on these attributes.  
 * 
 * NOTE:  THIS VERSION OF THE CLASS SHOULD USE A SWITCH STATMENTS FOR THE DESCRIPTION.  
 * THIS OPTIONS THAT ARE AVAILABLE FOR THE DESCRIPTION ARE "Sunny", "Cloudy", or "Rainy".  An
 * if statement would be used for the temperature component.  
 * 
 * @author BJ
 * @since 2014-11-10
 */
public class Weather3 {
    
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
    public Weather3(String description, int temperature){
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
        String output = "";
        switch (description){
            case "rainy" :
                if (temperature >= 5) {
                    output += "it is rainy";
                } else {
                    output += "it is a terrible day";
                }
                break;
            case "sunny" :
                if (temperature >= 25 ) {
                    output += "it is a great day";
                }
                break;
            default:
                if (temperature >= 15) {
                    output += "it is a nice day";
                } else if (temperature >= 5) {
                    output += "it is an ok day";
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
