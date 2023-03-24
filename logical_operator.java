class logical_operator{

public static void main(String args[]){
int a = 64;
int b = 87;
int c = 40;

	System.out.println(a>b && a<c);               // true
	System.out.println(a>c && b<a);               // false
	System.out.println(a<c || b>a);               // true
	System.out.println(a==b || b>c);              // false

}
}