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
package dataParser;

public class StringToInt {
	
	private static String string;
	
	
	public static int ConverStringToInt(String stringEingabe){
		string = stringEingabe;
		if (string.matches("[0-9]+")){
			return Integer.parseInt(string);
		}
		else{
			return 0;
		}
	}

}
