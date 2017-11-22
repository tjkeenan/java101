import javax.swing.*;

public class BabySittingCreate {

    public static void main(String[] args) {
        BabySittingJob job1 = new BabySittingJob(145,2,2,2);
        System.out.println(job1);
        int year = 0;

        do {
            year = Integer.parseInt(JOptionPane.showInputDialog("Year me"));
        } while (year < 2013 || year > 2025);

    }

}

