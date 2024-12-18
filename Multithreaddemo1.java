//Thread using extending thread class
class Multithreaddemo1 extends Thread {

      public void run()
     {
         System.out.println("thread was runing ");
     }

     public static void main(String args[]) {
         Multithreaddemo1 t1 = new Multithreaddemo1();
         t1.run();
         //t1.start();
         t1.start();
     }

 }