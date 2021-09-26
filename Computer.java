public class Computer{//// Computer is able to implement all feature of Machine
    public static void main(String[] args){
        Cpu A =new Cpu();
        A. run();
        A.display();
        A.move();
    }
}


abstract class Machine /// Abstract class
{
    public static void main(String[] args){}
        public abstract void run ();
       {
           System.out.println("Running......");
       }
       public abstract void move();
       public abstract void display();
       }


  class Cpu extends  Machine /// cpu implementing abstracting class
  {
      @Override
      public void run(){}


      public void move()
      {System.out.println("Moving............");}

      public void display()
        {System.out.println("Displaying .......");}
}
/*class Test
 {
    public static void main(String[] args){
        Cpu A =new Cpu();
        A. run();
        A.display();
        A.move();
        }
    }*/