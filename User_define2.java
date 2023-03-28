package package_eg;
import java.util.*;
public class User_define2 {
	public static void positive_or_not(int number)
	{
		if(number>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
			
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");	
	int number = sc.nextInt();
	positive_or_not(number);
	}
}
