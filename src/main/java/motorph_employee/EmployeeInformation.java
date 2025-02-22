/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.motorph_employee;

import main.java.motorph_model.Employee;
import main.java.motorph_data.EmployeeDataReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;


public class EmployeeInformation {

    // Path to the employee data file
    private static final String EMPLOYEES_DATA_PATH = "src/main/data/employee_information.csv";

    public List<String> showEmployeeInformation(int employeeNumber) throws IOException, ParseException {
        // Create an instance of EmployeeDataReader
        EmployeeDataReader employeeDataReader = new EmployeeDataReader();

        // Read the list of employees from the data file
        List<Employee> employees = employeeDataReader.readEmployees(EMPLOYEES_DATA_PATH);
        // Find the employee with the inputted employee number
        Employee foundEmployee = findEmployeeByNumber(employees, employeeNumber);

        // If an employee is found with the inputted employee number
        if (foundEmployee != null) {
            // Return the information of the employee
            return foundEmployee.getEmployeeInformation();

            // Else
        } else {
            // Throw employee is not found exception
            throw new NullPointerException("Employee is not found.");
        }
    }

    /**
     * Finds an employee by their employee number.
     *
     * @param employees The list of employees to search in
     * @param employeeNumber The employee number to search for
     * @return The found employee. If not found, return null
     */
    private Employee findEmployeeByNumber(List<Employee> employees, int employeeNumber) {
        // Loop through the list of employees
        for (Employee employee : employees) {
            // If the employee's number matches the inputted number
            if (employee.getEmployeeNumber() == employeeNumber) {
                // Return found employee
                return employee;
            }
        }

        // Return null if no matching employee is found
        return null;
    }
}
