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
	    

	    
	    while (zahl > 9) {
	      
	      // Berechnung der einfachen Quersumme:
	      int quersumme = 0;
	      do {        
	        quersumme = quersumme + zahl % 10;
	        zahl = zahl / 10;
	      } while (zahl > 0);

	      zahl = quersumme;
	    }

	    return zahl;
	  }
	
	
	public static int Quersumme(String StringZahl) {
	    int zahl = StringToInt.ConverStringToInt(StringZahl);
	    if(zahl==0){
	    	return 0;
	    }

	    
	    while (zahl > 9) {
	      
	      // Berechnung der einfachen Quersumme:
	      int quersumme = 0;
	      do {        
	        quersumme = quersumme + zahl % 10;
	        zahl = zahl / 10;
	      } while (zahl > 0);

	      zahl = quersumme;
	    }

	    return zahl;
	  }
	
	

}
