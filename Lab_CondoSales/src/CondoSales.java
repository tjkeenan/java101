import java.util.Scanner;

public class CondoSales {

    private final int PARK_VIEW_TYPE = 1;
    private final int GOLF_VIEW_TYPE = 2;
    private final int LAKE_VIEW_TYPE = 3;

    private final int PARK_VIEW_PRICE = 150000;
    private final int GOLF_VIEW_PRICE = 170000;
    private final int LAKE_VIEW_PRICE = 210000;

    private final String PARK_VIEW_DESC = "Park View";
    private final String GOLF_VIEW_DESC = "Lake View";
    private final String LAKE_VIEW_DESC = "Golf View";

    Scanner input = new Scanner(System.in);

    private int userChoice;
    private String condoDesc;
    private int condoPrice;
    
    //Default constructor
    public CondoSales(){
        
        this.getUserInfo();
    }

    public void getUserInfo() {
        //Create app menu
        String menu = "Summerdale Condo Sales" + System.lineSeparator() + System.lineSeparator()
                + "*********Condo Types*************" + System.lineSeparator() + System.lineSeparator()
                + "(" + this.PARK_VIEW_TYPE + ") - " + this.PARK_VIEW_DESC + " - $" + this.PARK_VIEW_PRICE + System.lineSeparator()
                + "(" + this.GOLF_VIEW_TYPE + ") - " + this.GOLF_VIEW_DESC + " - $" + this.GOLF_VIEW_PRICE + System.lineSeparator()
                + "(" + this.LAKE_VIEW_TYPE + ") - " + this.LAKE_VIEW_DESC + " - $" + this.LAKE_VIEW_PRICE + System.lineSeparator()
                + System.lineSeparator();
        //Capture user input
        System.out.println(menu);
        System.out.println("Please enter condo type");
        userChoice = Integer.parseInt(input.nextLine());

        //Determine condo type and price
        switch(this.userChoice){
            case PARK_VIEW_TYPE:
                break;
            case GOLF_VIEW_TYPE:
                break;
            case LAKE_VIEW_TYPE:
                break;
            default:

        }
    }

    @Override
    public String toString() {
        String output = "Condo Selection Pay\n\n";
        output += "";
        return output ;
    }
}
