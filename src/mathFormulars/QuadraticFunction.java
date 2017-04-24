/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 27.03.2017
 *  Method: Test
 *  LastChange: Dueen
 *  Author Dueen
 */
package mathFormulars;

public class QuadraticFunction extends Function{ //extends the existing class Function
	private double c;
	
	public QuadraticFunction(double a, double b,double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	// Due to missing time, this class couldn't be finished
	
	/*public static QuadraticFunction squareFunction(double x1, double y1, double x2, double y2, double x3, double y3)
	{
			/*P1(x1|y1) , P2(x2|y2) , P3(x3|y3)*/
			
			/* Gleichungssystem */ /*
			if(Math.pow(x1, 2)<Math.pow(x2, 2))
			{
				y2 -= y1;
				x2 -= x1;
				double xA = Math.pow(x2, 2)-Math.pow(x1,2);
				if(xA == Math.pow(x3, 2))
				{
					if(x2>x3)
					{
						double b = y2/(x2-x3);
					}
					else
					{
						double b = y3/(x3-x2);
					}
				}
				else
				{
					y2 *= x3;
					y3 *= xA;
					x2 *= x3;
					x3 *= xA;
					if(x2>x3)
					{
						double b = y2/(x2-x3);
					}
					else
					{
						double b = y3/(x3-x2);
					}
				}
			}
			else
			{
				y1 -= y2;
				x1 -= x2;
				double xA = Math.pow(x1, 2)-Math.pow(x2,2);
			}
			
			double a = ;
			double b = ;
			double c = ;
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
			return new QuadraticFunction(a,b,c,result);
	} */

}
