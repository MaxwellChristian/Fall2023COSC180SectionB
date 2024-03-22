package lo_oop.is_a_has_a;

public class NameParts {
    private String first;
    private String last;
    private String middle;

    public NameParts() {
    }

    public NameParts(String first, String last, String middle) {
        this.first = first;
        this.last = last;
        this.middle = middle;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", middle='" + middle + '\'' +
                '}';
    }
}
