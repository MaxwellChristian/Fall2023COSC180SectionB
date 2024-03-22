package lo_multi_threading;

public class CustomThreadDemo2 {

    public static void main(String ... args) {

        CustomThread2 cThread1 = new CustomThread2("C1", 100);
        CustomThread2 cThread2 = new CustomThread2("C2", 100);
        CustomThread2 cThread3 = new CustomThread2("C3", 100);

        cThread1.start();
        cThread2.start();
        cThread3.start();

    }

}
