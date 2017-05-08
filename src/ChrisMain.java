import mathFormulars.EinholzeitPunkt;
import mathFormulars.RightTriangle;

/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 08.05.2017
 *  LastChange: christopher
 *  Author christopher
 */

public class ChrisMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int carAStartOrt = 20;
		int carBStartOrt = 0;
		
		int carASpeed = 2;
		int carBSpeed = 4;
		
		
		//Car 3 und 4
		int carCStartZeitpunkt = 0;
		int carDStartZeitpunkt = 10;
		
		int carCSpeed = 2;
		int carDSpeed = 4;
		
		if(EinholzeitPunkt.einholzeitPunktInSecByStrecke(carAStartOrt, carASpeed, carBSpeed, carBStartOrt) == 10) {
			System.out.println("Auto1: "+carAStartOrt + " Ort und " + carASpeed + " Geschwindigkeit");
			System.out.println("Auto2: "+carBStartOrt + " Ort und " + carBSpeed + " Geschwindigkeit");
		} 
			else {
				System.out.println(EinholzeitPunkt.einholzeitPunktInSecByStrecke(carAStartOrt, carASpeed, carBSpeed, carBStartOrt));
			}
		
		System.out.println("CalcArea: " +RightTriangle.calcArea(4, 6));
		System.out.println("CalcCorner: " +RightTriangle.calcCorner(33.69));
		System.out.println("CalcHeight: " +RightTriangle.calcHeight(4, 6, 7.211));
		System.out.println("CalcHypotenuse: " +RightTriangle.calcHypotenuse(4, 6));
		System.out.println("CalcKathete: " +RightTriangle.calcKathete(4, 7.211));
		System.out.println("CalcScope: " +RightTriangle.calcScope(4, 6, 7.211));
	}

}
