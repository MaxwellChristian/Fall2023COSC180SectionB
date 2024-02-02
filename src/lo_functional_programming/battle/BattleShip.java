package lo_functional_programming.battle;


class BattleShipConstants {
    static final int INDEX_NAME = 0;
    static final int INDEX_NAVY = 1;
    static final int INDEX_TYPE = 2;
    public static final int INDEX_DISPLACEMENT = 3;
    public static final int INDEX_START_YEAR = 4;
    public static final int INDEX_END_YEAR = 5;
}

public class BattleShip {

    private String name;
    private String operatingNavy;
    private String type;
    private long displacement;
    private int startYear;
    private int endOfServiceYear;



    public BattleShip(String []values) {

        this.name = values[BattleShipConstants.INDEX_NAME].trim();
        this.operatingNavy = values[BattleShipConstants.INDEX_NAVY].trim();
        this.type = values[BattleShipConstants.INDEX_TYPE].trim();
        this.displacement = Long.parseLong(values[BattleShipConstants.INDEX_DISPLACEMENT].trim().replace(",", ""));

        this.startYear = Integer.parseInt(values[BattleShipConstants.INDEX_START_YEAR].trim().split("-")[2]);
        this.endOfServiceYear = Integer.parseInt(values[BattleShipConstants.INDEX_END_YEAR].trim().split("-")[2]);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatingNavy() {
        return operatingNavy;
    }

    public void setOperatingNavy(String operatingNavy) {
        this.operatingNavy = operatingNavy;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDisplacement() {
        return displacement;
    }

    public void setDisplacement(long displacement) {
        this.displacement = displacement;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndOfServiceYear() {
        return endOfServiceYear;
    }

    public void setEndOfServiceYear(int endOfServiceYear) {
        this.endOfServiceYear = endOfServiceYear;
    }

    @Override
    public String toString() {
        return "BattleShip{" +
                "name='" + name + '\'' +
                ", operatingNavy='" + operatingNavy + '\'' +
                ", type='" + type + '\'' +
                ", displacement=" + displacement +
                ", startYear=" + startYear +
                ", endOfServiceYear=" + endOfServiceYear +
                '}';
    }
}
