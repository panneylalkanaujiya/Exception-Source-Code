import java.util.HashSet;

public class Employeetcs {
    int id;
    String name;
    String department;
    double salary;

    public Employeetcs(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


}
class Main1 {
    public static void main(String args[]) {
        HashSet<Employeetcs> s1 = new HashSet<>();
        s1.add(new Employeetcs(12, "panney", "it", 1200.00));
        s1.add(new Employeetcs(2, "panney", "it", 1200.00));
        s1.add(new Employeetcs(12, "panney", "it", 1200.00));
        s1.add(new Employeetcs(12, "panney", "it", 1200.00));
        s1.add(new Employeetcs(12, "panney", "it", 1200.00));
        for (Employeetcs employee : s1)
            System.out.println(employee);
    }

}