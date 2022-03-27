package academy.mindswap;

import academy.mindswap.employee.Employee;

import java.time.Year;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeAnalyzer {

    public long countEmployees(List<Employee> employees, int years) {
        int currentYear = Year.now().getValue();
        return employees.stream()
                .filter(employee -> employee.getStartingYear() < currentYear - years)
                .count();
    }

    public List<String> findEmployeeBySalary(List<Employee> employees, int salary) {
        return employees.stream()
                .filter(employee -> employee.getSalary() > salary)
                .map(employee -> employee.getFirstName() + " " + employee.getLastname())
                .collect(Collectors.toList());
    }

    public List<Employee> findOldestEmployees(List<Employee> employees, int numberOfEmployees) {
        return employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge).reversed())
                .limit(numberOfEmployees)
                .collect(Collectors.toList());
    }

    public Optional<Employee> findFirstEmployeeByAge(List<Employee> employees, int age) {
        if (age > 100) {
            return Optional.empty();
        }

        return employees.stream()
                .filter(employee -> employee.getAge() > age)
                .findFirst();
    }

    public Double findAverageSalary(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0.0);
    }

    public List<String> findCommonNames(List<Employee> firstDepartment, List<Employee> secondDepartment) {

        Set<String> uniqueNames = firstDepartment.stream()
                .map(Employee::getFirstName)
                .collect(Collectors.toSet());

        return secondDepartment.stream()
                .map(Employee::getFirstName)
                .distinct()
                .filter(uniqueNames::contains)
                .collect(Collectors.toList());
    }
}
