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
		Function test = mathFormulars.Function.linearFunction(6, -1, 2, 2);
		System.out.println("Testfälle Dreieck!");
		System.out.println("______________________________________________");
		
		
		//Man nimmt an das, dass Dreieck rechtwinklig ist!
		RightTriangle triangle = new RightTriangle();
		
		System.out.println("Testfall1 Dreieck!");
		System.out.println("************************************");
		
		System.out.println(triangle.calcArea(12.54, 21.25));	//Erwartet 133.238Berechnet Fläche vom Dreieck
		System.out.println(triangle.calcCorner(30.546));		//Erwartet 59.454Berechnet den fehlenden Winkel
		System.out.println(triangle.calcHeight(12.54, 21.25, 24.674));		//Erwartet 10.8Berechnet die Höhe vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(triangle.calcHypotenuse(12.54, 21.25));		//Erwartet 24.674Berechnet die Hypotenuse vom Dreieck
		System.out.println(triangle.calcScope(12.54, 21.25, 24.674));		//Berechnet den Umfang vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(triangle.calcKathete(12.54, 21.25));		//Erwartet 21.25Berechnet die fehlende Kathete vom Dreieck
		
		System.out.println("Testfall2 Dreieck!");
		System.out.println("************************************");		
		System.out.println(triangle.calcArea(3, 4));			//Erwartet 6 Berechnet Fläche vom Dreieck
		System.out.println(triangle.calcCorner(53.13));			//Erwartet 36.87 Berechnet den fehlenden Winkel
		System.out.println(triangle.calcHeight(3, 4, 5));		//Erwartet 2.4 Berechnet die Höhe vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(triangle.calcHypotenuse(3, 4));		//Erwartet 5 Berechnet die Hypotenuse vom Dreieck
		System.out.println(triangle.calcScope(3, 4, 5));		//Erwartet 12 Berechnet den Umfang vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(triangle.calcKathete(3, 5));		    //Erwartet 4 Berechnet die fehlende Kathete vom Dreieck
		
		
		System.out.println("Testfall3 Dreieck!");
		System.out.println("************************************");		
		System.out.println(triangle.calcArea(3, 4));			//Erwartet 6 Berechnet Fläche vom Dreieck
		System.out.println(triangle.calcCorner(180));			//Erwartet 36.87 Berechnet den fehlenden Winkel
		System.out.println(triangle.calcHeight(3, 4, 5));		//Erwartet 2.4 Berechnet die Höhe vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(triangle.calcHypotenuse(3, 4));		//Erwartet 5 Berechnet die Hypotenuse vom Dreieck
		System.out.println(triangle.calcScope(3, 4, 5));		//Erwartet 12 Berechnet den Umfang vom Dreieck WENN NICHT RECHTWINKLIG IST DAS RESULTAT 0!
		System.out.println(triangle.calcKathete(3, 5));		    //Erwartet 4 Berechnet die fehlende Kathete vom Dreieck
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle Dreieck!");

		
		
	}

}
