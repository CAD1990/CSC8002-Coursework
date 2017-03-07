import java.util.Calendar;
import java.text.SimpleDateFormat;
/**
 * Abstract class Licence - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Licences implements Licence
{
    private String nameDriver;
    private int dobDriver;
    private String licenceDriver;
    private boolean fullDriver;
    private final String dateOfIssue;
    public Licences(String nameDriver, int dobDriver, String licenceDriver, boolean fullDriver)
    {
        this.nameDriver = nameDriver;
        this.dobDriver = dobDriver;
        this.licenceDriver = licenceDriver;
        this.fullDriver = fullDriver;
        this.dateOfIssue = getDate();
    }
    
    private static String getDate()
    {
        Calendar rightNow = Calendar.getInstance();
        rightNow.add(Calendar.DATE, 0);
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy 'at' hh:mm:ss aaa");
        String date = format1.format(rightNow.getTime());
        return date;
    }
    
    public String driversName()
    {
        return nameDriver;
    }

    public int dateOfBirth()
    {
        return dobDriver;
    }

    public String licenceNumber()
    {
        return licenceDriver;
    }

    public String dateOfIssue()
    {
        return dateOfIssue;
    }

    public boolean fullLicence()
    {
        return fullDriver;
    } 
}
