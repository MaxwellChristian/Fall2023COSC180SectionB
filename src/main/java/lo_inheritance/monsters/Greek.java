package lo_inheritance.monsters;

public class Greek extends Monster {
    public Greek(String sName, int nScare, int nFast) {
        super(sName, nFast, nScare);
    }

    @Override
    public boolean isDeadly() {
        return true;
    }

    @Override
    public String consumes() {
        return "Humans";
    }

    @Override
    public String toString() {
        return String.format("Greek: %s", super.toString());
    }
}
