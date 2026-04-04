public class fxn2 {
    public static void main(String[] args) {
        //function overloading
       int x= sum(5, 10);
       System.out.println(x);
       
       int y=sum(8,10);
       System.out.println(y);

       int z=sum(5,10,15);
       System.out.println(z);
       greet("Ankur", 25);
       greet(24, "Ankur");


    }
    static int sum(int a, int b){
        return a+b;
    }   
    static int sum(int a, int b, int c){//different number of parameters
        return a+b+c;
    }
    static int sum(double a, double b){//different data type of parameters
        return (int)(a+b);
    }
    static void greet(String name, int age){
        System.out.println("Hello, " + name + "! You are " + age + " years old. ");
    }
    static void greet(int age, String name){//order of parameters is different
        System.out.println("Hello, " + name + "! You are " + age + " years old. ");
    }


 
}
