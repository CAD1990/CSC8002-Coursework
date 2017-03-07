
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
    private String dateOfIssue;
 
    public Licences(String nameDriver, int dobDriver, String licenceDriver, boolean fullDriver, String dateOfIssue)
    {
        this.nameDriver = nameDriver;
        this.dobDriver = dobDriver;
        this.licenceDriver = licenceDriver;
        this.dateOfIssue = dateOfIssue;
        this.fullDriver = fullDriver;
   
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
