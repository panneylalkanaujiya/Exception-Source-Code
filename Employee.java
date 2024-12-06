//Inheritance in java
public class Employee
{
    double salary=1000.00;
    {
        System.out.println("Employee salary is 10000");
    }
}
class Developer extends Employee
{
    int bonus=1400;
    {
        System.out.println("developer bonus is 1000");
    }

    public static void main(String args[])
    {
        Developer d1= new Developer();
        System.out.println("bonus of emp:"+d1.bonus);
        System.out.println("salary of emp:"+d1.salary);
    }
}

