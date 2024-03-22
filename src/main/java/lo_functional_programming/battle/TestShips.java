package lo_functional_programming.battle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestShips {

    public static void main(String[] args) {

        // create a list of BattleShips objects [loaded from the CSV file]
        // try to do this using streams
        // List<BattleShip> lstBattleShips = Utilities.loadFromFile("data_files/BattleShips.csv", csvLine -> new BattleShip(Utilities.parseCSV(csvLine)));
        Function<String, BattleShip> csvToBattleShip = text -> new BattleShip(Utilities.parseCSV(text));
        List<BattleShip> lstBattleShips = Utilities.loadFromFile("data_files/BattleShips.csv", csvToBattleShip);

        // show the count records loaded from the file
        System.out.printf("Total ships loaded: %d\n", lstBattleShips.size());

        // show all the ships
//        for (BattleShip ship: lstBattleShips){
//            System.out.println(ship);
//        }

        // alternate way to show all ships
        lstBattleShips.forEach(System.out::println);

        // show all types of battle ship
//        lstBattleShips.stream().map(battleShip -> battleShip.getType()).toList();
        List<String> lstTypes = lstBattleShips.stream().map(BattleShip::getType).toList();

        // count all ships of a particular type of your choice
        System.out.printf("Ships of type 'fast battleship': %d\n", lstBattleShips.stream()
                .filter(battleShip -> battleShip.getType().equals("fast battleship"))
                .count()
        );

        // count all ships that have displacement larger than 40,000
        System.out.printf("Ships [>40,000 displacement]: %d\n", lstBattleShips.stream()
                .filter(battleShip -> battleShip.getDisplacement() > 40000)
                .count()
        );

        // count the ships from Royal Navy
        System.out.printf("Total Ships from 'Royal Navy': %d\n", lstBattleShips.stream()
                .filter(battleShip -> battleShip.getOperatingNavy().equals("Royal Navy"))
                .count()
        );

        // get a list of all ships from Royal Navy
        ArrayList<BattleShip> royalNavyBattleShips = lstBattleShips.stream()
                .filter(battleShip -> battleShip.getOperatingNavy().matches(".*Royal Navy"))
                .collect(Collectors.toCollection(ArrayList::new));

        // display all ships from Royal Navy [sorted as per navy, name and displacement smaller to larger]
        lstBattleShips.stream()
                .sorted(Comparator.comparing(battleShip -> (battleShip.getOperatingNavy() + battleShip.getName() + battleShip.getDisplacement())))
                .forEach(System.out::println);

        // display the total displacement of all ships from Royal Navy
        System.out.printf("Total displacement of Ships from 'Royal Navy': %d\n", royalNavyBattleShips.stream()
                .map(BattleShip::getDisplacement)
                .reduce(0L, Long::sum)
        );
    }


}
