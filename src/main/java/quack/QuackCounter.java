package quack;

public class QuackCounter implements Quackable {
    private Quackable ducky;
    private static int numberOfQuack;

    public QuackCounter(Quackable ducky){
        this.ducky = ducky;
    }

    @Override
    public void quack() {
        ducky.quack();
        numberOfQuack++;
//        System.out.println(numberOfQuack);
    }

    public static int getNumberOfQuack(){
        return numberOfQuack;
    }
}
