
package week1;

public class DiceV1 implements IDice {
    
    
@Override
public int roll() {
    return die1() + die2();
}
@Override
public int die1() {
    return randInt();
}
@Override
public int die2() {
    return randInt();
}
// private implementation of randInt() 
private int randInt(){
    int num = (int)(Math.random() * 6) + 1; //random returns double so need cast it as int
    return num;
}

public static void main(String args []) { 

    DiceV1 dice = new DiceV1(); // instantiate the dice
    
    int total = dice.roll(); // roll the dice
    int die1 = dice.die1(); // get die1 value
    int die2 = dice.die2(); // get die2 value
    
    System.out.println("First die: " + die1);
    System.out.println("second die: " + die2);
    System.out.println();
    System.out.println("Total for roll is: " + total);
} 
} 