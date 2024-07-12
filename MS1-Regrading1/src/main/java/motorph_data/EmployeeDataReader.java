/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.motorph_data;

import main.java.motorph_model.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDataReader {

    private static final SimpleDateFormat BIRTHDATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");

    // Expected total number of values per row from the data
    private static final int EMPLOYEE_EXPECTED_COL_LENGTH = 19;

    /**
     * Reads employee data from the data file and returns list of employees.
     *
     * @param filePath Path to the employee_information data file
     * @return List of employees read from the file
     * @throws IOException If an I/O error happens while reading the file
     * @throws ParseException If a parsing error happens while parsing
     */
    public List<Employee> readEmployees(String filePath) throws IOException, ParseException {
        List<Employee> employees = new ArrayList<>();

        // Open the file for reading
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Skip the header row
            reader.readLine();
            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                // Split the line into employee data using "," as a delimiter
                String[] employeeData = line.split(",");
                // If the line has the expected length
                if (employeeData.length >= EMPLOYEE_EXPECTED_COL_LENGTH) {
                    // Create an employee object from the data and add it to the list
                    employees.add(createEmployeeFromData(employeeData));
                }
            }
        }

        // Return the list of employees
        return employees;
    }

    /**
     * Creates an Employee object from an array of employee data.
     *
     * @param employeeData Array containing employee data
     * @return Employee object created with the data
     * @throws ParseException If a parsing error occurs
     */
    private Employee createEmployeeFromData(String[] employeeData) throws ParseException {
        Employee employee = new Employee();

        employee.setEmployeeNumber(parseInteger(employeeData[0]));
        employee.setLastName(employeeData[1].trim());
        employee.setFirstName(employeeData[2].trim());
        employee.setBirthdate(BIRTHDATE_FORMAT.parse(employeeData[3].trim()));
        employee.setAddress(employeeData[4].trim());
        employee.setPhoneNumber(employeeData[5].trim());
        employee.setSssNumber(employeeData[6].trim());
        employee.setPhilHealthNumber(employeeData[7].trim());
        employee.setTinNumber(employeeData[8].trim());
        employee.setPagIbigNumber(employeeData[9].trim());
        employee.setStatus(employeeData[10].trim());
        employee.setPosition(employeeData[11].trim());
        employee.setImmediateSupervisor(employeeData[12].trim());
        employee.setBasicSalary(parseDouble(employeeData[13]));
        employee.setRiceSubsidy(parseDouble(employeeData[14]));
        employee.setPhoneAllowance(parseDouble(employeeData[15]));
        employee.setClothingAllowance(parseDouble(employeeData[16]));
        employee.setGrossSemimonthlyRate(parseDouble(employeeData[17]));
        employee.setHourlyRate(parseDouble(employeeData[18]));

        return employee;
    }

/**
     * Parses a string to an integer. Returns 0 if the string is not a valid integer.
     *
     * @param value The string to parse
     * @return The parsed integer or 0 if invalid
     */
    private int parseInteger(String value) {
        try {
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e) {
            return 0; // or any default value you'd like to use
        }
    }

    /**
     * Parses a string to a double. Returns 0.0 if the string is not a valid double.
     *
     * @param value The string to parse
     * @return The parsed double or 0.0 if invalid
     */
    private double parseDouble(String value) {
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            return 0.0; // or any default value you'd like to use
        }
    }
}