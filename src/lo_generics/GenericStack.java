package lo_generics;

import java.util.ArrayList;

public class GenericStack<G> {

    private ArrayList<G> list;

    public GenericStack() {
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void push(G object) {
        list.add(object);
    }

    public G pop() {
        return list.remove(list.size() - 1);
    }

    public G peek() {
        return list.get(list.size() - 1);
    }

}
