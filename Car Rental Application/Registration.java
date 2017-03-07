import java.util.HashMap;
import java.util.Random;
/**
 * Car Reigstration Singleton
 * 
 * @author (Craig Dawson) 
 * @version (7th March 2017)
 */
public class Registration 
{
    private static final HashMap<String, Registration> reg = new HashMap<String, Registration>();
    private final char letter;
    private final int number;
    private final String strRep;
    /**
     * Constructor for objects of class Registration
     */
    private Registration(int number, char letter, String strRep)
    {
        this.number=number;
        this.letter=letter;
        this.strRep=strRep;
    }

    public static final Registration getInstance()
    {
        Random random = new Random();
        int numbers = random.nextInt(1000)+1000;
        Character letter = (char)(random.nextInt(26) + 'a');
        String strRep = letter + "" + numbers;
        Registration registration = reg.get(strRep);
        if (registration == null)
        {
            registration = new Registration(numbers, letter, strRep);
            reg.put(strRep, registration);
        }
        return registration;
    }
  
    char getLetter()
    {
        return letter;
    }
    
    int getNumbers()
    {
        return number;
    }
    
    public String toString()
    {
        return strRep;
    }
}
