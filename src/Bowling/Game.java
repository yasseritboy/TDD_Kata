package Bowling;

public class Game {
    private int[][] frames;


    public Game() {
        frames = new int[10][2];
    }


    public int getFrames() {
        return frames.length;
    }


    public void setFrames(int[][] frames) {
        this.frames = frames;
    }
}
