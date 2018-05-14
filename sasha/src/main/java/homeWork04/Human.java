package homeWork04;

import java.util.Random;

public class Human extends Hero {

    protected int attackMove() {
        Random rand = new Random();
        return rand.nextInt((15 - 10) + 1) + 10;
    }

    protected boolean healing() {
        if (Math.random() <= 0.2) {
            return true;
        } else {
            return false;
        }
    }
}
