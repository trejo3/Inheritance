public class Software extends Product
{
    private String programmer;
    private String platform;
    private String os;

    public Software()
    {
        super.setCode(" ");
        super.setDescription(" ");
        super.setPrice(0.00);
        programmer = " ";
        platform = " ";
        os = " ";
        count++;
    }

    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " + version + "\n";
    }
    
    public String whatAmI()
    {
    	return "I am software";
    }
    
    @Override
    public boolean equals(Object o)
    {
    	if (super.equals(o) == true &&
    			programmer.equals(programmer) &&
    			platform.equals(platform) &&
    			os.equals(os))
    	{
    		return true;
    	}
    	else {return false;}
    
    
}