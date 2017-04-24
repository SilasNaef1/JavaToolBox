/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  Method: translateToMs, translateToKm
 *  LastChange: Dueen
 *  Author Dueen
 */
package dataParser;

public class TranslatorKmhToMs {
	
	public static double translateToMs(double value) //Static method to translate from Km/h to M/s
	{
		if(value<0) // If the speed is negative
		{
			return 0; //return 0, because negative speed is impossible
		}
		else
		{
			return value/3.6; //return translated value
		}
	}
	
	public static double translateToKm(double value) //Static method to translate from M/s to Km/h
	{
		if(value<0) // If the speed is negative
		{
			return 0; //return 0, because negative speed is impossible
		}
		else
		{
			return value*3.6; //return translated value
		}
	}

}
