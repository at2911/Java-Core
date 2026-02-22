public class typepromotion{
    public static void main(String[] args){;
    
        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f= 5.67f;
        double d=.12345;
        
        double result = (f*b) + (i/c) - (d*s);

        //f*b -> float
        // i/c --> integer
        // d*s -> double

        //float + integer -> 

        System.out.println((f*b)+ " + " + (i/c)+ " + " + (d*s));
        System.out.println("result = "+ result);

         
    }
}