
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jdkitson
 */
public class PracticalMain {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt for Seller 1 info
        System.out.println("Please enter the student's name:");
        String name = input.nextLine();
        System.out.println("Please enter the number of bars sold:");
        int bars = input.nextInt();
        System.out.println("Please enter the number of magazines sold");
        int mags = input.nextInt();
        input.nextLine();
        // Create Seller 1 using custom constructor Part 2
        Seller seller1 = new Seller(name, bars, mags);

        // Prompt for Seller 2 info
        
        System.out.println("\nPlease enter the student's name:");
        name = input.nextLine();
        System.out.println("Please enter the number of bars sold:");
        bars = input.nextInt();
        System.out.println("Please enter the number of magazines sold");
        mags = input.nextInt();

        // Create Seller 2 from custon constructor Part 3
        Seller seller2 = new Seller(name);
        //Use setters to set other attributes
        seller2.setNumBars(bars);
        seller2.setNumMags(mags);

        /*Seller seller3 = new Seller();
        seller3.setName(name);
        seller3.setNumBars(bars);
        seller3.setNumMags(mags);
         */
        //Show output
        showSummary(seller1);
        showSummary(seller2);
        
    }

    private static void showSummary(Seller sellerObject) {
        
        System.out.println(sellerObject.toString());
    }
    
}
