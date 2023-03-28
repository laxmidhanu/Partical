package package_eg;

public class constru_overload {
int age;
String name, address;
//constructor 1 with 2 arrgument
constru_overload(int a, String n)
{
	age = a ;
	name = n;
	
}
// constructor 2 with 3 arrgument
constru_overload(int a, String n, String ad)
{
	age= a; 
	name= n;
	address= ad;
	
}
public void show()
{
	System.out.println(" Name="+name+" age="+age+" Address="+address);
}
public static void main(String [] args)
{
	constru_overload obj = new constru_overload(23, "laxmi");
	constru_overload obj1 = new constru_overload(21, "Nandini", "soalpur");
	obj.show();
	obj1.show();
	
	
}
}

