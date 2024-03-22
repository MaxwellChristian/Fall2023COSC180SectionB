package lo_oop.is_a_has_a;

public class Bio {

    String gender;
    String eyeColor;
    int weight;
    int height;
    String bloodGroup;

    public Bio() {
    }

    public Bio(String gender, String eyeColor, int weight, int height, String bloodGroup) {
        this.gender = gender;
        this.eyeColor = eyeColor;
        this.weight = weight;
        this.height = height;
        this.bloodGroup = bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
        return "Bio{" +
                "gender='" + gender + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}
