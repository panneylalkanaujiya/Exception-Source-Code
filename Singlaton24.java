

 public class Singlaton24
{
    private static  Singlaton24 instance;
    private Singlaton24()
    {}
    public static  synchronized Singlaton24 getInstance() {
        if (instance == null) {
            instance = new Singlaton24();
        }
        return instance;

    }
    }



