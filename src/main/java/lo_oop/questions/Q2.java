package lo_oop.questions;

public class Q2 {

    public static void main(String[] args) {
        A2 a1 = new A2();
        B2 b1 = new B2();
    }

}

class A2 {

    public A2(){System.out.println("A2()");}
    public A2(int x) {
        System.out.println("A2(int)");
    }
}

class B2 extends A2 {
    public B2() {
        System.out.print("B2()");
    }
}
