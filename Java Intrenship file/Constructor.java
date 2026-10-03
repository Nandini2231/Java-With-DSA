    //Default constructor
//     class MyClass{
//     int x;
//     MyClass(){
//         x=10;
//     }
// }

// public class Constructor {
// public static void main(String[] args) {
//     MyClass t1=new MyClass();
//     MyClass t2=new MyClass();
//     System.out.println(t1.x+" "+t2.x);
// // }  
// }


//parameterized constructor
class MyClass{
    String name;
    int id;

    public MyClass(String name,int id) {
        this.name=name;
        this.id=id;
    } 
}
public class Constructor{
    public static void main(String[] args) {
        MyClass obj=new MyClass("Nandini",3410491);
        System.out.println("Name is " + obj.name +" id is " +obj.id);

    }
}