class Largest
{
	int a;
	int b;
	int c;
	Largest(int a,int b,int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
    }
	public int largest()
	{
		if(a>b && a>c)
		{
			System.out.println("The largest integer of all of the three is a :"+a);
			return a;
		}	
		else if(b>a && b>c)
		{
			System.out.println("The largest integer of all of the three is b :"+b);
			return b;
		}	
		else
		{
			System.out.println("The largest integer of all of the three is c :"+c);
			return c;
		}	
	}
}
class LargestInteger
{
public static void main(String args[])
{
Largest l1 = new Largest(12,22,32);
l1.largest();
}
}	