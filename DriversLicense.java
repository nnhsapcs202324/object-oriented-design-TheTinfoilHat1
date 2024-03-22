
/**
 * Write a description of class DriversLicense here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.GregorianCalendar;
import java.util.Calendar;

public class DriversLicense extends Card
{
    private int expirationYear;

    public DriversLicense(String n, int expYear) {
        super(n);
        expirationYear = expYear;
    }

    public boolean isExpired() {
        GregorianCalendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        return expirationYear < currentYear;
    }
    
    public String toString() 
    {
        return super.toString() + ", Expiration Year: " + expirationYear;
    }
}
