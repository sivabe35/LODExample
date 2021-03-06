package com.androidjavapoint.lodexample.badcode;

public class EmployeeValidator {

    public static void main(String args[]) {
        Employee employee = new Employee();
        employee.setName("Employee1");

        Email email = new Email();
        email.setPrimaryEmailAddress("mail1@gmail.com");

        ContactNumber contactNumber = new ContactNumber();
        contactNumber.setMobile(987654321);

        employee.setEmail(email);
        employee.setContactNumber(contactNumber);

        boolean isValidEmployee = isValidEmployee(employee);
        System.out.println("Is Valid Employee : " + isValidEmployee);
    }

    private static boolean isValidEmployee(Employee employee) {
        // Notice method chaining
        String primaryEmailAddress = employee.getEmail().getPrimaryEmailAddress();
        // Notice method chaining
        long mobile = employee.getContactNumber().getMobile();

        // some good conditions
        if (primaryEmailAddress != null && mobile != 0) {
            return true;
        }
        return false;
    }
}
