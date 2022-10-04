package com.bridgelabz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Scanner input = new Scanner(System.in);
        EmployeeWage emp = new EmployeeWage();
        System.out.println("enter employee first name : ");
        emp.setFirstName(input.next());
        System.out.println("enter employee last name : ");
        emp.setLastName(input.next());

        System.out.println("Employee Full Name " + emp.getFirstName() + " " + emp.getLastName());

        emp.calTotalEmpWage();
    }
}
