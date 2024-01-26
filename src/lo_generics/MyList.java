package lo_generics;

public class MyList<T> {

    MyNode<T> head;

    public MyList() {
        this.head = null;
    }

    public void add(T data){
        this.head = add(this.head, data);
    }

    private MyNode<T> add(MyNode<T> current, T data) {

        // base case
        if( current == null ){
            return new MyNode<>(data);
        }

        // recursive case
        current.setNext( add(current.getNext(), data) );
        return current;
    }

    @Override
    public String toString() {
        return toString(this.head);
    }

    private String toString(MyNode<T> current) {
        if( current == null ){
            return "";
        } else {
            return current.getData() + ":" + toString(current.getNext());
        }
    }

    // [recursive] remove and return the first node of the list
    public T dequeue(){

        return null;
    }

    // [recursive] return the node which contains the data. Return null if not fount
    public T find(T dataToFind) {
        return dataToFind;
    }

    // [recursive] remove the data from the list
    public void remove(T dataToRemove){

    }
}
