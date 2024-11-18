package com.mylearnings.programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeService.getAllEmployees();

        System.out.println("Coverting List of Employees to Map<Id,Employee>");
        Map<Integer, Employee> employeeMap = convetListToMap(employees);

        System.out.println("Group by Salary");
        Map<Integer, List<Employee>> groupBySalaryEmployees = groupBySalaryEmployees(employees);

        System.out.println("Getting Sorted Salary Employee Map");
        Map<Integer, List<Employee>> allSortedBySalaryEmployees = getAllSortedBySalaryEmployees(groupBySalaryEmployees);

        System.out.println("Group by salary Employee count");
        Map<Integer, Long> salaryWiseEmployeeCount = groupBySalaryEmployeesCount(employees);


        System.out.println("Converting List<Employee> to Map<Employee,Integer> ");
        Map<Employee, Integer> employeeSalaryMap = getEmployeeSalaryMap(employees);


        System.out.println("Sorting employee object based Employee Salary");
        employeeSalaryMap = getSortedBySalaryEmployeeMap(employeeSalaryMap);

        System.out.println("List Employees sorted by property");
        employees.stream().sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);

        System.out.println();
        System.out.println("Getting Nth highest Salary Employees");
        System.out.println(getNthHighestSalaryEmployees(groupBySalaryEmployees, 3));


    }

    public static Map<Integer, List<Employee>> getAllSortedBySalaryEmployees(Map<Integer, List<Employee>> inputEmployeeMap) {
        return inputEmployeeMap.entrySet().stream()
                // .sorted(Comparator.comparing(Map.Entry::getKey)) // Ascending Order by salary
                .sorted(Map.Entry.<Integer, List<Employee>>comparingByKey().reversed()) // Descending order by salary
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, // In case of key conflicts, keep the existing entry
                        LinkedHashMap::new // Use LinkedHashMap to preserve the sorted order
                ));
    }

    public static List<Employee> getNthHighestSalaryEmployees(Map<Integer, List<Employee>> inputEmployeeMap, int num) {
        Map<Integer, List<Employee>> descOrderEmployeesBySalary = getAllSortedBySalaryEmployees(inputEmployeeMap);
        return descOrderEmployeesBySalary.entrySet()
                .stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toList())
                .get(num - 1);
    }

    public static Map<Integer, Employee> convetListToMap(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Employee::getId, Function.identity()));
    }

    public static Map<Integer, List<Employee>> groupBySalaryEmployees(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
    }

    public static Map<Integer, Long> groupBySalaryEmployeesCount(List<Employee> employees) {
        return employees.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
    }

    public static Map<Employee, Integer> getEmployeeSalaryMap(List<Employee> employees) {
        return employees.stream().collect(Collectors.toMap(Function.identity(), Employee::getSalary));
    }

    public static Map<Employee, Integer> getSortedBySalaryEmployeeMap(Map<Employee, Integer> employeeSalaryMap) {
        return employeeSalaryMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
