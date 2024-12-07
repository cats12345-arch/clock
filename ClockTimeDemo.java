import java.util.Scanner;
public class ClockTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//A char to see if the user puts yes or no
		char op = 'y';
		Scanner key = new Scanner(System.in);
		
		//informing the user of what is being converted into what 
		System.out.println("Convert military time into 12-hour clock time!!!");
		//Creating time converter object 
		TimeConverter t1 = new TimeConverter();
		//do loop so it can happen again and again
		do {
			//running the sections of code that get the time set am or pm and then printing it
			t1.setHours(0);
			t1.setMinutes(0);
			t1.setSeconds(0);
			t1.amOrPM();

			System.out.println(t1.toString());
			
			//allows the user to retry if they want 
			System.out.println("Do you wish to this again? \"Yes\" or \"No\" ");
			op = key.next().charAt(0);
		}while(op == 'Y' || op == 'y');
		
	}

}
