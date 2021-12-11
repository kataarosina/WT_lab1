package by.bsuir.lab1.classes_and_objects.task9;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addBall(new Ball(1.25, "blue"));
        basket.addBall(new Ball(0.3, "blue"));
        basket.addBall(new Ball(0.15, "white"));
        basket.addBall(new Ball(0.2, "black"));
        System.out.println(basket.calculateBallsWeight());
        System.out.println(basket.getBlueBallsCount());
    }
}
