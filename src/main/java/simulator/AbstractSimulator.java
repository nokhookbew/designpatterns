package simulator;

import abstrack.*;
import quack.*;

public class AbstractSimulator {
    public static void main(String[] args) {
        AbstractSimulator abstractSimulator = new AbstractSimulator();
        AbstractDuckFactory quackOnly = new QuackableDuckFactory();
        AbstractDuckFactory counting = new CountingDuckyFactory();
        AbstractDuckFactory countingAndEcho = new CountingAndEchoDuckyFactory();
        abstractSimulator.simulate(quackOnly);
        abstractSimulator.simulate(counting);
        abstractSimulator.simulate(countingAndEcho);
    }

    private void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable redHeadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();

        System.out.println("Duck Simulator : With Abs Fac");

        simulate(redHeadDuck);
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        System.out.println("The duck quacked " + QuackCounter.getNumberOfQuack() + " times");
    }

    private void simulate(Quackable ducky){
        ducky.quack();
    }


}
