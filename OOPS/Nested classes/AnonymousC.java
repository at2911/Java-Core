//Anonymous classes

public class AnonymousC {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.introduce();
        // Person p2=new Guest();
        // p2.introduce();
        Person p2=new Person(){//anonymous class is a class that is defined without a name and is instantiated at the same time. It is used to create an instance of a class that implements an interface or extends a class without having to create a separate class file for it.
            String name="Ankur";
            @Override
            void introduce(){
                greet();
                System.out.println("Hi,I am "+name);
            }
            void greet(){
                System.out.println("Hello");
            }
        };
        p2.introduce();
       // p2.greet();//we cannot call the method greet() because it is not defined in the Person class and p2 is of type Person. To call the method greet() we need to cast p2 to the anonymous class type but since the anonymous class does not have a name we cannot cast it to its type. We can only call the methods that are defined in the Person class using the reference variable p2.

    }
}
class Person{
    void introduce(){
        System.out.println("HI,I am a person");
    }
}
// class Guest extends Person{
//     @Override
//     void introduce(){
//         System.out.println("Hi,I am a guest");
//     }
// }

/*
Mostly used class: Static nested class
Inner class

Anonymous class -->Lambdas
Local class

*/
