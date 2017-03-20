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
	private double area;
	private double scope;
	private double height;
	private double corner;
	private final double gamma =  90;
	private double c;
	private double kathete;
	
	public RightTriangle(){}
	
	public double calcArea(double a, double b)
	{	
		if(a != 0 && b != 0){
			area = (a * b)/2;
			return area;
		}
		return 0;
	}
	
	public double calcScope(double a, double b, double c){
	
		scope = a+b+c;
		return scope;
	}
	
	public double calcHeight(double a, double b, double c){
		
		if(a != 0 && b != 0 && c != 0){
			height = (a*b)/c;
			return height;
		}
		return 0;
	}
	
	public double calcCorner(double alpha){
		
		if(alpha != 0){
			corner = alpha - gamma;
			return corner;
		}
		return 0;
	}
	
	public double calcHypotenuse(double a, double b){

		if(a != 0 && b != 0){
			c = Math.sqrt((a*a)+(b*b));
			return c;
		}
		return 0;
	}
	
	public double calcKathete(double c, double a){

		if(a != 0 && c != 0){
			kathete = Math.sqrt((c*c)-(a*a));
			return kathete;
		}
		return 0;
	}

}
