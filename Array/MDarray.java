

public class MDarray {
    public static void main(String[] args) {
        //2D array
        int [][] marks= new int[3][3]; //declaration and instantiation of 2D array
        marks[0][0]=85; //initialization of 2D array
        marks[0][1]=90;
        marks[0][2]=95;
        marks[1][0]=80;
        marks[1][1]=85;
        marks[1][2]=90;
        marks[2][0]=75;
        marks[2][1]=80;
        marks[2][2]=85;
        for(int row=0;row<marks.length;row++){
            for(int col=0;col<marks[row].length;col++){
                System.out.print(marks[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("Length of 2D array is "+marks.length); //length of 2D array
        //Diffrent no of columns in each row
        int [][] marks2= new int[3][]; //declaration and instantiation of 2D array
        marks2[0]=new int[2]; //initialization of 2D array
        marks2[1]=new int[3];
        marks2[2]=new int[4];
        marks2[0][0]=85;
        marks2[0][1]=90;
        marks2[1][0]=80;
        marks2[1][1]=85;
        marks2[1][2]=90;
        marks2[2][0]=75;
        marks2[2][1]=80;
        marks2[2][2]=85;
        marks2[2][3]=90;
        for(int row=0;row<marks2.length;row++){
            for(int col=0;col<marks2[row].length;col++){
                System.out.print(marks2[row][col]+" ");
            }
            System.out.println();
        }   








}
}
