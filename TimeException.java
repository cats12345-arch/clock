
public class TimeException extends Exception
{
	//Prints this when an invalid value is shown
	public TimeException()
	{
		super("Invalid time entered");
	}
	
	//Also can print it out as well
	
	public TimeException(String msg)
	{
		super(msg);
	}
}
