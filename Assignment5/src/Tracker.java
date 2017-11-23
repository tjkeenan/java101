public class Tracker {
    public static void main(String[] args) {
        //input
        //name
        //# of boxes
        //The number of boxes must be between 1 and 50 (inclusive).

//        Pickers newPicker = new Pickers();
//        newPicker.getPickerName();

        Pickers picker1 = getData();
        System.out.println(picker1.toString());
    }

    private static Pickers getData() {
        Pickers newPicker = new Pickers();
        do {
            newPicker.setPickerName(newPicker.inputValidator("Name"));
            //Check for x
            if (!newPicker.pickerName.equalsIgnoreCase("x")) {
                //Check for boxes >1 <50
                do {
                    //Capture boxes picked
                    newPicker.setBoxCount(newPicker.intValidator("# of Boxes"));
                    //Increase picker counter
                    newPicker.setPickerCount(1);
                    //Check for top picker
                    if (newPicker.boxCount > Pickers.boxTopCount ){
                        //Set Top picker name
                        newPicker.setPickerLeader(newPicker.pickerName);
                        //Set boxTopCount
                        newPicker.setBoxTopCount(newPicker.boxCount);
                    } else if (newPicker.boxCount == Pickers.boxTopCount){
                        //Output tied names
                        newPicker.setPickerLeader(Pickers.pickerLeader + "&" + newPicker.pickerName + " tied");
                    };
                } while (newPicker.boxCount < 1 || newPicker.boxCount > 51);
                //Update total boxes
                newPicker.setBoxTotal(); }
        } while (!newPicker.pickerName.equalsIgnoreCase("x"));

        return newPicker;
    }

}
