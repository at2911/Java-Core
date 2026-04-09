//Types of Inheritance in Java
/*
1.simple inheritance
2.multilevel inheritance
3.hierarchical inheritance
4.multiple inheritance (not supported in Java, but can be achieved using interfaces)


*/


public class inheritanceType {
    public static void main(String[] args) {
        CSEStudent cs=new CSEStudent();
        cs.attendCodingClass();
        
    }
}
class Student{//parent class ->A
    String name;
    int age;

    void markAttendance(){
        System.out.println(name+" is present");
    }
}
class EngineeringStudent extends Student{ //child class ->B
    void attendLab(){
        System.out.println(name+" is attending lab");
    }
}
class MedicalStudent extends Student{ //child class ->C
    void attendMedicalClass(){
        System.out.println(name+" is attending medical class");
    }
} 
class CSEStudent extends EngineeringStudent{ //child class of EngineeringStudent, which is a child class of Student
    void attendCodingClass(){
        System.out.println(name+" is attending coding class");
    }
}
/* Multi level inheritance: A class can inherit
A->B->C : Student->EngineeringStudent->CSEStudent (multilevel inheritance)
 */

/*Hierarchical inheritance: A class can have multiple child classes
     A
   /  \
   B   C
 

*/

/*Multiple inheritance: A class can inherit from multiple classes, but this is not supported in Java. However, it can be achieved using interfaces.
   A   B
    \ /
     C

*/