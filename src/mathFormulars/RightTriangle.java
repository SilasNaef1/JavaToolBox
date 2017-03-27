/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  LastChange: christopher
 *  Author christopher
 */
package mathFormulars;

public class RightTriangle {
	
	//Declare all Properties a Triangle can have
	private static double area;
	private static double scope;
	private static double height;
	private static double corner;
	private static final double gamma =  90;
	private static double c;
	private static double kathete;
	
	public RightTriangle(){}
	
	public static double calcArea(double a, double b)
	{	
		if(a != 0 && b != 0){
			area = (a * b)/2;
			return area;
		}
		return 0;
	}
	
	private static boolean isTriangleRight(double a, double b, double c){
		
		if((Round.RoundValue((a*a)+(b*b), 2)) == Round.RoundValue((c*c), 2)){
			return true;
		}
		return false;

	}
	
	public static double calcScope(double a, double b, double c){
	
		if(isTriangleRight(a,b,c))
		{
			scope = a+b+c;
			
			return scope;						
		}
		return 0;

	}
	
	public static double calcHeight(double a, double b, double c){
		
		if(isTriangleRight(a, b, c)){
			if(a != 0 && b != 0 && c != 0){
				height = (a*b)/c;
				return height;
			}
		}
		return 0;

	}
	
	public static double calcCorner(double alpha){
		
		if(alpha != 0){
			corner = 180 - gamma - alpha;
			if(corner > 0){
				return corner;
			}
		}
		return 0;
	}
	
	public static double calcHypotenuse(double a, double b){

		if(a != 0 && b != 0){
			
			//Man darf nicht durch 0 teilen
			if((a*a)+(b*b) < 0){
				return 0;
			}
			c = Math.sqrt((a*a)+(b*b));
			return c;
		}
		return 0;
	}
	
	public static double calcKathete(double a, double c){

		if(a > c){
			return 0;
		}
		if(a != 0 || c != 0 || a < 0 || c < 0){
			kathete = Math.sqrt((c*c)-(a*a));
			return kathete;
		}
		return 0;
	}
	
	public static boolean test(){
		return true;
	}

}
