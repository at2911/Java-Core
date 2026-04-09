

public class inheritance {
    public static void main(String[] args) {
        EngineeringStudent es=new EngineeringStudent();
        es.markAttendance();
        es.attendLab();
    
        Student s=new Student();
        s.markAttendance();
     //   s.attendLab(); //this will give an error because the attendLab method is not defined in the Student class, it is only defined in the EngineeringStudent class.
    }
}

/*
parent(Superclass)-->child(Subclass)
The child class inherits the properties and behaviors of the parent class, which promotes code reusability


*/
class Student{
    String name;
    int age;

    void markAttendance(){
        System.out.println(name+" is present");
    }
}
class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println(name+" is attending lab");
    }
}
