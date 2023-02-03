// class FinalVariable {
//     final int rollNo = 10; // final variable

//     void run() {
//         rollNo = 40;
//     }
//     public static void main(String[] args) {
//         FinalVariable s1 = new FinalVariable();
//         s1.run();
//     }
// }


class s1 {
    final void run() {
        System.out.println("Hello");
    }
}

class FinalVariable extends s1 {
    void run() {
        System.out.println("World");
    }
    public static void main(String[] args) {
        FinalVariable s1 = new FinalVariable();
        s1.run();
    }
}
