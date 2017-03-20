/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  Method: Test
 *  LastChange: Dueen
 *  Author Dueen
 */
package dataParser;

import java.util.Scanner;

public class TranslatorKmhToMs {
	
	public static void translateToMs()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Zahl an:\n");
		double value = scan.nextDouble();
		if(value<0)
		{
			System.out.println("\nUngültiger Wert!");
		}
		else
		{
			System.out.println("\n"+value+" km/h entsprechen "+value/3.6+"m/s");
		}
		scan.close();
	}

}
