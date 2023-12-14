package Pr_14;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("B");
        al.add("C");

        WaitList<String> wl = new WaitList<>();
        wl.add("A");
        wl.add("B");
        wl.add("C");
        System.out.println(wl);
        System.out.println(wl.remove());
        System.out.println(wl);
        System.out.println(wl.isEmpty());
        System.out.println(wl.contains("A"));
        System.out.println(wl.containsAll(al));

        System.out.println();

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("r1");
        bwl.add("r2");
        bwl.add("t1");
        System.out.println(bwl);
        try{
            bwl.add("t2");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(bwl);
        System.out.println(bwl.getCapacity());

        System.out.println();
        bwl = new BoundedWaitList<String>(al);
        System.out.println(bwl.getCapacity());
        try{
            bwl.add("t2");
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(5);
        uwl.add(7);
        uwl.add(1);
        uwl.add(3);
        uwl.add(2);
        uwl.add(5);
        System.out.println(uwl);
        uwl.remove(5);
        System.out.println(uwl);
        uwl.moveToBack(7);
        System.out.println(uwl);
    }
}
