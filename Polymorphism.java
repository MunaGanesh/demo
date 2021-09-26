class Abc{
  public void eat(){
        System.out.println("Abc eats quickly");
    }
}
class Xyz extends Abc{

      public void eat( String eat){
        System.out.println("Xyz eats quickly");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
      Xyz Obj=new Xyz();
       Obj.eat();

        System.out.println("hello");
    }

        }

