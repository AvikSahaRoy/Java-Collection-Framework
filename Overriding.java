class ParentClass {
    int x,y;
    
    void method(int a, int b) {
        System.out.println("value of a "+a+"value of b "+b);
    }
}
    
class Child extends ParentClass {
    int x,y;
    
    void method(int a, int b) {
        System.out.println("value of a "+a+"value of b "+b);
    }
}
            
class Overriding {
    public static void main(String[] args) {
        ParentClass p;
        
        p = new Child();
        p.method(10, 20);
        
        p = new ParentClass();
        p.method(20, 10);    
    }        
}
