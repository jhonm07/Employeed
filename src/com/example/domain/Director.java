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
public class Director extends Manager{
private double budget;
    public Director(int empId, String name, String ssn, double salary, String deptName,double budget) {
        super(empId, name, ssn, salary, deptName);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    
}
