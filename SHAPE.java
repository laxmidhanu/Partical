package cl_eg_30_03;
//import java.util.Scanner;
//problem statement 1
public class SHAPE { // class
	int no_of_side;//instance variable
	// parameterized class of  class shape
	void claculateShapeArea(int no_of_side , int sidelenght )
	{
		//Executes for calculate area of circle
		if(no_of_side==1)
		{
			Circle c =new Circle();//object creating
			c.radius=sidelenght; //values passing
			c.claculateArea();//calling method
		}
		//Executes for calculate area of trangle
		else if (no_of_side==3) 
		{
		Trangle t= new Trangle();//object creating
		t.side=sidelenght;//value passing
		t.calculateArea();// method calling
	}
		else if (no_of_side==4)
		{
			Square s= new Square();//object creating
			s.side=sidelenght;//value passing
			s.claculateArea();// method calling
		}
		//Excuted for other condition
		else {
			System.out.println("No Shape is Present");
		}
	}
	// main method
		public static void main(String [] args) {
			SHAPE S = new SHAPE();//object created
			// first test
			System.out.println(" test case1:");
			S.claculateShapeArea(4,13);
			// second test
			System.out.println(" test case2:");
			S.claculateShapeArea(9,15);
			//thired test
			System.out.println(" test case1:");
			S.claculateShapeArea(3,19);
		}
}