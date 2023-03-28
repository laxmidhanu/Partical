package package_eg;

public class Parameterizedcons {
int age;
String name;
//parameterized cons where we have to pass the parmeters/ arguments
Parameterizedcons(int a, String n)
{
	age =a;
	name = n;	
}
void show()
{
	System.out.println(age+ " "+name);
}
public static void main(String [] args)
{
	Parameterizedcons d= new Parameterizedcons(20, "laxmi");
	Parameterizedcons d1= new Parameterizedcons(23, "nandini");
	Parameterizedcons d2= new Parameterizedcons(24, "veena");
	Parameterizedcons d3= new Parameterizedcons(14, "rasika");
	Parameterizedcons d4= new Parameterizedcons(24, "vedika");
	d.show();
	d1.show();
	d2.show();
	d3.show();
	d4.show();
	
}
}
