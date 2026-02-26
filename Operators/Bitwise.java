public class Bitwise{
    public static void main(String[] args) {
        //Bitwise operators
        int a=2; //10 --> 0000 0000 0000 0000 0000 00000 0000 0010

        int b=3; //11 -> 0000 0000 0000 0000 0000 00000 0000 0011
        int c=a&b; // 10
        int d= a|b;//11
        int e=a^b;//01
        int f= ~a; // 1111 1111 1111 1111 1111 1111 1111 1101 ->  -3
        System.out.println(c+" , "+d+" , "+e+" , "+f);

        //Shift operator
        int g=1;
        g=g<<32; // -. 32%32=1;
        System.out.println(g);

        //right shift
        byte h=1;
        h=(byte)(h<<1);
        System.out.println(h);

        
    }
}