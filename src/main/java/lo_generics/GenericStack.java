package lo_generics;

import java.util.ArrayList;

public class GenericStack<G> {

    private ArrayList<G> list;

    public GenericStack() {
        list = new ArrayList<>();
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(G object) throws Exception {
        if( list != null ){
            list.add(object);
        } else {
            throw new NullPointerException("List is empty");
        }
    }

    public G pop() {
        return list.removeLast();
        // return list.remove(list.size() - 1);
    }

    public G peek() {
        //return list.get(list.size() - 1);
        return list.getLast();
    }

}
