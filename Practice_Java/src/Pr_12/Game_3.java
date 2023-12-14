package Pr_12;

import java.util.ArrayDeque;
import java.util.Deque;

public class Game_3 {
    Deque<Integer> fp, sp;

    public Game_3(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count < 106){
            if(fp.peek() > sp.peek()
                    && sp.peek() != 0){
                fp.add(fp.remove());
                fp.add(sp.remove());

            }else{
                sp.add(fp.remove());
                sp.add(sp.remove());
            }
            count++;
        }
        if(count >= 106) {
            return "botva";
        } else {
            String res = "";
            if(fp.isEmpty()) res += "second ";
            else res += "first ";
            res += count;
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Game_3("33584", "12312").play());
        System.out.println(new Game_3("94321", "48851").play());
        System.out.println(new Game_3("24242", "72605").play());
    }
}
