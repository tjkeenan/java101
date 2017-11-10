import javax.swing.*;

public class FurnitureTest {
    public static void main(String[] args) {
        int prompt = 0;

        while (prompt == 0) {
            Object typeWood = Order.getInputWoodType();
            if (typeWood != null) {
                //Get user input
                Object typeSize = Order.getInputTableSize();
                Order tableOrder = new Order(typeSize, typeWood);
                //Output data to console
                System.out.println(tableOrder.toString());
                //Output to dialog
                tableOrder.displayChoice();
                prompt = JOptionPane.showConfirmDialog(null,
                        "Get price for another table?", "Want more wood?", JOptionPane.YES_NO_OPTION);
            } else {
                //Catch all if no wood is selected
                System.out.println("You need wood!");
                break;
            }
        }
    }
}