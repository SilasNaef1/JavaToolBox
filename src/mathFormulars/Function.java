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
	
	public Function(double a, double b, String result)
	{
		this.a = a;
		this.b = b;
		this.function = result;
		System.out.println(result);
	}
	
	public static Function linearFunction(double x1, double y1, double x2, double y2)
	{
		if(x2==x1 && y2==y1)
		{
			return null;
		}
		else
		{
			double a = (y2-y1)/(x2-x1);
			double b = (x2*y1-x1*y2)/(x2-x1);
			String result;
		
			if(b<=0)
			{
				if(b<0)
				{
					result = "y = "+a+"x"+b;
				}
				else
				{
					result = "y = "+a+"x";
				}
			}
			else
			{
				result = "y = "+a+"x + "+b;
			}
			return new Function(a,b,result);
		}
	}
	
	public static boolean testLinearFunction()
	{
		Function func = linearFunction(-4,-1,2,-10);
		System.out.println(func.function);
		return true;
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
