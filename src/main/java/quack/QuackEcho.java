package quack;

public class QuackEcho implements  Quackable{
    private Quackable ducky;

    public QuackEcho(Quackable ducky) {
        this.ducky = ducky;
    }

    @Override
    public void quack() {
        ducky.quack();
        echo();
    }

    private void echo(){
        System.out.print("Echo : ");
        ducky.quack();
    }
}
