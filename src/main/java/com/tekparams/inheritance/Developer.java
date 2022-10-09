package com.tekparams.inheritance;

import com.tekparams.OOPS.Employee;

public class Developer extends Employee {
    public double bonus;
    public double hra;

    public Developer(){
        bonus=4000.00;
        hra=3000.00;
    }
    public void printDevloper(){
        super.empNo="E001";
        super.empName="Raja";
        super.empAddress="ABC Street";
        super.empCity="Bangalore";
        super.empbasicSalary=50000.00;
        super.printEmployee();
        System.out.println(bonus+"\n"+hra);
    }

}
