package TennisGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static TennisGame.Points.*;

class PlayerTest {

    private Player p;
    private Player firstPlayer;
    private Player secondPlayer;
    private Game game;


    @BeforeEach
    void setUp() {
        p = new Player();
        game = new Game();
    }


    @Test
    public void PlayerPointsInTheBeginning() {
        Assertions.assertEquals(Zero, p.getPoints());
    }


    @Test
    public void PlayerPointsAdded() {
        p.addPoints();
        Assertions.assertEquals(Fifteen, p.getPoints());
        p.addPoints();
        Assertions.assertEquals(Thirty, p.getPoints());
        p.addPoints();
        Assertions.assertEquals(Forty, p.getPoints());
        p.addPoints();
        Assertions.assertEquals(Zero, p.getPoints());
    }


    @Test
    @Disabled
    public void Deuce() {
        GivenPlayerOneWithPoints(Fifteen);
        GivenPlayerTwoWithPoints(Thirty);
    }


    private void GivenPlayerTwoWithPoints(Points points) {
        secondPlayer = new Player(points);

    }


    private void GivenPlayerOneWithPoints(Points points) {
        firstPlayer = new Player(points);
    }

}