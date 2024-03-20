package org.example;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Integer> rolls = new ArrayList<>();

    public void roll(int pins) {
        rolls.add(pins);
    }

    public int score() {
        int score = 0;
        int rollIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(rollIndex)) {
                score += 10 + strikeBonus(rollIndex);
                rollIndex++;
            } else if (isSpare(rollIndex)) {
                score += 10 + spareBonus(rollIndex);
                rollIndex += 2;
            } else {
                score += sumOfPinsInFrame(rollIndex);
                rollIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int rollIndex) {
        return rollIndex < rolls.size() && rolls.get(rollIndex) == 10;
    }

    private boolean isSpare(int rollIndex) {
        return rollIndex + 1 < rolls.size() && rolls.get(rollIndex) + rolls.get(rollIndex + 1) == 10;
    }

    private int strikeBonus(int rollIndex) {
        if (rollIndex + 1 < rolls.size() && rollIndex + 2 < rolls.size()) {
            return rolls.get(rollIndex + 1) + rolls.get(rollIndex + 2);
        }
        return 0;
    }

    private int spareBonus(int rollIndex) {
        if (rollIndex + 2 < rolls.size()) {
            return rolls.get(rollIndex + 2);
        }
        return 0;
    }

    private int sumOfPinsInFrame(int rollIndex) {
        if (rollIndex + 1 < rolls.size()) {
            return rolls.get(rollIndex) + rolls.get(rollIndex + 1);
        }
        return 0;
    }
}
