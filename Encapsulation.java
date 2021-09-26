class Phone{
    private String name;
    private int price;
    private String color;

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
public class Encapsulation {
    public static void main (String[]args){
    Phone A=new Phone();
    A.setName("Samsung");
    A.setPrice(30000);
    A.setColor("Gray");
    System.out.println(" Name="+A.getName()+" Price="+A.getPrice()+ " Color="+A.getColor());
    }
}
