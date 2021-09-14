package unl.cse.library;

/**
 * Models an author of a book
 *
 */
public class Author {
	
	public String firstName;   
	public String lastName;

	
	public Author(String f, String l)
	{
		firstName = f;
		lastName = l;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setFirst(String newf)
	{
		firstName = newf;
	}
	
	public void setLast(String newl)
	{
		lastName = newl;
	}
	
	public String toString()
	{
		return lastName+","+firstName;
	}
}
