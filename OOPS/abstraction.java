public class abstraction {
    public static void main(String[] args) {
       // Car c=new Car(); //this will give an error because we cannot create an object of an abstract class, because an abstract class is incomplete and it cannot be instantiated, but we can create a reference variable of an abstract class and we can use it to refer to the objects of the child classes, because the child classes are complete and they can be instantiated, so we can create objects of the child classes and refer to them using the reference variable of the abstract class
       Car c1=new Fuelcar();
       Car c2=new ElectricCar();

         c1.start();
        c1.accelerate();
        c1.brake();

        c2.start();
        c2.accelerate();
        c2.brake();

    }
}
abstract class Car{
    void start(){
        System.out.println("Car is starting");
    }
    abstract void accelerate();
        
    abstract void brake();
}
class Fuelcar extends Car{
    @Override
    void accelerate(){
        System.out.println("Fuel Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Fuel Car is braking");
    }
    void refuel(){
        System.out.println("Car is refueling");
    }
}
class ElectricCar extends Car{
    @Override //this annotation is used to indicate that the method is overriding the method defined in the parent class, and it is optional to use this annotation, but it is a good practice to use it, because it will help the compiler to check if the method is actually overriding the method defined in the parent class, and if it is not, then it will give an error, so it will help to avoid mistakes and improve the readability of the code
    void accelerate(){
        System.out.println("electric Car is accelerating");
    }
    @Override
    void brake(){
        System.out.println("Electric Car is braking");
    }
    void charge(){
        System.out.println("Car is charging");
    }
}