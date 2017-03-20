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
	
	public static double translateToMs(double value)
	{
		if(value<0)
		{
			return 0;
		}
		else
		{
			return value/3.6;
		}
	}
	
	public static double translateToKm(double value)
	{
		if(value<0)
		{
			return 0;
		}
		else
		{
			return value*3.6;
		}
	}

}
