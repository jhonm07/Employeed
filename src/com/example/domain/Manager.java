/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

/**
 *
 * @author jhon
 */
public class Manager extends Employee{
private String deptName;
    
    public Manager(int empId, String name, String ssn, double salary,String deptName) {
        super(empId, name, ssn, salary);
        this.deptName=deptName;
    }

    @Override
    public String toString() {
        return "Manager{" + "deptName=" + deptName + '}';
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
}
