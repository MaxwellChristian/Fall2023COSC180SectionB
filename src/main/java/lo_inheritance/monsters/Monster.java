package lo_inheritance.monsters;

import java.util.Comparator;
import java.util.Objects;

public abstract class Monster implements Comparable<Monster>, Comparator<Monster> {
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
    public boolean equals(Object o) {

        // check if current and the parameter object has same reference
        if (this == o) return true;

        // check if the parameter is not null and
        // the current object and parameter belongs to the same class
        if (o == null || getClass() != o.getClass()) return false;

        // type cast to the desired class
        Monster monster = (Monster) o;

        // compare the required fields
        return scareFactor == monster.scareFactor && fast == monster.fast && Objects.equals(name, monster.name);
    }

    @Override
    public int compareTo(Monster o) {
        return this.scareFactor - o.scareFactor ;
    }

    @Override
    public int compare(Monster m1, Monster m2) {
        return m1.scareFactor - m2.scareFactor ;
    }
}
