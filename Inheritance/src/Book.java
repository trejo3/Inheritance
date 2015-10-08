public final class Book extends Product
{
    private String author;
    private int pages;

    public Book()
    {
        super.setCode(" ");
        super.setDescription(" ");
        super.setPrice(0.00);
        author = " ";
        pages = 
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
        return super.toString() + "Author:   " + author + "\n";
    }
    
    public String whatAmI()
    {
    	return "I am a book";
    }
   
    
 @Override   
    public boolean equals(Object o)
    {
    	if (super.equals(o) == true && author.equals(author) && pages == pages)
    	{
    		return true;
    	}
    	else {return false;}
}
