//Multilevel inheritance
public class Employee_m {
    int salary=1000;
}
class Programmer extends Employee_m
{
    int bonus=1450;
}
class Developerjava extends Programmer
{
    int incentive=900;
    public static void main(String args[])
    {
         Developerjava  d1= new Developerjava();
         System.out.println("Employee salary is:"+ d1.salary);
        System.out.println("Employee bonus is:"+ d1.bonus);
        System.out.println("Employee incentive is:"+ d1.incentive);

    }
}
