public class Software extends Product
{
    private String version;

    public Software()
    {
        super.setCode(" ");
        super.setDescription(" ");
        super.setPrice(0.00);
        count++;
    }

    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
    }
}