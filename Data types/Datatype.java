
import java.awt.TrayIcon;

public class Datatype{
    public static void main(String[]args){
        // Integer-> byte, short , int long
        byte b=5;
        short s =10;
        int i= 4000;
        long l=1000000;
        System.out.println("Integer Values-->"+ b+" ," + s +" ," + i + " ," + l );
        // Real Numbers
        float f=9.37f;
        double d= 23.990013;
        System.out.println("Float values-->"+ f +" ," + d);

        // characters
        char c='a';
        System.out.println("Character value-->"+c);

        //  boolean 
        boolean bool = false;
        boolean m = true;
        System.out.println("Boolean values -->"+ bool +" ,"+ m);
        
        // for binary , octal and hexadecimal
        int x = 0b110; //use "0b" before it to make it in binary form
        int y=07; //use '0' for octal 
        int z= 0XA; //use '0X' for hexadecimal
        System.out.println("boolean ->"+ x +" octal-> "+y+" hexadecimal-> "+ z);





    }
}