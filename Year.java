import java.util.Scanner;  
class LeapYear
{
	
		int year = 2020;
		public void year_leap()
		{
			if(year%4==0)
				System.out.println("This one's a leap year");
			else
				System.out.println("This one's definitely not a leap year");
		}
	
}
class Year
{
 public static void main(String args[])
 {
	 LeapYear l1 = new LeapYear();
	 l1.year_leap();
 }
} 