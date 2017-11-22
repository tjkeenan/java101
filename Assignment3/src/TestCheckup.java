/**
 * @author Tom Keenan
 * Topic: CIS_1201_Assignment_3
 * Date: 10/19/17
 * Purpose use getters and setters in a class
 */
package CIS_1201_Assignment_3_tomkeenan;

import javax.swing.JOptionPane;

public class TestCheckup {
    //Lazy patient order identifier can't way to do arrays!
    static String patientOrder = "First";
    
    //Create two patients15
    public static void main(String[] args) {
        Checkup patient11 = getData();
        showValues(patient1);
        patientOrder = "Second";
        Checkup patient2 = getData();
        showValues(patient2);
        Checkup.explainRatio();        
    }

    //Gather inputs via JOptionPane and convert string to int
    private static Checkup getData() { 
        Checkup tempPatient = new Checkup();
        tempPatient.setPatientId(tempPatient.inputValidator(patientOrder + " Patient ID: "));
        tempPatient.setSystolic(tempPatient.inputValidator("Enter Systolic: "));
        tempPatient.setDiastolic(tempPatient.inputValidator("Enter Diastolic: "));
        tempPatient.setLdl(tempPatient.inputValidator("Enter Ldl: "));
        tempPatient.setHdl(tempPatient.inputValidator("Enter Hdl: "));
        return tempPatient;
    }
    
    //Output data to console 
    private static void showValues(Checkup patient){       
        String output = patientOrder + " Patient: " + patient.getPatientId()
                + "\n\nBlood Pressure: " + patient.getSystolic() 
                + "/" + patient.getDiastolic()
                + "\n\nCholesterol: " + patient.getLdl()
                + " and " + patient.getHdl()
                + "\n\nCholesterol Ratio: " + patient.computeRatio()
                + "\n\n";
        System.out.println(output);
        
        //Output thank-you msg
        if ("Second".equals(patientOrder)){
            JOptionPane.showMessageDialog(null, "Thank You! "
                    + "Results are in the console", "But Doc, "
                    + "bacon is so good!", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }    
}
