package Pr_5;

import Pr_5.Movable;
import Pr_5.MovableCircle;
import Pr_5.MovablePoint;
import Pr_5.MovableRectangle;

public class TestMovable {
    public static void main(String[] args) {
        Movable m = new MovablePoint(0, 0, 1, 4);
        System.out.println("Point:\n");
        System.out.println(m);
        m.moveUp();
        m.moveRight();
        System.out.println("Up+Right -> " + m);

        System.out.println("\nCircle:\n");
        m = new MovableCircle(0, 0, 2, 4, 6);
        System.out.println(m);
        m.moveDown();
        m.moveLeft();
        System.out.println("Down+Left -> " + m);

        System.out.println("\nRectangle:\n");
        m = new MovableRectangle(0, 0, 4, 4, 2,4);
        System.out.println(m);
        m.moveRight();
        m.moveDown();
        System.out.println("Right+Down -> " + m);

        System.out.println("\nChanging speed for rectangle:");
        MovableRectangle r = (MovableRectangle)m;
        r.setSpeed(10, 0); // change speed of topLeft point only!
        try{
            r.moveDown();
        }catch (IllegalStateException e){
            System.out.println(e);
        }
    }
}
