class Car{
    String make;
    String model;

    //constructor for the car class
    public Car(String make,String model){
        this.make=make;
        this.model=model;
    }

    void start(){
        System.out.println("Car is starting");
    }
}

public class ExampleClass {
    public static void main(String[] args) {
        //creating objects of the car class
        // Car car1=new Car();
        // Car car2=new Car();
        //Access and modify class member variable
        // car1.make="Toyota";
        // car1.model="Honda";
        // car2.make="Camry";
        // car2.model="Civil";
        Car car1=new Car("Toyota","Camry");
        Car car2=new Car("Honda","Civil");

      

        //Access and display class member variable
        System.out.println("car 1:Make-"+car1.make+",Model-"+car1.model);
        System.out.println("car 2:Make-"+car2.make+",Model-"+car2.model);
        
          // //Access class member methods
        car1.start();
        car2.start();
        
    
    }
}
