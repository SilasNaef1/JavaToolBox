import dataParser.StringToInt;
import economyCalc.BreakEven;
import mathFormulars.QuerSumme;

/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 08.05.2017
 *  LastChange: muster
 *  Author muster
 */

public class MainJannis {

	
	public static void main(String[] args) {
		System.out.println("************************************");
		System.out.println("StringToInt");
		System.out.println(StringToInt.ConvertStringToInt("2121"));
		System.out.println(StringToInt.ConvertStringToInt("23wdwdw"));
		int zahl = StringToInt.ConvertStringToInt("222");
		System.out.println(zahl);
		System.out.println("************************************");
	
		System.out.println("BreakEven Rechner");
		BreakEven Rechner = new BreakEven(1500, 3.50, 0.50);
		
		System.out.println(Rechner.Nutzmeng());
		System.out.println(Rechner.Nutzwert());
		System.out.println("************************************");
		System.out.println("Quersumme");
		System.out.println(QuerSumme.Quersumme(1234));
		System.out.println(QuerSumme.Quersumme("555"));
		System.out.println("************************************");
		
	}

}
