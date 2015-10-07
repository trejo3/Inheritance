import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice(price) + "\n";
    }

    // create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
    
    //Format price
    public String getFormattedPrice(double price)
    {
    	NumberFormat formatter = NumberFormat.getCurrencyInstance();
    	return formatter.format(price);
    }
}