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

public class ValueAddedTaxVAT {
	private static double startValue;
	private static double VATrate;
	private static double Result;
	private static double calcVATValue;
	private static double calcAddedVAT;
	private static double calcVAT(double value, double VAT) {
		startValue = value;
		VATrate = VAT;
		Result = value * VATrate;
		return Result;
	}
	public static double calcVATValue(double value, double VAT) {
		calcVATValue = calcVAT(value, VAT);
		return calcVATValue;
	}
	public static double calcAddedVAT(double value, double VAT) {
		calcVATValue = calcVAT(value, VAT);
		calcAddedVAT = startValue+calcVATValue;
		return calcAddedVAT;
	}
}
