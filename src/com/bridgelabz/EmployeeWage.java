package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;

    static final int FULL_DAY_HOUR = 8;

    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        int empPresent = (int) Math.floor(Math.random() * 10) % 3;

        int empWage = 0;
        if (empPresent == 2) {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employee FULL TIME");
        } else if (empPresent == 1) {
            empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employee PART TIME");
        } else
            System.out.println("Employee Absent");

        System.out.println("Employee Wage => " + empWage);
    }
}
