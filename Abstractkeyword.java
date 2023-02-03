abstract class A {
    abstract void s1();

    void s2() {
        System.out.println("Hii");
    }
}

class B extends A {
    void s1() {
        System.out.println("Hello World");
    }
}

class Abstractkeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.s1();
        obj.s2();
    }
}
