
/**
 * Write a description of class ATMCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATMCard extends Card
{
    private String cardNumber;
    private int pin;
    public ATMCard(String n, String number, int pin)
    {  
       super(n);
       cardNumber = number;
       this.pin = pin;
    }
    
    public String toString() 
    {
        return super.toString() + ", Card Number: " + cardNumber;
    }
}
