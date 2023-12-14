package Pr_4;

class Head {
    private String color;
    private int size;

    public Head(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

class Leg {
    private int length;

    public Leg(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

class Hand {
    private int fingers;

    public Hand(int fingers) {
        this.fingers = fingers;
    }

    public int getFingers() {
        return fingers;
    }

    public void setFingers(int fingers) {
        this.fingers = fingers;
    }
}

class Human {
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human(Head head, Leg leg, Hand hand) {
        this.head = head;
        this.leg = leg;
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}