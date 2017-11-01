import javax.swing.*;

public class Order {

    private final String[] woodArray = {"Pine", "Oak", "Mahogany"};
    private final int[] priceArray = {100, 225, 310};
    private boolean tableLarge;
    String myString;

    int inputType;
    int inputSize;

    public Order(){
        getInputType();
        getInputSize();

        switch(getInputType()){
            case 1:
               myString = woodArray[0];
               break;
            case 2:
                myString = woodArray[1];
                break;
            case 3:
                myString = woodArray[2];
                break;
        }
    }


    public int getInputType() {
        return Integer.parseInt(JOptionPane.showInputDialog("Table Type?"));
    }

    public void setInputType(int inputType) {
        this.inputType = inputType;
    }

    public int getInputSize() {
        return Integer.parseInt(JOptionPane.showInputDialog("Table Size?"));
    }

    public void setInputSize(int inputSize) {
        this.inputSize = inputSize;
    }
}
