import javax.swing.*;

public class Pickers {
    //output
    //displayPickerReport() invoked by x for the input name

    /* logic
    get name
    if name x output results
    get boxcount
    if boxcount > 50 reask

    if boxcount > boxcount update boxcount & name
    if tie do the same and append names
*/

    int pickerTop;
    double boxCount;
    String pickerName;
    static String pickerLeader;
    static int boxTotal;
    static double boxTopCount = 0;
    static double pickerCount = 0;
    static double boxAvg;

    public String getPickerLeader() {
        return pickerLeader;
    }

    public void setPickerLeader(String pickerLeader) {
        this.pickerLeader = pickerLeader;
    }

    public double getBoxTopCount() {
        return boxTopCount;
    }

    public void setBoxTopCount(double boxTopCount) {
        this.boxTopCount = boxTopCount;
    }

    public int getBoxTotal() {
        return boxTotal;
    }

    public void setBoxTotal() {
        this.boxTotal += boxCount;
    }

    public void setPickerName(String pickerName) {
        this.pickerName = pickerName;
    }

    public void setPickerCount(int pickerCount) {
        this.pickerCount += pickerCount;
    }

    public void setBoxCount(int boxCount) {
        boxAvg = (pickerCount / this.boxCount);
        this.boxCount = boxCount;
    }

    public void setBoxAvg(int boxAvg) {
        boxAvg = boxAvg;
    }

    @Override
    public String toString() {
        return "Ham's Blueberry Patch"
                + System.lineSeparator()
                + "\nNumber of pickers: " + this.pickerCount
                + "\nTotal Boxes: " + this.boxTotal
                + "\nMost productive picker: " + this.pickerLeader
                + "\nAverage boxes picked: " + boxAvg;
    }

    //Convert String input to int
    public String inputValidator(String inputQuestion) {
        return JOptionPane.showInputDialog(null, inputQuestion);
    }

    public int intValidator(String inputQuestion) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, inputQuestion));
    }
}