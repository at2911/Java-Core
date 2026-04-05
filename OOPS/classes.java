public class classes{
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        s1.name="Ankur";
        s1.age=20;
        s1.rollNumber=101;
        s1.college="ABES";
        s1.markAttendance();
        s1.print();
        

        s2.name="Rahul";
        s2.age=21;
        s2.rollNumber=102;
        s2.college="ABES";
        s2.markAttendance();
        s2.print();
    }
}
class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance(){
        System.out.println("Attendance marked for " + name  + " with roll number " + rollNumber);
    }
    void print(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College: " + college);
    }
}

//java is almost complete object oriented programming language