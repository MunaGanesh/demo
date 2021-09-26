import javax.lang.model.element.Name;
import java.awt.*;

class Vehicle{
public String name;
private int price;
private String color;
public Vehicle(String name,int price,String color){
    this.name=name;
    this.price=price;
    this.color=color;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


public class EncapConstructor {
    public static void main(String[] args) {
       Vehicle V=new Vehicle  ("Bike",2000,"Black" );
       // EncapConstructor EC = new EncapConstructor("Max", $1000, "Black");
        System.out.println("1st Vehicle");
       System.out.println(" Name:"+ V.getName()+" Price:"+ V.getPrice()+ " Color:"+ V.getColor());
       //Parameter of Another Vehicle
       System.out.println("2nd Vehicle  ");
       Vehicle Z=new Vehicle  ("Cycle",8000,"red" );
       System.out.println(" Name:"+ Z.getName()+" Price:"+ Z.getPrice()+ " Color:"+ Z.getColor());
      //  System.out.println("Max" + 1000 + "Red");
    }

}
