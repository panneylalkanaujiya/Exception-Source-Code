public class SinglatonDesignPattern {
    private static SinglatonDesignPattern obj= new SinglatonDesignPattern();
    private SinglatonDesignPattern()
    {}
    public static SinglatonDesignPattern getSinglatonDesignPattern()
    {
         return obj;
    }

}
