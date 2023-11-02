package lo_oop;

public class TV {

    int channel;
    int volumeLevel;
    boolean on;

    public TV() {
    }

    void turnOn(){
        on = true;
    }

    void turnOff(){
        on = false;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolume(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void channelUp(){
        this.channel++;
    }

    public void channelDown(){
        this.channel--;
    }

    public void volumeUp(){
        this.volumeLevel++;
    }

    public void volumeDown(){
        this.volumeLevel--;
    }
}
