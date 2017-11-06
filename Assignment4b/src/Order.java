public class Order {
    private final String[] WOOD_TYPE = {"PINE", "OAK", "MAHOGANY"};
    private final int[] WOOD_COST = {100, 224, 310};
    private final String[] WOOD_SIZE = {"LARGE", "SMALL"};
    private Object tableType;
    private Object tableSize;
    private int tableCost = 0;
    

    public Object getTableType() {
        return tableType;
    }

    public void setTableType(Object tableType) {
        this.tableType = tableType;
    }

    public Object getTableSize() {
        return tableSize;
    }

    public void setTableSize(Object tableSize) {
        this.tableSize = tableSize;
    }

    public int getTableCost() {
        return tableCost;
    }

    public void setTableCost(int tableCost) {
        this.tableCost = tableCost;
    }
}
