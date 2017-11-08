import javax.swing.*;

public class FurnitureTest {
    public static void main(String[] args) {
        int prompt = 0;

        while (prompt == 0) {
            Object typeWood = Order.getInputWoodType();
            if (typeWood != null) {
                Object typeSize = Order.getInputTableSize();
                Order tableOrder = new Order(typeSize, typeWood);
                System.out.println(tableOrder.toString());
                prompt = JOptionPane.showConfirmDialog(null,
                        "Get price for another table?");
            } else {
                System.out.println("You need wood!");
                break;
            }
        }
    }
}