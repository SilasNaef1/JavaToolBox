/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  LastChange: muster
 *  Author muster
 */
package mathFormulars;

//Kann Zahlen von 0 bis auf 4 stellen Runden.
public class Round {
	private static double startValue;
	private static int decimalDigits;
	private static int Multiplier;
	private static double inCalc;
	private static double result;
	//Diese Methode wird von ausserhalb der Klasse aufgerufen
	public static double RoundValue(double value, int decimaldigits) {
		startValue = value;
		decimalDigits = decimaldigits;
		getDecimalDigitMultiplier(decimalDigits);
		Calc(value);
		return result;
	}
	//Diese Methode wird innerhalb der Klasse aufgerufen um zu Runden.
	private static void Calc(double value) {
		inCalc = value * Multiplier;
		inCalc = Math.round(inCalc);
		value = inCalc / Multiplier;
		result = value;
		
	}
	//Setzt den multiplier um die Zahl richtig zu runden.
	private static void getDecimalDigitMultiplier(int digits) {
		int multiplier = 0;
		switch(digits) {
			case 1:	multiplier = 10;
				break;
			case 2:	multiplier = 100;
				break;
			case 3:	multiplier = 1000;
				break;
			case 4:	multiplier = 10000;
				break;
			case 0: multiplier = 1;
				break;
			default: multiplier = 1;
		}
		Multiplier = multiplier;
	}
}
