package com.company;

public class Employee {
    public int Employee_id;
    public String Employee_name;
    public String ssn;
    public double Employee_salary;

    public Employee() {
        super();
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn() {
    }

    public double getEmployee_salary() {
        return Employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        Employee_salary = employee_salary;
    }

    static class EmployeeTest {

        public static void main(String[] args) {
            Employee e = new Employee();
            e.setEmployee_id(101);
            e.setEmployee_name("Jane Smith");
            e.setSsn();
            e.setEmployee_salary(120_345.27);

            System.out.println("Employee id: " + e.getEmployee_id());
            System.out.println("Employee Name: " + e.getEmployee_name());
            System.out.println("Employee Social Security Number: " + e.getSsn());
            System.out.println("Employee Salary: " + e.getEmployee_salary());
        }
    }
}