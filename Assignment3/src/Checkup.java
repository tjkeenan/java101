/**
 * @author Tom Keenan
 * Topic: CIS_1201_Assignment_3
 * Date: 10/19/17
 * Purpose use getters and setters in a class
 */
package CIS_1201_Assignment_3_tomkeenan;

import javax.swing.JOptionPane;

/**
 *
 * @author tkeenan115063
 */
public class Checkup {

    private int patientId;
    private int systolic;
    private int diastolic;
    private int ldl;
    private int hdl;
    private double ratio;
    
    /**
     * @return the patientId
     */
    public int getPatientId() {
        return patientId;
    }

    /**
     * @param patientId the patientId to set
     */  
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
   
    /**
     * @return the systolic
     */
    public int getSystolic() {
        return systolic;
    }

    /**
     * @param systolic the systolic to set
     */    
    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }
    
    /**
     * @return the diastolic
     */
    public int getDiastolic() {
        return diastolic;
    }

    /**
     * @param diastolic the diastolic to set
     */
    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }
    
    /**
     * @return the ldl
     */
    public int getLdl() {
        return ldl;
    }

    /**
     * @param ldl the ldl to set
     */
    public void setLdl(int ldl) {
        this.ldl = ldl;
    }
    
    /**
     * @return the hdl
     */
    public int getHdl() {
        return hdl;
    }

    /**
     * @param hdl the hdl to set
     */
    public void setHdl(int hdl) {
        this.hdl = hdl;
    }

    //convert int to double
    public double computeRatio() {
        ratio = (double) getLdl() / getHdl();
        return ratio;
    }
    
    public static void explainRatio(){
        System.out.println("HDL is known as “good cholesterol” and that a ratio"
                + " of 3.5 or lower is considered optimum");
    }
    
    //Convert String input to int
    //Doesn't really validate yet, it just makes a string ready to work with.
    public int inputValidator(String inputQuestion) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, inputQuestion));
    }    

}
