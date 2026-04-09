public class superKeyword {
    public static void main(String[] args) {
        // EngineeringStudent es=new EngineeringStudent();
        // es.name="Ankur";
        // es.age=21;
        // es.rollNo=101;
        // es.College="ABC College";
        // es.print();
        EngineeringStudent es=new EngineeringStudent("Ankur", 21, 101, "ABC College");
        es.print(); 

    }
}
class Student{
    String name;
    int age;
    int rollNo;
   // int x;
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollNo);
       
    }
    Student(String name, int age, int rollNo){
        this.name=name;
        this.age=age;
        this.rollNo=rollNo;
    }
    Student(){

    }
}
class EngineeringStudent extends Student{
   String College;
    //int x;
    /* 
   void print(){
    System.out.println(super.name); //super keyword is used to access the parent class variable name
    System.out.println(super.age); //optional to use super keyword to access the parent class variable age, because it is not defined in the child class, but it is inherited from the parent class, so we can access it directly without using super keyword
    System.out.println(super.rollNo); 
    System.out.println(x); //this will access the x variable defined in the child class, because it is defined in the child class, so it will take precedence over the x variable defined in the parent class
    System.out.println(super.x); //this will access the x variable defined in the parent class, because we are using super keyword to access it, so it will take precedence over the x variable defined in the child class
    */
   
   void print(){
     super.print(); //super keyword is used to call the parent class method print() to print the name, age and rollNo variables defined in the parent class, and then we can print the College variable defined in the child class
     System.out.println(College);
   }
   EngineeringStudent(String name, int age, int rollNo, String College){
    super(name, age, rollNo); //super keyword is used to call the parent class constructor to initialize the name, age and rollNo variables defined in the parent class, and then we can initialize the College variable defined in the child class
    this.College=College;               
   }
}

