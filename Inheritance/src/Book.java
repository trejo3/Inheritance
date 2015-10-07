public class Book extends Product
{
    private String author;

    public Book()
    {
        super.setCode(" ");
        super.setDescription(" ");
        super.setPrice(0.00);
    	count++;
    }

    public void setCode(String code)
    {
    	super.code = code;
    }
    
    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }
}
