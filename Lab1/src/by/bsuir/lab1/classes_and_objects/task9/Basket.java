package by.bsuir.lab1.classes_and_objects.task9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public double calculateBallsWeight() {
        double sum = 0;
        for (Ball ball : balls) {
            sum += ball.getWeight();
        }
        return sum;
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public int getBlueBallsCount() {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == "blue")
                count++;
        }
        return count;
    }
}
