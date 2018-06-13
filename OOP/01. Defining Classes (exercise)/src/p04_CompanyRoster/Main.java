package p04_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,List<Employee>>employeeMap = new LinkedHashMap<>();
        int num = Integer.parseInt(reader.readLine());

        for (int i = 0; i < num; i++) {
            String[] input = reader.readLine().split("\\s+");
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            if (input.length == 4) {
                Employee employee = new Employee(name, salary, position, department);
                employeeMap.putIfAbsent(department,new LinkedList<>());
                employeeMap.get(department).add(employee);
            } else if (input.length == 5) {
                try {
                    int age = Integer.parseInt(input[4]);
                    Employee employee1 = new Employee(name, salary, position, department, age);
                    employeeMap.putIfAbsent(department,new LinkedList<>());
                    employeeMap.get(department).add(employee1);
                } catch (Exception e) {
                    String email = input[4];
                    Employee employee2 = new Employee(name, salary, position, department, email);
                    employeeMap.putIfAbsent(department,new LinkedList<>());
                    employeeMap.get(department).add(employee2);
                }
            } else {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                Employee employee3 = new Employee(name, salary, position, department, email, age);
                employeeMap.putIfAbsent(department,new LinkedList<>());
                employeeMap.get(department).add(employee3);
            }
        }
        double highestSalary = 0;
        String highestDepartment ="";

        for (Map.Entry<String, List<Employee>> department : employeeMap.entrySet()) {
            double sum = department.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble() ;

            if (highestSalary<sum){
                highestSalary = sum;
                highestDepartment = department.getKey();
            }
        }
        System.out.println(String.format("Highest Average Salary: %s",highestDepartment));
        employeeMap.get(highestDepartment).stream().sorted((e1,e2)-> {
            double firstSalary = e1.getSalary();
            double secondSalary = e2.getSalary();

            return (int)(secondSalary-firstSalary);
        }).forEach(e-> System.out.println(String.format("%s %.2f %s %d",e.getName(),e.getSalary(),e.getEmail(),e.getAge())));
    }

}
