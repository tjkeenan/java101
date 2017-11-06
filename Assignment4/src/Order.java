import javax.swing.*;

public class Order {

    private final String[] WOOD_TYPE = {"PINE", "OAK", "MAHOGANY"};
    private final int[] WOOD_COST = {100, 224, 310};
    private final String[] WOOD_SIZE = {"LARGE", "SMALL"};
    private Object tableType;
    private Object tableSize;
    private int tableCost;

    public Order() {
        //
        tableSize = getInputTableLarge();

        //If table size is selected get size & fee
        if (tableSize != null) {
            //Find type of table
            tableType = getInputWoodType();
            if (tableType == "PINE") {
                tableCost = WOOD_COST[0];
            } else if (tableType == "OAK") {
                tableCost = WOOD_COST[1];
            } else {
                tableCost = WOOD_COST[2];
            }
            //add fee for large table
            tableCost += 35;
        }
    }

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

    @Override
    public String toString() {
        if (tableSize == null) {
            return "No table size selected";
        } else {
            return "The price for a " + this.tableSize
                    + " " + this.tableType
                    + " TABLE is $" + this.tableCost;
        }
    }
}
