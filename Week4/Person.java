/**
Decribes a person and whether or not they are infected
*/

public class Person
{	
	// attibute
	
	private boolean infected;
	
	/**
	Creates an uninfected person.
	*/
	public Person () 
	{
		this.infected = false;
	}
	
	//to String
	public String toString()
	{
		if(infected)
		{
			return "sick person";
		}
		else 
		{
			return "well person";
		}
	}
	
	
	/**
	Tells us if the person is infected
	@return The infection status.
	*/
	
	public boolean isInfected()
	{
		return infected;
	}
	
	/**
	Changes the infection status.
	@param infected The new infection status.
	*/
	
	public void setInfected(boolean infected)
	{
		this.infected = infected;
	}
}
