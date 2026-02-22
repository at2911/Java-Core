public class TypeC{
    public static void main(String[] args){
        // Implicit
        //bye to int
        byte b=24;
        int i;
        i=b;
        System.out.println(i); //24

        //Character to Int
        char c='A';
        int j=c;
        System.out.println(j); //65


        //Explicit Conversion
        int k=300;
        byte d; //(-128 to 127)
        d=(byte)k;
        System.out.println(d); //300% 256 =44

        //Truncating coversion
        float f= 15.89f;
        int e;
        e=(int )f;
        System.out.println(e);

        //Boolean to other data type
        // These conversions are not possible

        /* boolean bool=false;
        int l;
        l=(int)bool;
        System.out.println(l);
        */
       byte B=50;
       B= (byte)(B*2);
       System.out.println(B);

    }
}