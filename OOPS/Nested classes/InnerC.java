
public class InnerC {
    public static void main(String[] args) {
       //Outer outer= new Outer();//creating an instance of the outer class
      // Outer.Inner inner= outer.new Inner();//creating an instance of the inner class using the instance of the outer class
      Outer.Inner inner=new Outer().new Inner(); //creating an instance of the inner class using the instance of the outer class without outer variable
       inner.fun();
       inner.fun2();
       Outer.Inner.fun2(); //we can also call the static method of the inner class using the class name of the inner class without creating an instance of the inner class
    }
    
}
class Outer{
    int x=10;
    class Inner{
        int x=20;
        void fun(){
            System.out.println(x);
            System.out.println(Outer.this.x);
        }
        static void fun2(){
            System.out.println("Hello");
        }//upto java 16 we cannot declare static members in inner class but from java 17 we can declare static members in inner class but they must be final or constant variables or static methods
    }
}