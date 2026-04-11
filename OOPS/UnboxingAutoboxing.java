public class UnboxingAutoboxing {
    public static void main(String[] args) {
       //Autoboxing 
       int x=10;
       Integer y=x; //autoboxing, it is the process of converting a primitive type to its corresponding wrapper class, it is done automatically by the compiler, so we can assign a primitive type to a wrapper class variable, and the compiler will automatically convert it to the corresponding wrapper class object, so in this case, the primitive type int is converted to the wrapper class Integer, and the value 10 is assigned to the variable y, which is of type Integer
    //   Integer y=Integer.valueOf(x);
       System.out.println(x);
     //  System.out.println(y.intValue());
       System.out.println(y);//unboxing here because when we print the variable y, it will automatically unbox the wrapper class object to its corresponding primitive type value, so it will print 10, which is the value of the variable x, because the variable y is assigned the value of the variable x through autoboxing, and when we print the variable y, it will automatically unbox it to its corresponding primitive type value, which is 10, and print it

       //Unboxing

       //Integer a=new Integer(20);//not recommended 
       Integer a=20;//autoboxing 
       int b=a; //unboxing, it is the process of converting a wrapper class object to its corresponding primitive type, it is done automatically by the compiler, so we can assign a wrapper class object to a primitive type variable, and the compiler will automatically convert it to the corresponding primitive type value, so in this case, the wrapper class Integer is converted to the primitive type int, and the value 20 is assigned to the variable b, which is of type int
    
       System.out.println(a); //unboxing here  
       System.out.println(b);

       printInteger(100);
       Integer z=50;
       printInteger(z);

       Integer p=null;
      // int q=p;//unboxing here, this will throw a NullPointerException, because when we try to unbox the variable p, which is null, it will try to convert it to the primitive type int, but since it is null, it will throw a NullPointerException, because we cannot unbox a null value to a primitive type, so we need to make sure that the wrapper class object is not null before we try to unbox it to a primitive type, otherwise we will get a NullPointerException at runtime
       //System.out.println(q);//Nullpointer exception 
    }
    static void printInteger(int x){
        System.out.println(x);
    }
}

// 1. Assignments
// 2. Method arguments