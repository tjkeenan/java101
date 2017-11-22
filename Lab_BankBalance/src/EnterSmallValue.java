package textbook.examples;

import java.util.Scanner;

public class EnterSmallValue {

    public static void main(String[] args) {
        int userEntry = 0;
        String message1 = "The number you entered was too high";
        String message2 = "Your computer is locked ";

        final int LIMIT = 3;
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter an integer no higher than "
//                + LIMIT + " > ");
//        userEntry = input.nextInt();
        int counter = 0;
        do {
//        while (userEntry > LIMIT && counter < 3) {
            if (counter != 0) {
                System.out.print(message1 + "\n\n");
            }
            System.out.print("Please enter an integer no higher than "
                    + LIMIT + " > ");
            userEntry = input.nextInt();

        } while (userEntry > LIMIT && counter++ < 3);

        if (counter < 3) {
            System.out.println("You correctly entered " + userEntry);
        } else {
            System.out.println(message2);

        }

    }
}
