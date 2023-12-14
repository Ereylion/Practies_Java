package Pr_1;

import java.lang.*;
public class Ball {
    private String friend;
    private String color;
    public Ball(String friend, String color){
        this.friend=friend;
        this.color=color;
    }
    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }

    public String getColor() {
        return color;
    }

    public void setColor(double y) {this.color = color;}
    public void ballGame(){
        System.out.println("You threw the "+color+" ball to "+friend);
    }
}
