public class FibonnaciSeries {
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,number=9;
        {
            System.out.println(n1+""+n2);
        }
        for(int i=2;i<=number;i++)
        {
            n3=n1+n2;

            System.out.println(" " +n3);
                n2=n1;
                n1=n3;


        }

    }
}
