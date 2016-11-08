/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;
import domain.example.EmployeeTest;
import java.text.NumberFormat;

/**
 * 
 * @author jhon
 */
public class Employee {
  
    int empId;  
    private String name;
    private String ssn;
    private double salary;

    
 public Employee(int empId,String name,String ssn, double salary){
     
     this.empId= empId;
     this.name= name;
     this.ssn= ssn;
     this.salary= salary;
 }   

   

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void  raiseSalary(Double incrementaly){
        
        salary+=incrementaly;
    }
    public  void   printEmployee (Engineer en,Admin ad,Manager ma,Director dir){

       System.out.println("Employeed Id: "+en.getEmpId());
        System.out.println("Employeed name: "+en.getName());
        System.out.println("Employeed Soc Sec #"+en.getSsn());
        System.out.println("Employed salary:  "+en.getSalary());
       System.out.println("Employeed Id: "+en.getEmpId());
        System.out.println("Employeed name: "+en.getName());
        System.out.println("Employeed Soc Sec #"+en.getSsn());
        System.out.println("Employed salary:  "+NumberFormat.getCurrencyInstance().format(en.getSalary()));
        
        System.out.println("Employeed Id: "+ma.getEmpId());
        System.out.println("Employeed name: "+ma.getName());
        System.out.println("Employeed Soc Sec #"+ma.getSsn());
        System.out.println("Employed salary:  "+NumberFormat.getCurrencyInstance().format(ma.getSalary()));
        
        
         System.out.println("Employeed Id: "+dir.getEmpId());
        System.out.println("Employeed name: "+dir.getName());
        System.out.println("Employeed Soc Sec #"+dir.getSsn());
        System.out.println("Employed salary:  "+NumberFormat.getCurrencyInstance().format(dir.getSalary()));
      
        System.out.println("butget: "+NumberFormat.getCurrencyInstance().format(dir.getBudget()));
       
        System.out.println("Employeed Id: "+ad.getEmpId());
        System.out.println("Employeed name: "+ad.getName());
        System.out.println("Employeed Soc Sec #"+ad.getSsn());
     System.out.println("Employed salary:  "+NumberFormat.getCurrencyInstance().format(ad.getSalary()));
             
        

      
}
    
}
