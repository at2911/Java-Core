public class encapsulation{

    public static void main(String[] args) {
        BankAccount ba=new BankAccount();
     //   ba.balance=100000;//direct access to the balance variable, which is not recommended

        ba.deposit(100000);
        ba.withdraw(50000);
        System.out.println("Balance: "+ba.getBalance());
        
    }
}
class BankAccount {
    private double balance;
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        //amount<=balance can be added here to check if the withdrawal amount is less than or equal to the balance before allowing the withdrawal
      balance-=amount;
    }
    public double getBalance(){//getters /setters are used to access private variables
        return balance;
    }
}
class Student{
  private  String name;
   private int rollNo;
   private int age;
   private String college;

   Student(String name,int rollNo,int age,String college){
    this.name=name;
    this.rollNo=rollNo;
    this.age=age;
    this.college=college;
   }
   //getters and setters
   public String getName(){
    return name;
   }
   public void SetName(String name){
    this.name=name;
   }
   public String getCollege(){
    return college;
   }
    public void setCollege(String college){
        //validation can be added here to check if the college name is valid before setting it
     this.college=college;
    }

}
  