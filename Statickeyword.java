// Static Keyword in JAVA -->> 
// 1> In Java, static keyword is mainly used for memory management.
// 2> It can be used with variables, methods, blocks and nested classes. 
// 3> It is a keyword which is used to share the same variable or method of a given class. 
// 4> Basically, static is used for a constant variable or a method that is same for every instance of a class.

class Student {
    int rollNo;
    String name;
    static String college = "SIT"; // Static variable

    Student (int r, String n) { // constructor
        rollNo = r;
        name = n;
    }

    void display() { // method to display the values
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Avik");
        s1.display();
    }
}
