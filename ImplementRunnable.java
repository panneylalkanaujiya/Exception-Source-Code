  public class ImplementRunnable implements Runnable
  {
    public void run()
    {
      System.out.println("Running safetly");
    }
public static void main(String args[])
{
  ImplementRunnable i1= new ImplementRunnable();
  i1.run();


}
}
