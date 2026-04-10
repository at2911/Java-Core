public class interfaces {
    public static void main(String[] args) {
        Car c1=new EV();
        Car c2=new FC();

        c1.start();
        c1.acc();
        c1.brake();

        c2.start();
        c2.acc();
        c2.brake();
        
    }
}
interface Car{
    void start();
    void acc();
    void brake();
}
class EV implements Car{
    @Override 
    public void start(){
        System.out.println("EV is starting");
    }
    public void acc(){
        System.out.println("EV is accelerating");
    }
    public void brake(){
        System.out.println("EV is braking");
    }

}
class FC implements Car{
    @Override 
    public void start(){
        System.out.println("FC is starting");
    }
    public void acc(){
        System.out.println("FC is accelerating");
    }
    public void brake(){
        System.out.println("FC is braking");
    }

}