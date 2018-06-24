package p05_CompanyRoster;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, List<Employee>> departments = new LinkedHashMap<>();
        int numOfEmployees = Integer.parseInt(reader.readLine());

        while (numOfEmployees-- > 0) {

            String[] emploeeTokens = reader.readLine().split("\\s+");
            String name = emploeeTokens[0];
            double salary = Double.parseDouble(emploeeTokens[1]);
            String position = emploeeTokens[2];
            String department = emploeeTokens[3];
            switch (emploeeTokens.length) {
                case 4:
                    Employee employee = new Employee(name, salary, position, department);
                    departments.putIfAbsent(department, new ArrayList<>());
                    departments.get(department).add(employee);

                    break;
                case 5:
                    try {
                        int age = Integer.parseInt(emploeeTokens[4]);
                        Employee employee1 = new Employee(name, salary, position, department, age);
                        departments.putIfAbsent(department, new ArrayList<>());
                        departments.get(department).add(employee1);

                    } catch (Exception e) {
                        String emial = emploeeTokens[4];
                        Employee employee1 = new Employee(name, salary, position, department, emial);
                        departments.putIfAbsent(department, new ArrayList<>());
                        departments.get(department).add(employee1);

                    }
                    break;
                case 6:
                    int age = Integer.parseInt(emploeeTokens[5]);
                    String email = emploeeTokens[4];
                    Employee employee1 = new Employee(name, salary, position, department, email, age);
                    departments.putIfAbsent(department, new ArrayList<>());
                    departments.get(department).add(employee1);

                    break;
            }
        }
        double bestSalary = 0;
        String department = "";

        for (Map.Entry<String, List<Employee>> employee : departments.entrySet()) {
            double currentSalary = employee.getValue().stream().mapToDouble(Employee::getSalary).average().getAsDouble();
            if (currentSalary>bestSalary){
                bestSalary = currentSalary;
                department = employee.getKey();
            }
        }


        StringBuilder sb = new StringBuilder();
        sb.append("Highest Average Salary: ").append(department).append(System.lineSeparator());
            departments.get(department).stream().sorted((e1,e2)-> (int)e2.getSalary()-(int)e1.getSalary()).forEach(e->sb.append(String.format("%s %.2f %s %d%n",e.getName(),e.getSalary(),e.getEmail(),e.getAge())));

        System.out.println(sb);

    }
}
