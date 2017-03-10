import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Abstract class Licence - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Licences implements Licence
{
    private String firstName;
    private String lastName;
    private String fullName;
    private String dobDriver;
    private String licenceDriver;
    private boolean fullDriver;
    private final String dateOfIssue;
    public Licences(String firstName, String lastName, String licenceDriver, boolean fullDriver)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = getFirstName() + " " + getLastName();
        this.dobDriver = getDOB();
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

    public String getDOB()
    {
        long start; 
        start = Timestamp.valueOf("1972-01-01 00:00:00").getTime();
        long end; 
        end = Timestamp.valueOf("1996-12-31 00:58:00").getTime();
        long difference = end - start +1;
        long value = start + (long)(Math.random() * difference);
        /// Format Block ///
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date (value);
        String time = (dateFormat.format(date));
        return time;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }

    public String getDateOfBirth()
    {
        return dobDriver;
    }

    public String getLicenceNumber()
    {
        return licenceDriver;
    }

    public String getDateOfIssue()
    {
        return dateOfIssue;
    }

    public boolean getLicenceLevel()
    {
        return fullDriver;
    } 
}
