package lo_oop;

public class TV {

    public static final int MAX_VOLUME = 7;
    // class variable [not copied but shared across all objects]

    int channel;    // instance variables
    // each instance/object will have a copy of instance variables
    int volumeLevel;
    boolean on;

    @Override
    public String toString() {
        if( !on ){
            return "TV is OFF";
        }

        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }

    public TV() {
        volumeLevel = 1;
        channel = 1;
    }

    void turnOn(){
        on = true;
    }

    void turnOff(){
        on = false;
    }

    public void setChannel(int channel) {
        if( on && channel >= 1 && channel <= 120 ){
            this.channel = channel;
        }
    }

    public void setVolume(int volumeLevel) {
        if( on && volumeLevel >= 1 && volumeLevel <= 7 ){
            this.volumeLevel = volumeLevel;
        }
    }

    public void channelUp(){
        if( on && this.channel < 120 ){
            this.channel++;
        }
    }

    public void channelDown(){
        if( on && this.channel > 1 ){
            this.channel--;
        }

    }

    public void volumeUp(){
        if( on && volumeLevel < MAX_VOLUME ){
            this.volumeLevel++;
        }
    }

    public void volumeDown(){
        if( on && volumeLevel > 1 ){
            this.volumeLevel--;
        }
    }
}
