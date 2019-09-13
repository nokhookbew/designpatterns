package composite;

import quack.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    private ArrayList quackers = new ArrayList();
    boolean leader = false;

    public void add(Quackable ducky) {
        quackers.add(ducky);
        leader = true;
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
//        int i = 1;
        while (iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
//            System.out.println("เป็ดตัวที่: " + i);
            quacker.quack();
            if(leader) {
                quacker.quack();
                quacker.quack();
                leader = false;
            }
//            i++;
        }
    }
}
