public class polymorphism {
    public static void main(String[] args) {
        // A a=new B();
        // B b=new B();
        // a.fun(); //this will call the fun method defined in class A, because the reference variable a is of type A, and it is referring to an object of type B, but the method fun() is defined in class A, so it will call the fun method defined in class A, because it is a static method, and static methods are resolved at compile time based on the reference type, not the object type
        A a=new B();
        System.out.println(a.x); //this will print 10, because the reference variable a is of type A, and it is referring to an object of type B, but the variable x is defined in class A, so it will access the variable x defined in class A, because it is not polymorphic, and variables are resolved at compile time based on the reference type, not the object type
        B b=new B();
        System.out.println(b.x); //this will print 20, because the reference variable b is of type B, and it is referring to an object of type B, and the variable x is defined in class B, so it will access the variable x defined in class B, because it is hiding the variable x defined in class A, and it is not polymorphic, so it will not override it, it will only hide it
       
        
    }
}
// Static -> they belong to class not to objects
//Private methods -> they cant be overriden 
//Final methods -> they cant be overriden

//

//Fields / variables -> they can not be polymorphic 
// class A{
//     static void fun(){
//         System.out.println("fun method in class A");
//     }
//     private void fun1(){
//         System.out.println("fun1 method in class A");
//     }
//     final void fun2(){
//         System.out.println("fun2 method in class A");
//     }
// }
// class B extends A{
//     static void fun(){
//         System.out.println("fun method in class B");
//     }
//     private void fun1(){
//         System.out.println("fun1 method in class B");
//     }
//     void fun2(){
//         System.out.println("fun2 method in class B");
//     }
// }

class A{
    int x=10;
}
class B extends A{
    int x=20; //variables can not be polymorphic, so this variable x will hide the variable x defined in class A, and it will not override it, because variables can not be overridden, they can only be hidden, so when we access the variable x using the reference variable of type A, it will access the variable x defined in class A, and when we access the variable x using the reference variable of type B, it will access the variable x defined in class B, because it is hiding the variable x defined in class A, and it is not polymorphic, so it will not override it, it will only hide it
}

