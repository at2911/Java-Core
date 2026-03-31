public class array{
    public static void main(String[] args) {
        int[] rollNos= new int[3]; //declaration and instantiation of array
        // rollNos[0]=101; //initialization of array
        // rollNos[1]=102;
        // rollNos[2]=103;
        // System.out.println(rollNos[0]);
        // System.out.println(rollNos[1]);
        // System.out.println(rollNos[2]);

        // System.out.println("Length of array is "+rollNos.length); //length of array

        int x=101;
        for(int i=0;i<rollNos.length;i++){
            rollNos[i]=x;
            x++;
        }
        for(int i=0;i<rollNos.length;i++){
            System.out.println(rollNos[i]);
        }
    }
}