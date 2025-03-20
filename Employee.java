import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("John", 21);
        Employee e2 = new Employee("Martin", 19);
        Employee e3 = new Employee("Mary", 31);
        Employee e4 = new Employee("Stephan", 18);
        Employee e5 = new Employee("Gary", 26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        // Filtering using Streams
        List<String> filteredNames = employeeList.stream()
                .filter(emp -> emp.getAge() > 20) // Filter employees with age > 20
                .map(Employee::getName)          // Extract their names
                .collect(Collectors.toList());  // Collect names to a list

        // Print names
        filteredNames.forEach(System.out::println);
        // Filtering using a traditional loop
        for (Employee emp : employeeList) {
            if (emp.getAge() > 20) {
                System.out.println(emp.getName());
            }
        }
    }
}
