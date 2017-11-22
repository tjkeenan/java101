import javax.swing.*;

public class NamesLoopJOption {

    static String output;
    static String name = "";
    static int numNames = 0;
    static String nameOutput = "";

    public static void main(String[] args) {

        while (!name.equalsIgnoreCase("x")){
            //System.out.println("Enter Name (" + numNames + "):");
            name = JOptionPane.showInputDialog("What's your name? (" + numNames + "):");
            nameOutput += name + " ";

            if (!nameOutput.isEmpty()){
                numNames++;
            }

            if (numNames % 5 == 0){
                nameOutput += System.lineSeparator();
            }
        }
        showNames();
    }

    static void showNames() {
        System.lineSeparator();
        System.out.println("Results:");
        System.lineSeparator();
        System.out.println(nameOutput + "\nCount: " + numNames);
    }

}

