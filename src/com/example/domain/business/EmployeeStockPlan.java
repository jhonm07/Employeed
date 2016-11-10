/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain.business;

import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Manager;
import com.example.domain.Employee;

/**
 *
 * @author jhon
 */
public class EmployeeStockPlan {
    private final int employeeShares = 10;
private final int managerShares = 100;
private final int directorShares = 1000;

//este metodo comprueba que la clase Employee es un objeto de una clase concreta
public int grantStock(Employee em){
    if(em instanceof Director){
        return directorShares;
        
    }else{
        if (em instanceof Manager){
            return managerShares;
        }else{
            return employeeShares;
        }
    }
   
}
}



