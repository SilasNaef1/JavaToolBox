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
	
	public static Date einholzeitPunkt(Date car1, Date car2)
	{
		if(car1 == null || car2 == null)
		{
			return null;		
		}
		
		if(car1.getTime() > car2.getTime())
		{
			return calculateEinholzeitpunkt(car1, car2);
		}
		else
		{
			return calculateEinholzeitpunkt(car2, car1);
			
		}
	}
	
	private static Date calculateEinholzeitpunkt(Date grösser, Date kleiner)
	{
		
		
		
		return new Date();
		
	}

}
