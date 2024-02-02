package lo_functional_programming.battle;

import jdk.jshell.execution.Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class TestShips {

    public static void main(String[] args) {

        // create a list of BattleShips objects [loaded from the CSV file]
        // try to do this using streams
        // List<BattleShip> lstBattleShips = Utilities.loadFromFile("data_files/BattleShips.csv", csvLine -> new BattleShip(Utilities.parseCSV(csvLine)));
        Function<String, BattleShip> csvToBattleShip = text -> new BattleShip(Utilities.parseCSV(text));
        List<BattleShip> lstBattleShips = Utilities.loadFromFile("data_files/BattleShips.csv", csvToBattleShip );

        // show the count records loaded from the file
        System.out.printf("Total ships loaded: %d\n", lstBattleShips.size());

        // show all the ships
//        for (BattleShip ship: lstBattleShips){
//            System.out.println(ship);
//        }

        // alternate way to show all ships
        lstBattleShips.forEach(System.out::println);

        // count all ships of a particular type of your choice

        // count all ships that have displacement larger than 40,000

        // count the ships from Royal Navy

        // get a list of all ships from Royal Navy

        // display all ships from Royal Navy [sorted as per navy, name and displacement smaller to larger]

        // display the total displacement of all ships from Royal Navy

    }



}
