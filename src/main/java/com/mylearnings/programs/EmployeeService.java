package com.mylearnings.programs;

import java.util.Arrays;
import java.util.List;

public class EmployeeService {

    public static  List<Employee> getAllEmployees() {
        return Arrays.asList(
            new Employee(1,"Mahesh","34545455","mahesh@gmail.com",60000,"Dev"),
            new Employee(2,"Vardhan","623435454","vardhan@gmail.com",30000,"Dev"),
            new Employee(6,"Katkam","5645666","test@gmail.com",30000,"QA"),
            new Employee(3,"Mahalakshmi","8965674","mahalakshmi@gmail.com",20000,"QA"),
            new Employee(4,"Ammulu","234567","ammulu@gmail.com",50000,"QA")
        );
    }
}
