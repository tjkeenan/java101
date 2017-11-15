
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
public class Pay {
    
    public static void main(String[] args) {
        
        //Create new employee
        Employee employee1 = new Employee();
        employee1.getEmployeeInfo();
        //Calculate pay
       // employee1.calculatePay();
        //Create output
       // String tempOutput = employee1.toString();
        //Display output
        JOptionPane.showMessageDialog(null, employee1);
        
    }
    
}
