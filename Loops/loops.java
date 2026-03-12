public class loops {
    public static void main(String[] args) {
        //loops 
        //WHile loop ->infite loop
        int i = 1;
        while (i<=10) { //boolean expression->true/false              
            //do something
            System.out.println(i);

            i++;
        }
        //Do while
        i = 1;
        do{
            //do something
            System.out.println(i);
            i++;

        }while(i<=10);
        //Menu item selection -> do while
        /*
        Play game  
        Return saved game
        Exit 
         */

        //for loop
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        
        //Comma separated for loop
        int j=1;
        for( i=1, j=1;i<=10 && j<=5;i++,j++){
            System.out.println(i*j);
        }

         
 
    }
}