public class fxn {
    public static void main(String[] args) {                  

        //functions       
        greet();
        hello("Ankur"); 
        int x = getNuber();
        System.out.println(x);
        int y = multiply(5, 10);
        System.out.println(y);
    }
    //No i/p , no o/p
    static void greet(){
        System.out.println("Hello");
        return;//optional

    }
    //i/p , no o/p
    static void hello(String name){ //number of parameters can be more than 1
        System.out.println("Hello "+name);
    }
    //no ip , o/p
    static int getNuber(){
        return 10;
    }
    //ip, o/p
    static int multiply(int a, int b){
        return a*b;
    }

     

       

}


