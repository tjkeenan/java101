import javax.swing.*;

public class Pickers {

    //input
    //name
    //# of boxes
    //The number of boxes must be between 1 and 50 (inclusive).

    //track
    //box count
    //picker count

    //calc
    //you'll need static variables!
    //avg box count
    //top box count
    //top picker including ties

    //output
    //displayPickerReport() invoked by x for the input name

/*  Required Output
    Ham’s Blueberry Patch

    Daily Summary


    Number of pickers:  3

    Total boxes:  32

    Most productive picker:  John Smith

    Average boxes picked:  10*/

    /* logic
    get name
    if name x output results
    get boxcount
    if boxcount > 50 reask

    if boxcount > boxcount update boxcount & name
    if tie do the same and append names
*/

    int pickerCount, pickerTop, boxCount, boxAvg;
    String pickerName;
    static int boxTotal;

    public int getBoxTotal() {
        return boxTotal;
    }

    public void setBoxTotal() {
        this.boxTotal += boxCount;
    }

    public void setPickerName(String pickerName) {
        this.pickerName = pickerName;
    }

    public String getPickerName() {
        pickerName = JOptionPane.showInputDialog(null, "Name");
        return pickerName;
    }

    public int getPickerCount() {
        return pickerCount;
    }

    public void setPickerCount(int pickerCount) {
        this.pickerCount = pickerCount;
    }

    public int getPickerTop() {
        return pickerTop;
    }

    public void setPickerTop(int pickerTop) {
        this.pickerTop = pickerTop;
    }

    /*
    public void setPickerTopName(String pickerTopName) {
        this.pickerTopName = pickerTopName;
    }*/

    public int getBoxCount() {
        return boxCount += boxCount;
    }

    public void setBoxCount(int boxCount) {
        this.boxCount = boxCount;
    }

    public int getBoxAvg() {
        return boxAvg;
    }

    public void setBoxAvg(int boxAvg) {
        this.boxAvg = boxAvg;
    }

    @Override
    public String toString() {
        return "\nName: " + this.pickerName
                + "\nNumber of Boxes: " + this.boxTotal;
    }

    //Convert String input to int
    public String inputValidator(String inputQuestion) {
        return JOptionPane.showInputDialog(null, inputQuestion);
    }
    public int intValidator(String inputQuestion) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, inputQuestion));
    }
}