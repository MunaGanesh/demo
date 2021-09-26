class Teacher{//Super class
    void play()
    {System.out.println("Teacher play badminton.I am from parent class");}
}

class Student1 extends Teacher{/// Subclass inherit feature of Super class
    void dance()
    {System.out.println("Student1 dances very well.I am from child class");}
}
/*class Student2 extends Teacher{
    void sing()
    {System.out.println("Student2 sings awesome.I am also from child class");}
}*/

public class Student {

    public static void main(String[] args) {
        Student1 A =new Student1();
        //Student2 B =new Student2();
        A.play();
        A.dance();
        //B.sing();
    }
}
