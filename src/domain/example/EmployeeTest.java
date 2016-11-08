/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.example;
import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;
import domain.example.*;
/**
 *
 * @author jhon
 */
public class EmployeeTest  {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Engineer en= new Engineer(101, "Jane Smith","012-34-5678" ,120_345.27);
        Manager ma= new Manager(207,"Barbara Johnson", "054-12-2367", 109_501.36,"US Marketing");
        Admin ad= new Admin(12,"Bill Munroe","099-45-2340", 75_002.34);
        Director dir= new Director(12, "Susan Wheeler", " 099-45-2340", 120_567.36, "Global Marketing",1_000_000.00);
       en.printEmployee(en, ad, ma, dir);
        

// TODO code application logic here
    }

    
    
}
