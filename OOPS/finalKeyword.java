public class finalKeyword {
    public static void main(String[] args) {
        Random r1 = new Random(3.14);
        System.out.println(r1.PI);//final variable can be accessed but cannot be changed
        final int x;
        x=5;//final variable can be assigned a value only once
        

        
    }
    static class Random {
        final double PI;//final variable cannot be changed once initialized 
        Random(double PI){
            this.PI=3.14;//final variable cannot be assigned a value more than once
        }
    }
}
