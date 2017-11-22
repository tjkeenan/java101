import java.util.Scanner;

public class NamesLoop {

    public static void main(String[] args) {

        String output;
        String name = "";
        int numNames = 0;
        String nameOutput = "";

        Scanner input;
        input = new Scanner(System.in);

        while (!name.equalsIgnoreCase("x")){
            System.out.println("Enter Name (" + numNames + "):");
            name = input.next();
            nameOutput += name + " ";

            if (!nameOutput.isEmpty()){
                numNames++;
            }

            if (numNames % 5 == 0){
                nameOutput += System.lineSeparator();
            }

        }

        System.lineSeparator();
        System.out.println("Results:");
        System.lineSeparator();
        System.out.println(nameOutput + "\nCount: " + numNames);

    }
}
