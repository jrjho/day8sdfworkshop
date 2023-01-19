package sdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortExample {

    public void example01() {
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
            numbers.add((int) (Math.random() * 100));

        System.out.println("Unsorted list: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        numbers.sort(Comparator.reverseOrder());
        System.out.println("Reversed list: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Reversed list: " + numbers);

    }

    public void example02() {
        Employee emp1 = new Employee("12345", "Mr Brown", "Marketing", "Mascot", "mrbrown@mrbrown.com", 897642);
        Employee emp2 = new Employee("43453", "Mr Grey", "Accounting", "Manager", "mrgrey@mrbrown.com", 765473);
        Employee emp3 = new Employee("8747", "Ms Violet", "Sales", "Staff", "msviolet@mrbrown.com", 123452);
        Employee emp4 = new Employee("84752", "Ms Pink", "IT", "Programmer", "mspink@mrbrown.com", 817341);


        List<Employee> employees = new ArrayList<Employee>();

        employees.add(emp2);
        employees.add(emp1);
        employees.add(emp3);
        employees.add(emp4);

        System.out.println("Employees before sorting: " + employees + "\n");

        Collections.sort(employees);
        // employees.sort(Comparator.naturalOrder());
        System.out.println("Employees after sorting: " + employees + "\n");

        employees.sort(Comparator.comparing(e->e.getSalary()));
        System.out.println("Sort by salary: " + employees + "\n");

        List<Employee> filteredEmployees = employees.stream().filter(e -> e.getFullName().equalsIgnoreCase("mr brown")).collect(Collectors.toList());
        System.out.println("Filtered: " + filteredEmployees + "\n");



    
    }
}
