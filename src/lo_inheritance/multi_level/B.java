package lo_inheritance.multi_level;

// final method: cannot be override
// final class : cannot be extended

public class B extends A {

    private int bVar;

    public B() {
        System.out.println("B()");
    }

    public void pubFn(){

    }

    private void priFn(){

    }

    protected void procFn() {

    }

    final void finalFn(){

    }
}
