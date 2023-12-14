package Pr_4;

import Pr_4.Hand;
import Pr_4.Head;
import Pr_4.Human;
import Pr_4.Leg;

public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Brown", 12);
        Leg leg = new Leg(100);
        Hand hand = new Hand(5);

        Human human = new Human(head, leg, hand);
        System.out.println("Цвет головы человека: " + human.getHead().getColor());
        System.out.println("Длина ноги человека: " + human.getLeg().getLength());
        System.out.println("Количество пальцев на руке человека: " + human.getHand().getFingers());
    }
}
