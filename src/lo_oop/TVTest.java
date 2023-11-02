package lo_oop;

public class TVTest {

    public static void main(String []args) {

        TV tv1;

        tv1 = new TV();
        System.out.println("On/Off: " + tv1.on);
        System.out.println("Channel: " + tv1.channel);
        System.out.println("Volume: " + tv1.volumeLevel);

        tv1.turnOff();
        tv1.channelUp();
        tv1.channelUp();
        tv1.volumeDown();
        tv1.volumeDown();
        tv1.volumeDown();
        System.out.println("On/Off: " + tv1.on);
        System.out.println("Channel: " + tv1.channel);
        System.out.println("Volume: " + tv1.volumeLevel);

    }

}
