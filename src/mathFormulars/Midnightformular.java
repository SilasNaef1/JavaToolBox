/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  LastChange: sasha
 *  Author sasha
 */
package mathFormulars;

public class Midnightformular {
	
	private double xPlus;
	private double xMinus;
	
	public void setMidnight(double a, double b, double c)
	{
		if(a == 0 || (b*b) - (4*a*c) < 0)
		{
			xMinus = 0;
			xPlus = 0;
		}
		else
		{
			xPlus = (-b + Math.sqrt((b*b) - (4*a*c)))/2*a;
			xMinus = (-b - Math.sqrt((b*b) - (4*a*c)))/2*a;
		}
	}

	public double getXPlus() {
		return xPlus;
	}

	public double getXMinus() {
		return xMinus;
	}
	
}
