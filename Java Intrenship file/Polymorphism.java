//Method overriding
class Parent{
    void Print(){
        System.out.println("Parent class");
    }
}
class Child extends Parent{
    void Print(){
        System.out.println("child class");
    }
}
public class Polymorphism {
  public static void main(String[] args) {

 Child c=new Child();
        c.Print();

//     Helper h1=new Helper();
//     System.out.println(h1.Multiply(2,3));
//     System.out.println(h1.Multiply(5,2, 3));
  }  
}
