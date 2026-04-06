public class constructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");
        Student s3 = new Student("mohan ", 21);
        Student s4 = new Student("shyam", 21, 456);
        Student s5 = new Student("anshul", 21, 456, "ABC");
        System.out.println(s1.name);
        System.out.println(s3.rollNo);
        System.out.println(s4.college);
    }
    static class Student{
    String name;
    int age;
    int rollNo;
    String college;
    void markAttendance(){
        System.out.println("Attendance marked for " + name);
    }
 //2nd method of constructor chaining
   Student(){
    this("Unknown");

   }
   Student(String name){
    this(name, 0);

   }
   Student(String name, int age){
    this(name, age, 0);

   }
    Student(String name, int age, int rollNo){
        this(name, age, rollNo, null);  

}
Student(String name, int age, int rollNo, String college){
   this.name=name;
   this.age=age;
   this.rollNo=rollNo;
   this.college=college;    

}
    }

}