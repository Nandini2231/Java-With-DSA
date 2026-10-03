 class Student{
    int regno;
    void display(){
        System.out.println("reg no:" +regno);
    }
}
public class ReferenceDemo{
    public static void main(String[] args) {
    //     Student obj1=new Student();
    //     Student obj2=obj1;
    //     obj1.regno=121;
    //     obj1.display();
    //     obj2.display();
    
//another example
Student s1=new Student();
Student s2=new Student();

s1.regno=121;
s1.display();
s2.regno=122;
s2.display();
s1=s2;
s1.display();

}
}
