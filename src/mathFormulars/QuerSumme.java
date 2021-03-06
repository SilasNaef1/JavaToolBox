/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 27.03.2017
 *  LastChange: muster
 *  Author muster
 */
package mathFormulars;

import dataParser.StringToInt;

public class QuerSumme {
	
	public static int Quersumme(int zahl) {
	      // Berechnung der einfachen Quersumme:
	     int quersumme = 0;
	     do {        
	       quersumme = quersumme + zahl % 10;
	       zahl = zahl / 10;
	     } while (zahl > 0);

	     zahl = quersumme;
	      
	      
	     return zahl;
	    
	  }
	public static int Quersumme(String StringZahl) {
	    int zahl = StringToInt.ConvertStringToInt(StringZahl);
	    if(zahl==0){
	    	return 0;
	    }
	     // Berechnung der einfachen Quersumme:
	     int quersumme = 0;
	     do {        
	       quersumme = quersumme + zahl % 10;
	       zahl = zahl / 10;
	     } while (zahl > 0);

	     zahl = quersumme;
	     return zahl;
	  }
	public static boolean Test()
	{
		int resultat = Quersumme(123456789);
		int erwResultat = 45;
		if(resultat == erwResultat)
		{
			return true;
		}
		return false;
	}
	
	

}
