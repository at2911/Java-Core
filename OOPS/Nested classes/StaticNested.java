public class StaticNested {
    public static void main(String[] args) {
        Outer outer = new Outer(); //creating an instance of the outer class
        Outer.Inner inner = new Outer.Inner(outer); //creating an instance of the static nested class
        //inner.display();
        inner.display();

    }
    
}
//Static nested class
class Outer{
    static int x=10;
    int y;

    static class Inner{
        Outer outer; //we can also access non static members of the outer class by creating an instance of the outer class and passing it as a parameter to the method of the static nested class
        Inner(Outer outer){
            this.outer=outer;
        }

        void display(){ //we can also access non static members of the outer class by creatingq an instance of the outer class and passing it as a parameter to the method of the static nested class
            System.out.println("This is a static nested class");
            System.out.println("Value of x: " + x);
            System.out.println("Value of y: " + outer.y);
        }
    }
}
class BankAccount{
        private static class InterestCalculator{
        static double calculateYearly(double principal , double rate){
            return principal * rate;
        }
    }
    public double computeInterest(double principal){
        return InterestCalculator.calculateYearly(principal, 0.05);
    }
}
