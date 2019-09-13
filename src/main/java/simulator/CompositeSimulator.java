package simulator;

import abstrack.*;
import composite.Flock;
import goose.*;
import quack.*;

public class CompositeSimulator {
    public static void main(String[] args) {
        CompositeSimulator compositeSimulator = new CompositeSimulator();
        AbstractDuckFactory counting = new CountingDuckyFactory();
        compositeSimulator.simulate(counting);

    }

    private void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator: With Composite - Flocks");

        Flock flockOfDuck = new Flock();

        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(duckCall);
        flockOfDuck.add(redheadDuck);
        flockOfDuck.add(rubberDuck);
        flockOfDuck.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = abstractDuckFactory.createMallardDuck();
        Quackable mallardTwo = abstractDuckFactory.createMallardDuck();
        Quackable mallardThree = abstractDuckFactory.createMallardDuck();
        Quackable mallardFour = abstractDuckFactory.createMallardDuck();
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDuck.add(flockOfMallards);

        System.out.println("\nDuck Simulator: Whole Flock Simulation");
        simulate(flockOfDuck);
        System.out.println("\nDuck Simulator: Mallard Flock Simulation");
        simulate(flockOfMallards);
        System.out.println("\nThe ducks quacked " +
                QuackCounter.getNumberOfQuack() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
