public class Pyramid
{
    public static void main(String args[])
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 7; j >= i; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}