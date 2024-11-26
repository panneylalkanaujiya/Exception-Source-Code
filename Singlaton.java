 class Singlaton
{
    private static  Singlaton obj = new  Singlaton();
    private Singlaton()
    {

    }
    private static Singlaton getSinglaton()
    {
        return obj;
    }
    public void  addsomething()
    {

    }
}
