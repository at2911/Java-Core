//Local classes
public class LocalC {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();
    }
    
}
//effectively final variable: a variable that is not declared as final but is not modified after it is initialized. Local classes can access effectively final variables from the enclosing method.

class Outer{
    //static private int x=4;
    void greet(){
        int y=5; //effectively final variable
      //  y++; //modifying the variable y will cause a compile-time error because local classes can only access effectively final variables
        System.out.println("Hello from the outer class");  
        class Local{
            void sayHello(){
                System.out.println(y);
            }
        } 
        Local local = new Local();
        local.sayHello();
    }
}
/*
constructor
Method
If
Loop
Static blocks
*/
