public class Factorial {
    void  fact(int number)
    {
        int fact=1;
        for(int i=1;i<=number;i++) {
            fact = fact * i;
        }
        System.out.println("Factorials of number is: "+fact);
    }
    public static void main(String args[]) {

        new Factorial().fact(5);

    }
}
