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

    }

}
