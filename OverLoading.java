// Methods overloading by changing the number of arguments -->>
// Methods overloading by changing the type of arguments-->>

class OverLoadingClass {
    void method (int a) {
        System.out.println("value of first var "+ a);
    }
    
    void method (int a, int b, int c) {
        System.out.println("value of first var "+ a + " value of second var "+b+" value of 3rd var "+c);
    }

    void method (int a, Float b) {
        System.out.println("value of first var "+ a + " value of second var "+b);
    }

    void method (String str1,String str2) {
        String str3 = str1 + str2;
        System.out.println("After concatination"+str3);
    }
        
}
    
class OverLoading {
    public static void main(String[] args) {
        OverLoadingClass olc = new OverLoadingClass();
        olc.method(10);
        olc.method(10, 20, 30);
        olc.method(10, 20.00f);
        olc.method(" Asansol ", "Engineering College");
    }    
}