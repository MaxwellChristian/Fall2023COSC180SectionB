package lo_generics;

public class MyListDemo {

    public static void main(String []args) {

        MyList<String> mList = new MyList<>();

        mList.add("AA");
        mList.add("BB");
        mList.add("CC");

        System.out.println(mList);

        mList.add("DD");
        mList.add("EE");

        System.out.println(mList);

        // dequeue
        System.out.println("Dequeued: " + mList.dequeue()); // should display AA
        System.out.println(mList);  // BB:CC:DD:EE:

        // find
        System.out.printf("Finding 'DD1': %s\n", ((mList.find("DD1") != null) ? "found" : "not found"));
        System.out.printf("Finding 'DD': %s\n", ((mList.find("DD") != null) ? "found" : "not found"));

        // remove
        mList.remove("DD");
        System.out.println("After removing DD: " + mList);

    }

}
