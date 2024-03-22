package lo_oop.questions;

public class Q1 {

    public static void main(String[] args) {

        A a1 = new A();
        B b1 = new B();

    }

}

class A {
    public A() {
        System.out.println("A()");
    }
}

class B extends A {
    public B() {
        System.out.print("B()");
    }
}
