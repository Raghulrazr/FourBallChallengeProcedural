import processing.core.PApplet;

public class ProceduralFourBallChallenge extends PApplet {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    float heightY = (HEIGHT / 5);
    float speedBallOne = 1;
    float positionX1 = 0;
    float positionBallOne = heightY;
    float speedBallTwo = 2;
    float positionX2 = 0;
    float positionBallTwo = heightY * 2;
    float speedBallThree = 3;
    float positionX3 = 0;
    float positionBallThree = heightY * 3;
    float speedBallFour = 4;
    float positionX4 = 0;
    float positionBallFour = heightY * 4;
    float ballWidth= 10;
    float ballHeight = 10;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        firstBall();
        secondBall();
        thirdBall();
        fourthBall();
    }

    private void fourthBall() {
        ellipse(positionX4,positionBallFour,ballWidth,ballHeight);
        positionX4 = positionX4 + speedBallFour;
    }

    private void thirdBall() {
        ellipse(positionX3,positionBallThree,ballWidth,ballHeight);
        positionX3 = positionX3 + speedBallThree;
    }

    private void secondBall() {
        ellipse(positionX2,positionBallTwo,ballWidth,ballHeight);
        positionX2 = positionX2 + speedBallTwo;
    }

    private void firstBall() {
        ellipse(positionX1, positionBallOne, ballWidth, ballHeight);
        positionX1 = positionX1 + speedBallOne;
    }

    public static void main(String[] args) {
        PApplet.main("ProceduralFourBallChallenge", args);
    }
}