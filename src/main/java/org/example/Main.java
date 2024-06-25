package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random();

    public static void main(String[] args) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        int numberWins = 0;

        for (int i = 0; i < 1000; i++) {
            DoorsInGame doorsInGame = new DoorsInGame();
            List<Boolean> doors = doorsInGame.getDoors();

            Leader leader = new Leader(doorsInGame);

            int userChoice = rand.nextInt(doors.size());

            int openDoor = leader.openOtherDoor(userChoice);

            for (int j = 0; j < doors.size(); j++) {
                if (j != openDoor && j != userChoice) {
                    map.put(i, doors.get(j));
                    if (doors.get(j)) {
                        numberWins++;
                    }
                }
            }
        }
        int percentageWins = numberWins * 100 / map.size();
        System.out.println(percentageWins);
    }
}