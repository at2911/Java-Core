public class Main {
    public static void main(String[] args) {
        //call by refrence-> there is no call by reference in java but we can achieve it by using object reference
        Random r1=new Random(5, 10);
        System.out.println("Before adding 10: x=" + r1.x + ", y=" + r1.y);
        addTen(r1);
        System.out.println("After adding 10: x=" + r1.x + ", y=" + r1.y);
        Random r2=new Random(r1);//we can pass object as parameter and it will be passed by reference //deep copy-> r2 is a new object in memory with the same values as r1
        System.out.println("r2: x=" + r2.x + ", y=" + r2.y);
        Random r3=r1;//shallow copy-> both r1 and r3 point to the same object in memory

    }
    static void addTen(Random r){//we can pass non primitive data type as parameter and it will be passed by reference
        r.x+=10;
        r.y+=10;

    }

}
class Random{
    int x;
    int y;
    Random(int x, int y){
        this.x=x;
        this.y=y;
    }
    Random(Random r){//we can pass object as parameter and it will be passed by reference
        this.x=r.x;
        this.y=r.y;
    }
}
