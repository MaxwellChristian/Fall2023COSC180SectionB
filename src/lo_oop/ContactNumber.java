package lo_oop;

public class ContactNumber {

    int countryCode;
    int areaCode;
    int callingNumber;

    public ContactNumber() {
    }

    public ContactNumber(int countryCode, int areaCode, int callingNumber) {
        this.countryCode = countryCode;
        this.areaCode = areaCode;
        this.callingNumber = callingNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getCallingNumber() {
        return callingNumber;
    }

    public void setCallingNumber(int callingNumber) {
        this.callingNumber = callingNumber;
    }

    @Override
    public String toString() {
        return "+" + countryCode + " (" + areaCode + ")" + callingNumber;
    }
}
