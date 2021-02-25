
package week1;


public abstract class ADice {
    
    private int die1Value;
    private int die2Value;
    
    public int die1(){
        return die1Value;
        
    }
    
    public int die2(){
        return die2Value;
    }
            
    public abstract int roll();       
    
}