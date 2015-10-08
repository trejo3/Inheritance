import java.util.Scanner;

public class ProductApp 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Book or Software?: ");
		String type = input.next();
		type = type.toUpperCase();
		
		if (type.equals("Book"))
		{
			System.out.println("Code: ");
			String codeB = input.next();
			
			System.out.println("Author: ");
			String author = input.next();
			
			System.out.println("Description: ");
			String descriptionB = input.next();
			
			System.out.println("Price: ");
			String priceB = input.next();
		}
		
		if (type.equals("Software"))
		{
			System.out.println("Code: ");
			String codeS = input.next();
			
			System.out.println("Description: ");
			String descriptionS = input.next();
			
			System.out.println("Version: ");
			String version = input.next();
			
			System.out.println("Price: ");
			String priceS = input.next();
		}
		
		Book newBook = new Book();
		Software newSoftware = new Software();
		
		System.out.println(newBook.whatAmI());
		System.out.println(newSoftware.whatAmI());
		
	}
	
	

}
