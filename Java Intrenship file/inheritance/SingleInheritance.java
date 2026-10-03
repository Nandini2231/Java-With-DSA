package inheritance;
class Employee{
    int salary=50000;
}
class Engineer extends Employee{
    int benifits=10000;
}
public class SingleInheritance {
    public static void main(String[] args) {
        Engineer E1=new Engineer();
        System.out.println("Salary:"+E1.salary+"\nBenifits:"+E1.benifits);
    }
    
}
