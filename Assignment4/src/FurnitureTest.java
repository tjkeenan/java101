import javax.swing.*;

public class FurnitureTest {
    public static void main(String[] args) {
        int prompt = 0;

        while (prompt == 0) {
            Order tableOrder = new Order();
            System.out.println(tableOrder.toString());
            prompt = JOptionPane.showConfirmDialog(null, "Get price for another table?");
        }
    }
}

