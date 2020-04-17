package TennisGame;

import static TennisGame.Points.*;

public class Player {

    private Points points;


    public Player() {
        this.points = Zero;
    }


    public Player(Points points) {
        this.points = points;
    }


    public Points getPoints() {
        return points;
    }


    public void addPoints() {
        switch (points) {
            case Zero:
                points = Fifteen;
                break;
            case Fifteen:
                points = Thirty;
                break;
            case Thirty:
                points = Forty;
                break;
            case Forty:
                points = Zero;
                break;
            default:
                points = Zero;
        }

    }
}
