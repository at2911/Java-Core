public class abstractClassQuestions {
    public static void main(String[] args) {
        Animal a=new Dog("Kalu");
        a.makeSound();
        
    }

    
}
abstract class Animal{
    String name;
    static String type;
    Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
    final void sleep(){
        System.out.println("Animal is sleeping");
    }
    static void eat(){
        System.out.println("Animal is eating");
    }
    private void eat3(){ //cant be abstract  
        System.out.println("Animal is eating");
    }


}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    @Override
    void makeSound(){
        System.out.println("Dog is barking");
    }
}
//Questions
//1. can abstract classes may have constructors? -->yes, abstract classes can have constructors, but they cannot be instantiated directly, so the constructor of an abstract class is called when a subclass is instantiated, and it can be used to initialize the state of the abstract class, and it can also be used to perform any setup that is required for the abstract class, but since we cannot create an instance of an abstract class, we cannot call the constructor of an abstract class directly, but it will be called indirectly when we create an instance of a subclass that extends the abstract class

//2. Can abstract classes be final? ->No , because a final class cannot be extended, and an abstract class is meant to be extended by other classes, so it cannot be final, because if it were final, then it would not be able to be extended by any other class, and it would defeat the purpose of having an abstract class in the first place, which is to provide a common base for other classes to extend and implement their own specific behavior, so an abstract class cannot be final.

//3. Can abstract classes have static methods? ->Yes, abstract classes can have static methods, but they cannot be abstract, because static methods belong to the class and not to any instance of the class, so they cannot be overridden by subclasses, and they cannot be abstract, because abstract methods are meant to be overridden by subclasses, and since static methods cannot be overridden, they cannot be abstract, but they can still be defined in an abstract class and can be called using the class name without creating an instance of the class.

//4. can abstract classses have private methods? ->Yes, abstract classes can have private methods, but they cannot be abstract, because private methods are not visible to subclasses, and they cannot be overridden by subclasses, so they cannot be abstract, but they can still be defined in an abstract class and can be used within the abstract class to provide some common functionality that can be used by the concrete methods of the abstract class, but they cannot be accessed or overridden by subclasses.

//5/ can abstract classes have final methods? ->Yes, abstract classes can have final methods, but they cannot be abstract, because final methods cannot be overridden by subclasses, and abstract methods are meant to be overridden by subclasses, so they cannot be abstract, but they can still be defined in an abstract class and can provide some common functionality that cannot be changed by subclasses, but they cannot be overridden by subclasses.

//6. can abstract classes have no abstract methods? ->Yes, abstract classes can have no abstract methods, because an abstract class is defined as a class that cannot be instantiated, and it can have both abstract and concrete methods, so it is not necessary for an abstract class to have abstract methods, it can have only concrete methods, and it can still be declared as abstract, because the main purpose of an abstract class is to provide a common base for other classes to extend and implement their own specific behavior, and it can still serve that purpose even if it does not have any abstract methods, so an abstract class can have no abstract methods.