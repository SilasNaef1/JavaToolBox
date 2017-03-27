/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 13.03.2017
 *  Method: Test
 *  LastChange: Jannis
 *  Author: Silas
 */
import java.math.RoundingMode;

import cryptography .*;
import dataParser .*;
import economyCalc .*;
import mathFormulars.*;

public class Main {

	public static void main(String[] args) {
		Test();
		
	}
	
	public static void Test()
	{
		function test = mathFormulars.function.linearFunction(6, -1, 2, 2);
		System.out.println("Testf�lle Dreieck!");
		System.out.println("______________________________________________");
		
		
		System.out.println("Testfall1 Dreieck!");
		System.out.println("************************************");
		
		System.out.println(RightTriangle.calcArea(12.54, 21.25));	//Erwartet 133.238Berechnet Fl�che vom Dreieck
		System.out.println(RightTriangle.calcCorner(30.546));		//Erwartet 59.454Berechnet den fehlenden Winkel
		System.out.println(RightTriangle.calcHeight(12.54, 21.25, 24.674));		//Erwartet 10.8Berechnet die H�he vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(RightTriangle.calcHypotenuse(12.54, 21.25));		//Erwartet 24.674Berechnet die Hypotenuse vom Dreieck
		System.out.println(RightTriangle.calcScope(12.54, 21.25, 24.674));		//Berechnet den Umfang vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(RightTriangle.calcKathete(12.54, 21.25));		//Erwartet 21.25Berechnet die fehlende Kathete vom Dreieck
		
		System.out.println("Testfall2 Dreieck!");
		System.out.println("************************************");		
		System.out.println(RightTriangle.calcArea(3, 4));			//Erwartet 6 Berechnet Fl�che vom Dreieck
		System.out.println(RightTriangle.calcCorner(53.13));			//Erwartet 36.87 Berechnet den fehlenden Winkel
		System.out.println(RightTriangle.calcHeight(3, 4, 5));		//Erwartet 2.4 Berechnet die H�he vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(RightTriangle.calcHypotenuse(3, 4));		//Erwartet 5 Berechnet die Hypotenuse vom Dreieck
		System.out.println(RightTriangle.calcScope(3, 4, 5));		//Erwartet 12 Berechnet den Umfang vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(RightTriangle.calcKathete(3, 5));		    //Erwartet 4 Berechnet die fehlende Kathete vom Dreieck
		
		
		System.out.println("Testfall3 Dreieck!");
		System.out.println("************************************");		
		System.out.println(RightTriangle.calcArea(3, 4));			//Erwartet 6 Berechnet Fl�che vom Dreieck
		System.out.println(RightTriangle.calcCorner(180));			//Erwartet 36.87 Berechnet den fehlenden Winkel
		System.out.println(RightTriangle.calcHeight(3, 4, 5));		//Erwartet 2.4 Berechnet die H�he vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(RightTriangle.calcHypotenuse(3, 4));		//Erwartet 5 Berechnet die Hypotenuse vom Dreieck
		System.out.println(RightTriangle.calcScope(3, 4, 5));		//Erwartet 12 Berechnet den Umfang vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(RightTriangle.calcKathete(3, 5));		    //Erwartet 4 Berechnet die fehlende Kathete vom Dreieck
		System.out.println("______________________________________________");

		System.out.println("Ende Testf�lle Dreieck!");
		
		
		System.out.println("Testfall StringToInt");
		System.out.println("************************************");
		System.out.println(StringToInt.ConverStringToInt("123"));
		
		mathFormulars.Round.Test();

		

	}

}
