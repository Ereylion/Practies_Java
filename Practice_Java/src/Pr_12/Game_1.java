package Pr_12;

import java.util.Stack;

public class Game_1 {
    Stack<Integer> fp, sp;

    public Game_1(String fp, String sp) {
        this.fp = new Stack<>();
        this.sp = new Stack<>();
        for(int i = 4; i >= 0; i --){
            this.fp.push(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.push(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    private void pushBack(Stack<Integer> s, Integer item){
        Stack<Integer> ns = new Stack<>();
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item);
        while (!ns.isEmpty())
            s.push(ns.pop());
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count <= 106){
            if(fp.peek() > sp.peek()
                    && sp.peek() != 0){
                pushBack(fp, fp.pop());
                pushBack(fp, sp.pop());
            }else{
                pushBack(sp, fp.pop());
                pushBack(sp, sp.pop());
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
        System.out.println(new Game_1("33584", "12312").play());
        System.out.println(new Game_1("94321", "48851").play());
        System.out.println(new Game_1("24242", "72605").play());
    }
}
