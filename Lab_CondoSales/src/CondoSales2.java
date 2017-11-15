import java.util.Scanner;

public class CondoSales2 {

    private final int PARK_VIEW_TYPE = 1;
    private final int GOLF_VIEW_TYPE = 2;
    private final int LAKE_VIEW_TYPE = 3;

    private final int PARK_VIEW_PRICE = 150000;
    private final int GOLF_VIEW_PRICE = 170000;
    private final int LAKE_VIEW_PRICE = 210000;

    private final String PARK_VIEW_DESC = "Park View";
    private final String GOLF_VIEW_DESC = "Lake View";
    private final String LAKE_VIEW_DESC = "Golf View";

    private final int GARAGE_TYPE = 1;
    private final int GARAGE_PRICE = 5000;
    private final String GARAGE_DESC = "Garage";

    private final int PARKING_SPACE_TYPE = 2;
    private final int PARKING_SPACE_PRICE = 0;
    private final String PARKING_SPACE_DESC = "Parking space";

    Scanner input = new Scanner(System.in);

    private int userChoice;
    private int parkingChoice;
    private String condoDesc;
    private int condoPrice;
    private String parkingDesc = "Invalid code";

    ;

    //Default constructor
    public CondoSales2() {

        this.getUserInfo();
    }

    public void getUserInfo() {
        //Create app menu
        String menu = "Summerdale Condo Sales" + System.lineSeparator() + System.lineSeparator()
                + "*********Condo Types*************" + System.lineSeparator() + System.lineSeparator()
                + "(" + PARK_VIEW_TYPE + ") - " + PARK_VIEW_DESC + " - $" + PARK_VIEW_PRICE + System.lineSeparator()
                + "(" + GOLF_VIEW_TYPE + ") - " + GOLF_VIEW_DESC + " - $" + GOLF_VIEW_PRICE + System.lineSeparator()
                + "(" + LAKE_VIEW_TYPE + ") - " + LAKE_VIEW_DESC + " - $" + LAKE_VIEW_PRICE + System.lineSeparator()
                + System.lineSeparator();
        //Capture user input
        System.out.println(menu);
        System.out.println("Please enter condo type");
        userChoice = Integer.parseInt(input.nextLine());

        //Determine condo type and price
       
        //Determine parking choice
       

    }

    @Override
    public String toString() {

        return "" ;
    }

}
