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
	
	public static double einholzeitPunktInSecByStrecke(double car1Ort, double geschwcar1InMProSec, double geschwcar2InMProSec, double car2Ort)
	{
		if(geschwcar1InMProSec == 0 || geschwcar2InMProSec == 0 )
		{
			return 0;		
		}
		
		if(geschwcar1InMProSec > geschwcar2InMProSec)
		{
			if(differenceBetweenDouble(car1Ort, car2Ort))
			{
				return 0;
			}
			return calculateEinholzeitpunktByStrecke(car1Ort, geschwcar1InMProSec, geschwcar2InMProSec, car2Ort);
		}
		else
		{
			if(differenceBetweenDouble(car2Ort, car1Ort))
			{
				return 0;
			}
			return calculateEinholzeitpunktByStrecke(car2Ort, geschwcar2InMProSec, geschwcar1InMProSec, car1Ort);
		}
		
	}
	
	private static boolean differenceBetweenDouble(double wert1, double wert2)
	{
		if(wert1 >= wert2)
		{
			return true;
		}
		return false;
	}
	
		private static double calculateEinholzeitpunktByStrecke(double start1, double geschw1, double geschw2, double start2)
	{
		return (start1-start2)/(geschw2-geschw1);
	}
	
	private static double calculateEinholzeitpunkt(double start1, double geschw1, double geschw2, double start2)
	{
		return ((start1-start2) * geschw1)/(geschw1 - geschw2);
	}
	
	public static boolean test()
	{
		int carAStartOrt = 20;
		int carBStartOrt = 0;
		
		int carASpeed = 2;
		int carBSpeed = 4;
		
		
		//Car 3 und 4
		int carCStartZeitpunkt = 0;
		int carDStartZeitpunkt = 10;
		
		int carCSpeed = 2;
		int carDSpeed = 4;
		
		if(calculateEinholzeitpunktByStrecke(carAStartOrt, carASpeed, carBSpeed, carBStartOrt) == 10) {
			return true;
		} 
			else {
				System.out.println(calculateEinholzeitpunktByStrecke(carAStartOrt, carASpeed, carBSpeed, carBStartOrt));
				return false;
			}
		
	}

}
