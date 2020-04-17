package Bowling;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GameTest {

    private Game bowlingGame;
    private int score;
    private int bonus;


    @BeforeEach
    void setUp() {
        bowlingGame = new Game();
    }


    @Test
    public void GameConsistOf10Frames() {

        assertEquals(10, bowlingGame.getFrames());
    }


    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }


    public int getBonus() {
        return bonus;
    }


    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}