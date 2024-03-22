import java.util.Scanner;
/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded '_'. For example,
 * "The inventor of Java was _James Gosling_."
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FillInQuestion extends Question
{
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question += "__________" + parser.next();
        
        super.setText(question);
        
        
        
    }
}
