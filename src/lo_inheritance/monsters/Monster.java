package lo_inheritance.monsters;

public abstract class Monster {
    private int scareFactor, fast;
    private String name;

    public Monster(String sName, int nSpeed, int nScare) {
        final int minSpeed = 0;
        final int maxSpeed = 10;
        final int defaultSpeed = 5;
        this.fast = nSpeed >= minSpeed && nSpeed <= maxSpeed ? nSpeed : defaultSpeed;
        this.scareFactor = nScare;
        this.name = sName;
    }

    public int getScareFactor() {
        return scareFactor;
    }

    public int getFast() {
        return fast;
    }

    public String getName() {
        return name;
    }

    public void setScare(int nVal) {
        this.scareFactor = nVal;
    }

    public abstract boolean isDeadly();

    public abstract String consumes();

    @Override
    public String toString() {
        return String.format("Name: %-20s  Speed %d Scare Factor %d",
                this.name, this.fast, this.scareFactor);
    }

    @Override
    public boolean equals(Object obOther) {
        if (obOther instanceof Monster) {
            return ((Monster) obOther).name.equals(name);
        }
        return false;
    }

}
