
/**
 * Write a description of class Wallet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wallet
{
    private Card card1;
    private Card card2;
    
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null){
            card2 = card;
        }
    }
    
    public String toString() 
    {
        String card1String = (card1 != null) ? card1.toString() : "Empty Slot";
        String card2String = (card2 != null) ? "|" + card2.toString() : "|" + "Empty Slot";
        return "[" + card1String + card2String + "]";
    }
    
    public int getExpiredCardCount() {
        int count = 0;
        if (card1 != null && card1.isExpired()) {
            count++;
        }
        if (card2 != null && card2.isExpired()) {
            count++;
        }
        return count;
    }
}
