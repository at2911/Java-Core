public class switchs {

    public static void main(String[] args) {

        int i = 3;

        switch(i) { //swtichexpression-->byte,short,char,int, Enumeration

            case 1:
                System.out.println("i is 1");
                break;

            case 2:
                System.out.println("i is 2");
                break;

            case 3:
                System.out.println("i is 3");
                break;

            default:
                System.out.println("i is greater than 3");
                break;
        }

        //Switch-->limited use case -->should evaluate to  byte,short,char,int, Enumeration
        //No duplicate cases allowed.
        //AFter JDK7 string can alse be used as switch expression
        //AFter JDK 14  switch is enhanced too much
        int j=5;
        switch(j){
            case 4:
                System.out.println("j s 4");
                break;
            case 5:
                System.out.println("j is 5");
                break;
            default:{
                System.out.println
            }
;        }

    }
}