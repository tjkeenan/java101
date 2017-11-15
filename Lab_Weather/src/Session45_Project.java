/**
 * This project will contain practice for selection structures. It will focus on
 * if statements with single conditions, compound conditions, nested if
 * statements, and switch statements.
 *
 * @author BJ
 * @since 2014-11-10
 */
public class Session45_Project {

    public static void main(String[] args) {

        /**
         * ***
         * Part 1. Complete the Weather class constructor. Also complete the
         * toString() method for the Weather class. The weather class toString
         * should display 
         * - "it is a nice day" if the temperature is over 15
         * degrees and it is not raining. 
         * - "it is an OK day" if it is not raining and the weather is between 5 and 15 degrees. 
         * - "it is a terrible day" if it is raining and below 5 degrees. 
         * - "it is rainy" if it is raining but not below 5 degrees.
         * - "it is a great day" if it is "sunny" and over 25 degrees.
         *
         ****
         */
        
        //Weather 
        //Test 1
        System.out.println("****************************************************");
        System.out.println("Starting the testing using Weather class");
        System.out.println("****************************************************");
        Weather weatherTest1 = new Weather("rainy", 12);
        System.out.println("About to show details for rainy and 12 degrees");
        System.out.println(weatherTest1);

        //Test 2
        Weather weatherTest2 = new Weather("sunny", 32);
        System.out.println("****************************************************");
        System.out.println("About to show details for sunny and 32 degrees");
        System.out.println(weatherTest2);

        //Test 3
        Weather weatherTest3 = new Weather("cloudy", 16);
        System.out.println("****************************************************");
        System.out.println("About to show details for cloudy and 16 degrees");
        System.out.println(weatherTest3);

        //Weather2 
        //Test 1
        System.out.println("****************************************************");
        System.out.println("Starting the testing using Weather2 class");
        System.out.println("****************************************************");
        Weather2 weather2Test1 = new Weather2("rainy", 12);
        System.out.println("About to show details for rainy and 12 degrees");
        System.out.println(weather2Test1);

        //Test 2
        Weather2 weather2Test2 = new Weather2("sunny", 32);
        System.out.println("****************************************************");
        System.out.println("About to show details for sunny and 32 degrees");
        System.out.println(weather2Test2);

        //Test 3
        Weather2 weather2Test3 = new Weather2("cloudy", 16);
        System.out.println("****************************************************");
        System.out.println("About to show details for cloudy and 16 degrees");
        System.out.println(weather2Test3);

        
                //Weather 
        //Test 1
        System.out.println("****************************************************");
        System.out.println("Starting the testing using Weather3 class");
        System.out.println("****************************************************");
        Weather3 weather3Test1 = new Weather3("rainy", 12);
        System.out.println("About to show details for rainy and 12 degrees");
        System.out.println(weather3Test1);

        //Test 2
        Weather3 weather3Test2 = new Weather3("sunny", 32);
        System.out.println("****************************************************");
        System.out.println("About to show details for sunny and 32 degrees");
        System.out.println(weather3Test2);

        //Test 3
        Weather3 weather3Test3 = new Weather3("cloudy", 16);
        System.out.println("****************************************************");
        System.out.println("About to show details for cloudy and 16 degrees");
        System.out.println(weather3Test3);

    }

}
