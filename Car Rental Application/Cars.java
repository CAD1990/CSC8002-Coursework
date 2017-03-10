public abstract class Cars implements Car
{
    private int fuelAmount;
    private int tankCapacity;
    private boolean tankFull;
    private boolean isRented;
    private String registrationNumber;
    private int consumRate;
    public Cars(int tankCapacity, int fuelAmount, boolean tankFull, boolean isRented, int consumRate) throws Exception
    {
        this.registrationNumber=getRegistration();
        this.tankCapacity = tankCapacity;
        try{
            if(fuelAmount > tankCapacity)
            {
                throw new Exception();
            }
            else
            {
                this.fuelAmount = fuelAmount;
            }
        }
        catch (Exception inpt)
        {
            capacityError(); 
        }
        this.tankFull = tankFull;
        this.isRented = isRented;
        this.consumRate = consumRate;
    }
    
    public int getConsumRate()
    {
        return consumRate;
    }
    
    public boolean getTankFull()
    {
        return tankFull;
    }

    private String getRegistration()
    {
        Registration reg = Registration.getInstance();
        String registration = reg.getLetter() + "" + reg.getNumbers();
        return registration;
    }
    
    public String getReg()
    {
        return registrationNumber;
    }
    
    public boolean isRented()
    {
        return isRented;
    }
    
    private final void capacityError()
    {
        System.out.println("You cannot add more fuel to the tank than its current capacity");
    }

    public int getCapacity()
    {
        return tankCapacity;
    }

    public int getFuel()
    {
        return fuelAmount;
    }
    
    public void setFuel(int amount)
    {
        fuelAmount = amount;
    }

    public void addFuel(int fuel) throws Exception
    {
        fuel = fuel;
        int total = fuelAmount + fuel;
        try {
            if (total > tankCapacity)
            {
                throw new Exception();
            }
            else 
            {
                fuelAmount = fuelAmount + fuel;
            }
        }
        catch (Exception fl)
        {
            capacityError();
        }
        finally 
        {
            if (tankFull(fuelAmount, tankCapacity) == true)
            {
                tankFull = true;
            }
            else
            {
                tankFull = false;
            }
        }
    }

    private boolean tankFull(int fuelAmount, int tankCapacity)
    {
        if (fuelAmount == tankCapacity)
        {
            return true;
        }
        else 
        {
            return false;
        }        
    }
    
    public void driveCar(int kiloMeters)
    {
        if (isRented() == false && getFuel() > 0)
        {  
            int fuelUsed = kiloMeters/consumRate;
            this.fuelAmount = fuelAmount-fuelUsed;
            tankFull(this.fuelAmount, this.tankCapacity);
        }
        else
        {
            /// Car not rented provide message ///
        }
    }
}