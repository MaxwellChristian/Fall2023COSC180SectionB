package lo_multi_threading;

public class CustomThreadDemo {

    public static void main(String ... args) {

        CustomThread cThread1 = new CustomThread("C1");
        CustomThread cThread2 = new CustomThread("C2");
        CustomThread cThread3 = new CustomThread("C3");

        cThread1.start();
        cThread2.start();
        cThread3.start();

    }

}
