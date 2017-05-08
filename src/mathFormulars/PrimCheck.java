/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 27.03.2017
 *  LastChange: sasha
 *  Author sasha
 */
package mathFormulars;

public class PrimCheck {
	public boolean checkPrim(int value)
	{
		if(value == 1 || value == 0) //0, 1, 2 sind Ausnahmen
		{
			return false;
		}
		if(value == 2)
		{
			return true;
		}
		else
		{
			for(int i = 2; i * 2 <= value; i++) //wenn 2 * i grösser ist dann ist zahl / i sicher nicht mehr teilbar
			{
				if(value % i == 0)
				{
					return false;
				}
			}
			return true;
		}
	}
	
	
	public static boolean test()
	{
		if(23 == 1 || 23 == 0) //0, 1, 2 sind Ausnahmen
		{
			return false;
		}
		if(23 == 2)
		{
			return false;
		}
		else
		{
			for(int i = 2; i * 2 <= 23; i++) //wenn 2 * i grösser ist dann ist zahl / i sicher nicht mehr teilbar
			{
				if(23 % i == 0)
				{
					return false;
				}
			}
			return true;
		}
		
	}
	
	public boolean test2()
	{
		if(40 == 1 || 40 == 0) //0, 1, 2 sind Ausnahmen
		{
			return false;
		}
		if(40 == 2)
		{
			return false;
		}
		else
		{
			for(int i = 2; i * 2 <= 40; i++) //wenn 2 * i grösser ist dann ist zahl / i sicher nicht mehr teilbar
			{
				if(40 % i == 0)
				{
					return true;
				}
			}
			return false;
		}
	}
}