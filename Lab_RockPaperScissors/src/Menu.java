import java.util.Scanner;

/**
 * Provide a menu and the ability to enter an option.
 *
 * @author BJ MacLean
 * @since Nov 12, 2014
 */
public class Menu {

    private String prompt;
    private String options;
    private String validOptions;
    private Scanner input;
    
    public Menu(String prompt, String options, String validOptions){
        this.prompt = prompt;
        this.options = options;
        this.validOptions = validOptions;
        input = new Scanner(System.in);
    }

    public String show(){
        System.out.println("****** MENU *********");
        System.out.println(prompt);
        System.out.println(options);
        System.out.print("==>");
        String option = input.nextLine().toLowerCase();
        if(validOptions.contains(option)){
            return option;
        } else {
            System.out.println("Invalid entry");
            return "invalid";
        }
    }
    
}
