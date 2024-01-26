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

        if( head == null ){
            return null;
        } else {
            T retNode = this.head.getData();

            this.head = this.head.getNext();

            return retNode;
        }

    }

    // [recursive] return the node which contains the data. Return null if not fount
    public T find(T dataToFind) {
        if( isEmpty() ){
            return null;
        } else {
            return find(this.head, dataToFind);
        }
    }

    private T find(MyNode<T> current, T dataToFind) {

        // base case
        if( current == null ){
            return null;
        }

        if( current.getData() == dataToFind ){
            return current.getData();
        }

        return find(current.getNext(), dataToFind);
    }

    private boolean isEmpty() {
        return head == null;
    }

    // [recursive] remove the data from the list
    public void remove(T dataToRemove){
        if( ! isEmpty() ){
            this.head = remove(this.head, dataToRemove);
        }
    }

    private MyNode<T> remove(MyNode<T> current, T dataToRemove) {

        if( current == null ){
            return null;
        }

        if( current.getData().equals(dataToRemove) ){
            return current.getNext();
        }

        current.setNext(remove(current.getNext(), dataToRemove));
        return current;
    }
}
