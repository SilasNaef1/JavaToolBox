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

public class Round {
	private double startValue;
	private double inCalc;
	private double result;
	//Diese Methode wird von ausserhalb der Klasse aufgerufen
	public double RoundValue(double value) {
		this.startValue = value;
		Calc(value);
		return result;
	}
	//Diese Methode wird innerhalb der Klasse aufgerufen um zu Runden.
	private void Calc(double value) {
		inCalc = value * 100;
		inCalc = Math.round(inCalc);
		value = inCalc / 100;
		result = value;
	}
}
