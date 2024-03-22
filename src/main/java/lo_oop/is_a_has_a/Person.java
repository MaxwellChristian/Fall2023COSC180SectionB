package lo_oop.is_a_has_a;

public class Person {

    NameParts name;
    Bio biometrics;

    public Person() {
    }

    public Person(NameParts name) {
        this.name = name;
    }

    public Person(Bio biometrics) {
        this.biometrics = biometrics;
    }

    public Person(NameParts name, Bio biometrics) {
        this.name = name;
        this.biometrics = biometrics;
    }

    public NameParts getName() {
        return name;
    }

    public void setName(NameParts name) {
        this.name = name;
    }

    public Bio getBiometrics() {
        return biometrics;
    }

    public void setBiometrics(Bio biometrics) {
        this.biometrics = biometrics;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", biometrics=" + biometrics +
                '}';
    }
}
