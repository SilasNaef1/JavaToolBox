/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 27.03.2017
 *  LastChange: christopher
 *  Author christopher
 */
package mathFormulars;

import java.util.Date;

public class EinholzeitPunkt 
{
	
	public static double einholzeitPunktInSec(double car1, double geschwcar1InMProSec, double geschwcar2InMProSec, double car2)
	{
		if(geschwcar1InMProSec == 0 || geschwcar2InMProSec == 0 )
		{
			return 0;		
		}
		
		if(geschwcar1InMProSec > geschwcar2InMProSec)
		{
			return calculateEinholzeitpunkt(car1, geschwcar1InMProSec, geschwcar2InMProSec, car2);
		}
		else
		{
			return calculateEinholzeitpunkt(car2, geschwcar2InMProSec, geschwcar2InMProSec, car1);
		}
	}
	
	private static double calculateEinholzeitpunkt(double grösser, double geschw1, double geschw2, double kleiner)
	{
		return (geschw1 - geschw2)/(grösser - kleiner);
	}

}
