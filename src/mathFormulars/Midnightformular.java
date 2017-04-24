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
	
	private static double xPlus;
	private static double xMinus;
	
	
	//Hier werden beide Variablen gesetzt it den 3 Angaben
	public void setMidnight(double a, double b, double c)
	{
		if(a == 0 || (b*b) - (4*a*c) < 0)
		{
			xMinus = 0;
			xPlus = 0;
		}
		else
		{
			xPlus = (-b + Math.sqrt( (b*b)-(4*a*c)) ) / (2*a);
			xMinus = (-b - Math.sqrt( (b*b) - (4*a*c)) ) / (2*a);
		}
	}

	//Hier kann man ein get machen wenn plus oder minus gerechnet wurde
	public double getXPlus() {
		return xPlus;
	}

	public double getXMinus() {
		return xMinus;
	}
	
	//Testfunktion
	public static boolean test()
	{	
		
		xPlus = (0.5 + Math.sqrt((-0.5*-0.5) - (4*0.25*-0.75)))/ (2*0.25);
		xMinus = (0.5 - Math.sqrt((-0.5*-0.5) - (4*0.25*-0.75)))/ (2*0.25);
		
		if((int)xPlus != 3 &&(int)xMinus != -1)
		{
			return false;
		}
		return true;
	}
	
}
