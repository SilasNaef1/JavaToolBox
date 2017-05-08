/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  Method: functions
 *  LastChange: Dueen
 *  Author Dueen
 */
package mathFormulars;

public class Function {
	
	protected double a,b;
	protected String function;
	
	public Function(){}
	
	public Function(double a, double b) //Function as an object
	{
		this.a = a;
		this.b = b;
		this.function = createFunction(a,b); // With the two values a and b the method creates the associated function
		System.out.println(function);
	}
	
	public static Function linearFunction(double x1, double y1, double x2, double y2) //Static method, which returns a function object
	{
		if(x2==x1 && y2==y1) //if the two points are identical
		{
			return null;
		}
		else
		{
			double a = (y2-y1)/(x2-x1);  		//calculation of the coefficient a
			double b = (x2*y1-x1*y2)/(x2-x1);	//calculation of the coefficient b
			return new Function(a,b); //return of a new Function object
		}
	}
	
	public static String createFunction(double a, double b) //Static method to create the function string
	{
		if(b<=0) // depending of the values of a and b, the String gets the right format
		{
			if(b<0)
			{
				return "y = "+a+"x"+b; //example: y = 2x-3
			}
			else
			{
				return "y = "+a+"x"; // example: y = 2x
			}
		}
		else
		{
			return "y = "+a+"x + "+b; // example: y = 2x+3
		}
	}
	
	
	
	public static boolean testLinearFunction()
	{
		Function func = linearFunction(-4,-1,2,-10);
		if(func.getA() == -1.5)
		{
			System.out.println(func.function);
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public double getA() {
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}	

}
