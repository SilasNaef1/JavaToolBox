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

public class function {
	
	private double a,b,c;
	private String function;
	
	public function(double a, double b, String result)
	{
		this.a = a;
		this.b = b;
		this.function = result;
		System.out.println(result);
	}
	
	public static function linearFunction(double x1, double y1, double x2, double y2)
	{
		
		double a = (y2-y1)/(x2-x1);
		double b = (x2*y1-x1*y2)/(x2-x1);
		String result = "y = "+a+"x"+b;
		
		return new function(a,b,result);
	}

}
