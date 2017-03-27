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
	
	public static double einholzeitPunktInSec(double car1Ort, double geschwcar1InMProSec, double geschwcar2InMProSec, double car2Ort)
	{
		if(geschwcar1InMProSec == 0 || geschwcar2InMProSec == 0 )
		{
			return 0;		
		}
		
		if(geschwcar1InMProSec > geschwcar2InMProSec)
		{
			return calculateEinholzeitpunkt(car1Ort, geschwcar1InMProSec, geschwcar2InMProSec, car2Ort);
		}
		else
		{
			return calculateEinholzeitpunkt(car2Ort, geschwcar2InMProSec, geschwcar2InMProSec, car1Ort);
		}
	}
	
	private static double calculateEinholzeitpunkt(double start1, double geschw1, double geschw2, double start2)
	{
		if(start1 >= start2){
			return 0; //Sie können sich niemals überholen!
		}
		
		if(start1 - start2 == 0){
			return (geschw1 - geschw2)/(start1 - start2);
		}
		return 0;

	}

}
