package inheritance;

//Method overloading
class Helper{
    int Multiply(int a,int b){
        return a*b;
    }
    int Multiply(int a,int b,int c){
        return a*b*c;
    }
}
public class Polymorphism {
  public static void main(String[] args) {
    Helper h1=new Helper();
    System.out.println(h1.Multiply(2,3));
    System.out.println(h1.Multiply(5,2, 3));
  }  
}
