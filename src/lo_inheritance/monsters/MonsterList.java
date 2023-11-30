package lo_inheritance.monsters;

import java.util.ArrayList;

public class MonsterList
{
    public static void main(String[] args)
    {
        ArrayList<Monster> aMonList = new ArrayList<>();

        aMonList.add(new Greek("Minotaur", 55, 5));
        aMonList.add(new Greek("Kraken", 75,4));
        aMonList.add(new Greek("Chimera", 45, 7));
        aMonList.add(new EvilEye("Beholder", 99, 1, 50));
        aMonList.add(new EvilEye("Gorgon", 93,2,25));
        aMonList.add(new EvilEye("Mind Flayer", 72,2,45));
        aMonList.add(new Lucky("Leprechaun", 0, 9, "Gives Gold"));
        aMonList.add(new Lucky("Genie", 5,6, "Grans Wishes"));
        aMonList.add(new Lucky("Fairy Queen", 10, 4, "Gives Advice"));
        aMonList.add(new UnDead("Vampire", 99, 8, true));
        aMonList.add(new UnDead("Zombie", 75, 2, false));
        aMonList.add(new UnDead("Wraith", 89, 7,true));

        //Sample problems for ArrayList

        //How many Undead Monsters?
        int totalUndeadMonsters = countUndead(aMonList);
        System.out.println("Total Undead Monsters: " + totalUndeadMonsters);

        //Create a sublist of Deadly monsters
        ArrayList<Monster> deadlyMonsters = new ArrayList<>();
        for(Monster monster: aMonList) {
            if( monster.isDeadly() ){
                deadlyMonsters.add(monster);
            }
        }

        //Count the number of flying undead monsters in the List.
        int totalFlyingUndeadMonsters = countUndead(aMonList, true);
        System.out.println("Total (flying) Undead Monsters: " + totalFlyingUndeadMonsters);

        EvilEye e1 = new EvilEye("EE1", 10, 11, 12);
        EvilEye e2 = new EvilEye("EE1", 10, 11, 14);

//        Monster m1 = aMonList.get(0);
//        Monster m2 = aMonList.get(0);


        if( e1.equals(e2) ){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Both are different");
        }

    }

    private static int countUndead(ArrayList<Monster> aMonList) {

        int counter = 0;
        for (Monster monster: aMonList) {
            if( monster instanceof UnDead ){
                counter++;
            }
        }

        return counter;
    }

    private static int countUndead(ArrayList<Monster> aMonList, boolean canFly) {

        int counter = 0;
        for (Monster monster: aMonList) {
            if( monster instanceof UnDead && ((UnDead) monster).bCanFly ){
                counter++;
            }
        }

        return counter;
    }
}
