import javax.swing.*;

public class Order {

    //Place multi response variables into an array
    private static final String[] WOOD_TYPE = {"PINE", "OAK", "MAHOGANY"};
    private static final int[] WOOD_COST = {100, 224, 310};
    private static final String[] WOOD_SIZE = {"LARGE", "SMALL"};
    private Object tableType;
    private Object tableSize;
    private int tableCost;

    //Constructor which accepts size and wood objects
    public Order(Object sizeType, Object woodtype) {
        tableSize = sizeType;
        tableType = woodtype;

        if (tableType == WOOD_TYPE[0]) {
            tableCost = WOOD_COST[0];
        } else if (tableType == WOOD_TYPE[1]) {
            tableCost = WOOD_COST[1];
        } else {
            tableCost = WOOD_COST[2];
        }
        //add fee for large table
        if (tableSize == WOOD_SIZE[0]) {
            tableCost += 35;
        }
    }

    //Dialog prompts for type of wood in a drop down using array variable
    public static Object getInputWoodType() {
        return JOptionPane.showInputDialog
                (null, "Choose wood:", "Want wood?",
                        JOptionPane.INFORMATION_MESSAGE,
                        null, WOOD_TYPE, WOOD_TYPE[0]);
    }

    //Similar dialog but for table size
    public static Object getInputTableSize() {
        return JOptionPane.showInputDialog
                (null, "Choose a table size:", "How big do you like it?",
                        JOptionPane.INFORMATION_MESSAGE,
                        null, WOOD_SIZE, WOOD_SIZE[0]);
    }

    //Output toString in dialog box
    public Object displayChoice(){
        return JOptionPane.showConfirmDialog(null,
                this.toString(),"Enjoy your wood.", JOptionPane.DEFAULT_OPTION);
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
