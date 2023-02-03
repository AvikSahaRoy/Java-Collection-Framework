// Use of “super” keyword -->>
// 1> to inherit immediate parent class variable value --

// class Parent {
//     int var = 10;
    
//     void displayVar() {
//         System.out.println("value of variable is "+ var);
//     }
// }
    
// class Child extends Parent {
//     int var = 20;
        
//     void displayChildVar() {
//         System.out.println("value of variable under child class "+var);
//         System.out.println("value of variable under parent class "+super.var);
//     }
// }
                        
// class SuperKeyword {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.displayVar();
//         c.displayChildVar();
//     }
// }

// ----------------------------------------------------------------

// 2> To inherit immediate parent class method --

// class Parent {
//     int var = 10;
    
//     void display() {
//         System.out.println("value of variable is "+ var);
//     }
// }
    
// class Child extends Parent {
//     int var = 20;
        
//     void display() {
//         System.out.println("value of variable under child class "+var);
//         //System.out.println("value of variable under parent class "+super.var);
//         super.display();
//     }
// }
                        
// class SuperKeyword {
//     public static void main(String[] args) {
//         Child c = new Child();
//         c.display();
//     }
// }

// ------------------------------------------------------------------------

// Use of “super()” to inherit parent class constructor

// class Const {
//     int var;
    
//     public Const(int var) {
//         this.var = var;
//     }
// }
    
// class ChildConst extends Const {
//     char charVar;
        
//     public ChildConst(int var, char charVar) {
//         super(var);
//         this.charVar = charVar;
//     }
// }

// class SuperKeyword {
//     public static void main(String args[]) {
//         ChildConst cc = new ChildConst(10, 'm');
//         System.out.println("value of int var "+cc.var);
//         System.out.println("value of char var "+cc.charVar);
//     }
// }
        
// ------------------------------------------------------------------------

import java.util.Scanner;

class Parent {
    int age;
    float fees;
    public Parent(int age, float fees) {
        this.age = age;
        this.fees = fees;
    }
    void showAgeandFees() {
        System.out.println("Age is " + age + " and fees is "+ fees);
    }
}

class Child extends Parent {
    String name;
    public Child(int age, float fees, String name) {
        super(age, fees);
        this.name = name;
    }
    void displayName() {
        System.out.println("name is "+name);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age ");
        int age = sc.nextInt();
        System.out.print("Enter your fees ");
        float fees = sc.nextFloat();
        System.out.print("Enter your name ");
        String name=sc.next();
        
        Child c = new Child(age,fees,name);
        c.displayName();
        c.showAgeandFees();
        sc.close();
    }
}
                    