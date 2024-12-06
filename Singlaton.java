 class Singlaton
{
    private static  Singlaton obj = new  Singlaton();
    private Singlaton()
    {

    }
    public  static Singlaton getSinglaton()
    {
        return obj;
    }

}

