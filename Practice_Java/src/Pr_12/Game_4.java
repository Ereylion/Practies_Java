package Pr_12;

import java.util.LinkedList;

public class Game_4 {
    LinkedList<Integer> fp, sp;

    public Game_4(String fp, String sp) {
        this.fp = new LinkedList<>();
        this.sp = new LinkedList<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }


    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
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
        System.out.println(new Game_4("33584", "12312").play());
        System.out.println(new Game_4("94321", "48851").play());
        System.out.println(new Game_4("24242", "72605").play());
    }
}