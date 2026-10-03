package inheritance;
interface One{
    public void print1();
}
interface Two{
    public void print2();
}
interface Three extends One,Two{
    public void print3();
}
class Child implements Three {
    public void print1(){
        System.out.println("Print1");
    }

public void print2(){
    System.out.println("print2");
}
public void print3(){
    System.out.println("print3");
}
}

public class MultipleDemo {
    public static void main(String[] args) {
        Child c=new Child();
        c.print1();
        c.print2();
        c.print3();
    }
    
}
