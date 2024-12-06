import java.util.stream.IntStream;

public class CalculateFactorialsOfNumber
{
    public static void main(String args[])
    {
        int no=5;
        int factorial= IntStream.rangeClosed(1,no)
                .reduce(1,(a,b)->a*b);
        System.out.println("Factorilas"+ no + "is"+factorial);
    }
}
