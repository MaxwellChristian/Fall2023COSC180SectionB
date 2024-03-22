package lo_oop;

public class Biometrics {

    // eye color
    // weight   // in lbs
    // height   // in cms
    // blood group

    private String eyeColor;
    private int weight;
    private int height;
    private String bloodGroup;

    public Biometrics() {
    }

    public Biometrics(String eyeColor, int weight, int height, String bloodGroup) {
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.height = height;
        this.bloodGroup = bloodGroup;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Biometrics{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}
