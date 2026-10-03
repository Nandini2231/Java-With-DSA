package inheritance;
class A{
    public void printA(){
        System.out.println("Class A");
    }
}
class B extends A{
    public void printB(){
        System.out.println("Class B");
    }
}
class C extends A{
    public void printC(){
        System.out.println("Class C");
    }
}
class D extends A{
    public void printD(){
        System.out.println("Class D");
    }
}
public class HirarchicalInheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.printA();
        obj.printB();

        C obj1=new C();
        obj1.printA();
        obj1.printC();

        D obj2=new D();
        obj2.printA();
        obj2.printD();
    }
    
}
