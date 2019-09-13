package simulator;

import quack.*;
import duck.*;
import goose.*;
import pigeon.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator= new DuckSimulator();
        duckSimulator.simulator();
    }

    private void simulator() {
        Quackable redHeadDuck = new QuackCounter(new RedheadDuck());
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeon = new PigeonAdapter(new Pigeon());
        Quackable echoInCounter = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable counterInEcho = new QuackEcho(new QuackCounter(new MallardDuck()));
        // echo ที่ new counter จะทำการ +num 2 ครั้ง เพราะได้ไปทำการเรียก quack ของ counter 2 รอบ

        System.out.println("Duck Simulator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(pigeon);
        simulate(echoInCounter);
        simulate(counterInEcho);

        System.out.println("The duck quacked " + QuackCounter.getNumberOfQuack() + " times" );
    }

    private void simulate(Quackable duck){
        duck.quack();
    }

}
