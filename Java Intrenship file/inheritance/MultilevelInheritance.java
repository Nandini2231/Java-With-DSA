package inheritance;
 class one{
    public void print1()
    {
        System.out.println("print1");

    }
 }
 class two extends one{
    public void print2(){
        System.out.println("Print2");
    }
 }
 class three extends two{
    public void print3(){
        System.out.println("Print3");
    }
 }
public class MultilevelInheritance {
    public static void main(String[] args) {
        three g=new three();
        g.print1();
        g.print2();
        g.print3();    }
    
}
