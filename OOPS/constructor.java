public class constructor{
    public static void main(String[] args){
        //day 2 of oops
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNo);
        System.out.println(s1.college);
        Student s2 = new Student("Rahul", 21, 456, "ABC");
        System.out.println(s2.name);    
        System.out.println(s2.age);
        System.out.println(s2.rollNo);
        System.out.println(s2.college);
        


    }
}
class Student{
    String name;
    int age;
    int rollNo;
    String college;
    void markAttendance(){
        System.out.println("Attendance marked for " + name);
    }
  
   //default constuctor
    Student(){

    }

    Student(String n, int a, int r, String c){
       name=n;
       age=a;
       rollNo=r;
       college=c;

    }
}