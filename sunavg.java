package package_eg;
import java.util.*;
public class sunavg {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		System.out.println("sum:"+sum);
		//sum = sc.nextInt();
				
		int avg = sum/3;
		System.out.println("average:"+avg);
		 //avg = sc.nextInt();
	}
}