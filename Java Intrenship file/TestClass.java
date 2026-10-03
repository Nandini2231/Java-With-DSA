 interface  in1{
    final int a=10;
    public void display();    
}
public class TestClass implements in1 {
     public void display(){
        System.out.println("Hellow world");
    }
    public static void main(String args[]){
        TestClass tc=new TestClass();
        tc.display();
        System.out.println(a);
}

}