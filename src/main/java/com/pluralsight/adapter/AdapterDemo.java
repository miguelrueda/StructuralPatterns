package com.pluralsight.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {
        EmployeeClient client = new EmployeeClient();

        List<Employee> employeeList = client.getEmployeeList();

        System.out.println(employeeList);
    }
}
