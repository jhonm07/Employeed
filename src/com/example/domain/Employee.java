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
        if(name!=null && name.equals("")){
        this.name = name;    
        }
        
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
        if(incrementaly>0){
        salary+=incrementaly;
    }
    }
    
    public static void   printEmployee (Employee em){

        
        
        
        
//        System.out.println("Employeed Id: " + getEmpId());
//        System.out.println("Employeed name: " + getName());
//        System.out.println("Employeed Soc Sec #" + getSsn());
//        System.out.println("Employed salary:  " + getSalary());
//        System.out.println("Employed salary:  " + NumberFormat.getCurrencyInstance().format(getSalary()));

      
}

    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", name=" + name + ", ssn=" + ssn + ", salary=" + salary + '}';
    }
    
}
