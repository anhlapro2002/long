package day4.bai6_3;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 1, 1);
        System.out.println("Initial position: " + point);

        point.moveUp();
        point.moveRight();
        System.out.println("Position after moving up and right: " + point);

        point.moveDown();
        point.moveLeft();
        System.out.println("Position after moving down and left: " + point);
    }

}
