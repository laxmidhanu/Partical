class Datatype{

int p;
short q;
long r;
double s;
float t;
char u;
boolean v;

void show(){
System.out.println("int : " + p);
System.out.println("short : " + q);
System.out.println("long : " + r);
System.out.println("double : " + s);
System.out.println("float : " + t);
System.out.println("char : " + u);
System.out.println("Boolean : " + v);
}

public static void main (String args[]){
	Datatype object = new Datatype();
	System.out.println("The Default Values are Given Below : "); 
	object.show();
}}