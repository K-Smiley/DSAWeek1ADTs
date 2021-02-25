package week1;

public class DiceV3 extends ADice {

    private int die1Value;   
    private int die2Value;

    @Override
    public int roll() {
        die1Value = randInt(); // roll die #1
        die2Value = randInt(); // roll die #2
        return die1Value + die2Value;
    }

    @Override
    public int die1() {
        return die1Value;
    }

    @Override
    public int die2() {
        return die2Value;
    }
    
// private implementation of randInt() ...
    private int randInt() {
        int num = (int) (Math.random() * 6) + 1; //random returns double to cast to an integer 
        return num;
    }

    public static void main(String args[]) {

        DiceV3 dice = new DiceV3(); // instantiate the dice

        int total = dice.roll(); // roll the dice
        int die1 = dice.die1(); // get die1 value
        int die2 = dice.die2(); // get die2 value

        System.out.println("First die: " + die1);
        System.out.println("Second die: " + die2);
        System.out.println();
        System.out.println("Total for roll is: " + total);
    }
} // end of class
