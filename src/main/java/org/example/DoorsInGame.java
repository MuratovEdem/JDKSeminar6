package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DoorsInGame {
    private int numberDoors = 3;
    @Getter
    private List<Boolean> doors;
    @Getter
    private int winningDoor = Main.rand.nextInt(numberDoors);

    public DoorsInGame() {
        doors = new ArrayList<>();
        for (int i = 0; i < numberDoors; i++) {
            if (i == winningDoor) {
                doors.add(true);
            } else {
                doors.add(false);
            }
        }
    }

}
