import java.util.Scanner;
public class TimeConverter {

	//Creating the variables
	private int hours;
	private int minutes;
	private int seconds;
	private boolean notPM;
	private String amOrPm;
	
	Scanner key = new Scanner(System.in);
	
	//default constructor
	public TimeConverter()
	{
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
		this.notPM = true;
		this.amOrPm = "AM";
	}
	
	//accessors
	public int getHours()
	{
		return this.hours;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public int getSeconds()
	{
		return this.seconds;
	}
	public boolean getNotPM()
	{
		return this.notPM;
	}
	public String getAmOrPm()
	{
		return this.amOrPm;
	}
	
	//mutators
	//This mutator allows for the input from the user for the number of hours. Then it checks if the number of hours is past 12 hours at determine if it is am or pm when it converts from military time to 12-hour time
	public void setHours(int xHours)
	{
		System.out.println("Enter in the number of hours");
		xHours = key.nextInt();
		
		if(xHours <= 12 && xHours >= 0)
		{
			this.hours = xHours;
			this.notPM = true;
		}
		else if(xHours >= 12 && xHours < 24)
		{
			this.hours= xHours - 12;
			this.notPM = false;
		}
		
		//This section will refer back to the timeCheckHours part of the code and then if the section of the code throws TimeException then it will call to that class and then print out the message
		else
		{
			try
			{
				timeCheckHours(xHours);
			}
			catch(TimeException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				
			}
		}
	}
	//This
	public void setMinutes(int xMinutes)
	{
		System.out.println("Enter in the number of minutes");
		xMinutes = key.nextInt();
		
		if(xMinutes < 60 && xMinutes >= 0)
		{
			this.minutes = xMinutes;
		}
		
		//This section will refer back to the timeCheckHours part of the code and then if the section of the code throws TimeException then it will call to that class and then print out the message
		else
		{
			try
			{
				timeCheckMinutes(xMinutes);
			}
			catch(TimeException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				
			}
		}
	}
	
	//mutator for the seconds which sets the seconds and checks to see if it should refer to the timeCheck if it is an unreasonable amount of time 
	public void setSeconds(int xSeconds)
	{
		System.out.println("Entered in the number of seconds.");
		xSeconds = key.nextInt();
		
		if(xSeconds < 60 && xSeconds >= 0)
		{
			this.seconds = xSeconds;
		}
		//This section will refer back to the timeCheckHours part of the code and then if the section of the code throws TimeException then it will call to that class and then print out the message
		else
		{
			try
			{
				timeCheckSeconds(xSeconds);
			}
			catch(TimeException e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				
			}
		}
	}
	//This portion of the code checks to see if the hours are correct and then throws TimeException back to setHours 
	 public void timeCheckHours(int xHours) throws TimeException
	 {
		 if(xHours > 24 || xHours < 0)
		 {
			 throw new TimeException();
		 }
	 }
	 //This portion of the code checks to see if the minutes are correct and then throw TimeException back to setMinutes
	 public void timeCheckMinutes(int xMinutes) throws TimeException
	 {
		 if(xMinutes >= 60 || xMinutes < 0)
		 {
			 throw new TimeException();
		 }
	 }
	 //This portion of the code checks to see if the seconds are correct and then throws TimeException back to setSeconds 
	 public void timeCheckSeconds(int xSeconds) throws TimeException
	 {
		 if(xSeconds >= 60 || xSeconds < 0)
		 {
			 throw new TimeException();
		 }
	 }
	 
	 //Checks to see if notPM is true or false and then makes a section of code that can easily be printed out in the toString section
	 public void amOrPM()
	 {
		 if(notPM == true)
		 {
			 amOrPm = "AM";
		 }
		 else
		 {
			 amOrPm = "PM";
		 }
	 }
	 
	 //This writes the results in standard time 
	 public String toString()
	 {
		 return "12-hour clock time -> " + this.hours +":" + this.minutes +":"+ this.seconds +" " + this.amOrPm;
	 }
}
