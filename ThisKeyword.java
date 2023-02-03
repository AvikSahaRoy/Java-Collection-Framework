// invoking current class method -->>

// class ThisKeyword1 {
//     void m() {
//         System.out.println("hello from m()");
//     }
//     void n() {
//         System.out.println("hello from n()");
//         this.m();
//     }
// }   

// class ThisKeyword {
//     public static void main(String args[]) {
//         ThisKeyword1 a = new ThisKeyword1();
//         a.n();
//     }
// }

// -------------------------------------------------------------

// this() can be used to invoke current class constructor -->>

// class A {
//     A() {
//         System.out.println("hello from a()");
//     }
//     A(int x) {
//         this();
//         System.out.println(x);
//     }
// }
    
// class ThisKeyword {
//     public static void main(String args[]) {
//         A a = new A(10);
//     }
// }

// -----------------------------------------------------------------

// this can be passed as an argument in the method call -->>
// to return the current class instance from the method -->>

// class ThisKeyword {
//     void m(ThisKeyword obj) {
//         System.out.println("method is invoked");
//     }
//     void p() {
//         m(this);
//     }
//     public static void main(String args[]){
//         ThisKeyword s1 = new ThisKeyword();
//         s1.p();
//     }
// }
     
// -----------------------------------------------------------------

// “this” can be passed argument in the constructor call -->>

// class B {
//     ThisKeyword obj;
//     B(ThisKeyword obj) {
//         this.obj = obj;
//     }
//     void display() {
//         System.out.println(obj.data);//using data member of A class
//     }
// }

// class ThisKeyword {
//     int data = 10;
//     ThisKeyword() {
//         B b = new B(this);
//         b.display();
//     }
//     public static void main(String args[]) {
//         ThisKeyword a = new ThisKeyword();
//     }
// }

// -----------------------------------------------------------------

// class Student {
//     int rollno;
//     String name,course;
//     float fee;
//     Student(int rollno,String name,String course) {
//         this.rollno=rollno;
//         this.name=name;
//         this.course=course;
//     }
//     Student(int rollno,String name,String course,float fee) {
//         this(rollno,name,course);//reusing constructor
//         this.fee=fee;
//     }
//     void display() {
//         System.out.println(rollno+" "+name+" "+course+" "+fee);
//     }
// }
// class ThisKeyword {
//     public static void main(String args[]) {
//         Student s1=new Student(111,"ankit","java");
//         Student s2=new Student(112,"sumit","java",6000f);
//         s1.display();
//         s2.display();
//     }
// }
    
    
    