import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindingSalaryDepartment {
    int id;
    String name;
    String department;
    Double salary;
    public FindingSalaryDepartment(int id,String name,String department,Double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
}
class  MainTesting
{
    public static void main(String args[]) {
        List<FindingSalaryDepartment> findingSalaryDepartment = Arrays.asList(
                new FindingSalaryDepartment(12, "panney", "IT", 12309.00),
                new FindingSalaryDepartment(23, "sweta", "java", 12309.00),
                new FindingSalaryDepartment(19, "anajli", "account", 111000.00),
                new FindingSalaryDepartment(120, "panneykanayujiya", "Hr", 17888.00)
        );
        Map<String, Double> findsalarydepartment = findingSalaryDepartment.stream()
                .collect(Collectors.groupingBy(FindingSalaryDepartment::getDepartment,
                        Collectors.averagingDouble(FindingSalaryDepartment::getSalary)));
        //print the result
        findsalarydepartment.forEach((department, totalSalary) ->
                System.out.println("Department: " + department + ", Total Salary: " + totalSalary));

    }
}