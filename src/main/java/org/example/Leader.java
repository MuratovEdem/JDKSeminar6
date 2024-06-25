package org.example;

import java.util.List;

public class Leader {
    private DoorsInGame doorsInGame;

    public Leader(DoorsInGame doorsInGame) {
        this.doorsInGame = doorsInGame;
    }

    public int openOtherDoor(int number){
        for (int i = 0; i < doorsInGame.getDoors().size(); i++) {
            if (i != number && i != doorsInGame.getWinningDoor()) {
                return i ;
            }
        }
        return 0;
    }

}
