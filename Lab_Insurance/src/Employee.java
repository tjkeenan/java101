
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jdkitson
 */
public class Employee {

    private int skillLevel;
    private double hoursWorked;
    private double overtimeHours;
    private double regPayRate;
    private int medical;
    private int dental;
    private int disability;
    private int retirementPlan;
    private double regPay;
    private double overtimePay;
    private double grossPay;
    private double medicalCost;
    private double dentalCost;
    private double disabilityCost;
    private double retirementCost;
    private double totalDeductions;
    private double netPay;

    private final int SKILL_LEVEL_1 = 1;
    private final int SKILL_LEVEL_2 = 2;
    private final int SKILL_LEVEL_3 = 3;

    private final double SKILL_LEVEL_1_RATE = 17.00;
    private final double SKILL_LEVEL_2_RATE = 20.00;
    private final double SKILL_LEVEL_3_RATE = 22.00;

    private final int REGULAR_HOURS = 40;
    private final double OVERTIME_RATE = 1.5;

    private final double MEDICAL_COST = 32.50;
    private final double DENTAL_COST = 20;
    private final double DISABILITY_COST = 10;

    private final double RETIREMENT_RATE = 0.03;

    private final int MEDICAL_YES = 1;
    private final int DENTAL_YES = 1;
    private final int DISABILITY_YES = 1;
    private final int RETIREMENT_PLAN_YES = 1;
    
    //Default constructor
    
    public Employee(){
        
        this.getEmployeeInfo();
        this.calculatePay();
    }

    public void getEmployeeInfo() {
        this.skillLevel = Integer.parseInt(JOptionPane.showInputDialog("Please enter skill level (1- Level 1, 2 - Level 2 and 3 - Level"));
        this.hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("Please enter hours worked"));

        //calculate overtime hours
        // this.overtimeHours = ((this.hoursWorked - REGULAR_HOURS) > 0) ? this.hoursWorked - REGULAR_HOURS:0;
        if ((this.hoursWorked - REGULAR_HOURS) > 0) {

            this.overtimeHours = this.hoursWorked - REGULAR_HOURS;
            this.hoursWorked = REGULAR_HOURS;
        }

        //Determine regular pay rate based on user input
        switch (this.skillLevel) {
            case SKILL_LEVEL_1:
                this.regPayRate = SKILL_LEVEL_1_RATE;
                break;
            case SKILL_LEVEL_2:
                this.regPayRate = SKILL_LEVEL_2_RATE;
                break;
            case SKILL_LEVEL_3:
                this.regPayRate = SKILL_LEVEL_3_RATE;
                break;
            default:
                System.out.println("Invalid skill level");

        }

        //Determine insurance options
        if (this.skillLevel == SKILL_LEVEL_2 || this.skillLevel == SKILL_LEVEL_3) {

            this.medical = Integer.parseInt(JOptionPane.showInputDialog("Would you like "
                    + "medical insurance (1- Yes 1 and 2 - No"));
            this.dental = Integer.parseInt(JOptionPane.showInputDialog("Would you like "
                    + "dental insurance (1- Yes 1 and 2 - No"));
            this.disability = Integer.parseInt(JOptionPane.showInputDialog("Would you like "
                    + "disability insurance (1- Yes 1 and 2 - No"));

            if (this.skillLevel == SKILL_LEVEL_3) {

                this.retirementPlan = Integer.parseInt(JOptionPane.showInputDialog("Would you like "
                        + "to opt for our retirementplan? (1- Yes 1 and 2 - No"));
            }

        }

    }

    public void calculatePay() {
        //Calculate regular pay  
        this.regPay = this.regPayRate * this.hoursWorked;
        //Calculate overtime pay
        this.overtimePay = this.overtimeHours * (this.regPayRate * this.OVERTIME_RATE);
        this.grossPay = this.regPay + this.overtimePay;

        //Calculate benefits
        if (this.medical == MEDICAL_YES) {
            this.medicalCost = MEDICAL_COST;
        }

        if (this.dental == DENTAL_YES) {
            this.dentalCost = DENTAL_COST;
        }
        if (this.disability == DISABILITY_YES) {
            this.disabilityCost = DISABILITY_COST;
        }
        if (this.retirementPlan == RETIREMENT_PLAN_YES) {

            this.retirementCost = this.grossPay * RETIREMENT_RATE;
        }
        //Calculate total deductions
        this.totalDeductions = this.medicalCost + this.dentalCost + this.disabilityCost + this.retirementCost;

        //Calculate net pay
        this.netPay = this.grossPay - this.totalDeductions;
        if (this.netPay < 0) {

            this.netPay = 0;

        }
    }

    @Override
    public String toString() {
        String output = "Employee Pay\n\n";
        output += "Hours worked: " + this.hoursWorked
                + "\nHourly Pay Rate: " + this.regPayRate
                + "\nRegular Pay: $" + this.regPay
                + "\nOvertime Pay: $" + this.overtimePay
                + "\nGross Pay: $" + this.grossPay
                + "\nTotal Deductions: $" + this.totalDeductions
                + ((this.netPay == 0) ? "\n*****ERROR:Deductions exceed gross pay******" : "\nNet Pay: $" 
                + this.netPay);

       /* String netPayMessage;

        if (this.netPay == 0) {

            netPayMessage = "\nDeductions exceed gross pay";
        } else {
            netPayMessage = "\nNet Pay: $" + this.netPay;
        }
        output += netPayMessage;
*/
        return output;
    }

}
