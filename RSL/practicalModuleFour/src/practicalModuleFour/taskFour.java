package practicalModuleFour;
import java.util.Scanner;

class libraryManagement
{
	String bookTitle[] = {"The Great Gatsby","The Picture of Dorian Gray","Wuthering Heights", "Great Expectations","The Kite Runner"};
	String author[] = {"F. Scott Fitzgerald", "Oscar Wilde", "Emily Brontë", "Charles Dickens", "Khaled Hosseini"};
	int availableBooks[] = {10, 5,40,32,6};
	public String[] getBooks()
	{
		return bookTitle;
	}
	public int[] getAvailableBook()
	{
		return availableBooks;
	}
	
}

public class taskFour {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		libraryManagement l1 = new libraryManagement();
		String books[] = l1.getBooks();
		int availableBooks[] = l1.getAvailableBook(); 
		System.out.println("Welcome to library..\nWe have below books in our library..");
		for(int i=0; i<books.length; i++)
		{
			System.out.println((i+1) + " : " + books[i] + " : " + availableBooks[i]);
		}
		System.out.println("\nWhich book do you want: \nchoose ");
		System.out.println("1.The Great Gatsby \n2.The Picture of Dorian Gray \n3.Wuthering Heights \n4.Great Expectations \n5.Great Expectations \n6.exit ");
		int choice = sc.nextInt();
		System.out.println("how many books do you want: ");
		int no = sc.nextInt();
		switch(choice)
		{
			case 1: 
				for(int i=0; i<choice; i++)
				{
					availableBooks[i] = availableBooks[i] - no;
					System.out.println("book name: " + books[i] + "\nAvailable books: " + availableBooks[i]);
				}
			case 2: 
				for(int i=1; i<choice; i++)
				{
					availableBooks[i] = availableBooks[i] - no;
					System.out.println("book name: " + books[i] + "\nAvailable books: " + availableBooks[i]);
				}	
				
			case 3: 
				for(int i=2; i<choice; i++)
				{
					availableBooks[i] = availableBooks[i] - no;
					System.out.println("book name: " + books[i] + "\nAvailable books: " + availableBooks[i]);
				}	
			case 4: 
				for(int i=3; i<choice; i++)
				{
					availableBooks[i] = availableBooks[i] - no;
					System.out.println("book name: " + books[i] + "\nAvailable books: " + availableBooks[i]);
				}	
			case 5: 
				for(int i=4; i<choice; i++)
				{
					availableBooks[i] = availableBooks[i] - no;
					System.out.println("book name: " + books[i] + "\nAvailable books: " + availableBooks[i]);
				}	
			case 6:
				System.exit(0);
		}
		
		
		
	}

}
