package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");

        EmployeeWage hcl = new EmployeeWage("HCL", 50, 20, 40);
        System.out.println("HCL");
        hcl.calEmpWagePerMonth();

        EmployeeWage intel = new EmployeeWage("Intel", 100, 15, 30);
        System.out.println("Intel");
        intel.calEmpWagePerMonth();

    }
}
