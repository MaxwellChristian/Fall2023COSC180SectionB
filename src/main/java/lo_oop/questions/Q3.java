package lo_oop.questions;

public class Q3 {

    public static void main(String []args) {
        A3 a3 = new A3();
        a3.m1(5.2);
        a3.m1("Welcome");

        B3 b3 = new B3();
        b3.m1(2.5);
    }

}

class B3 {
    public B3(){}
    public void m1(double d){
        System.out.println("D*2: " + d*2);
    }
}

class A3 extends B3{
    public A3(){}
    public void m1(String d){
        System.out.println("String D: " + d);
    }

    // this m1(double) will override the m1(double) of the base class
    public void m1(double d2){
        System.out.println("Derived class m1(d2)");
    }
}
