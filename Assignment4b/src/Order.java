import javax.swing.*;

public class Order {
    private Object tableType;
    private Object tableSize;
    private int tableCost = 0;

    public Object getInputWoodType() {
        return JOptionPane.showInputDialog
                (null, "Choose wood:", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null, WOOD_TYPE, WOOD_TYPE[0]);
    }

    public Object getInputTableLarge() {
        return JOptionPane.showInputDialog
                (null, "Choose a table size:", "Input",
                        JOptionPane.INFORMATION_MESSAGE, null, WOOD_SIZE, WOOD_SIZE[0]);
    }


}
