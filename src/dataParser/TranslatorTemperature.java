/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  LastChange: sasha
 *  Author sasha
 */
package dataParser;

public class TranslatorTemperature {
	
	/*public void translateTemperature()
	{
		double grad = 0;
		double fahrenheit = 0;
		
		boolean complete = false;
		System.out.println("Was möchten Sie\n1) Grad in Fahrenheit, Drücke 1\n2) Fahrenheit in Grad, Drücke 2");
		
		String tmp = "0";
		tmp = s.next();
		
		//geht solange durch, bis die Umrechnung Fehlerfrei durchgeführt wurde
		while(complete == false)
		{
			//Wenn 1 gedrückt wurde dann Grad eingeben und dann wird es umgewandelt
			if(tmp.equals("1"))
			{
				System.out.println("Geben Sie die Temperatur in Grad ein:");
				grad = s.nextDouble();
				fahrenheit = grad * 1.8 + 32;
				System.out.println(grad + " Grad Celsius entsprechen " + fahrenheit + " Fahrenheit");
				complete = true;
			}
			
			//Wenn 2 gedrückt wurde dann Fahrenheit eingeben und dann wird es umgewandelt
			else if(tmp.equals("2"))
			{
				System.out.println("Geben Sie die Temperatur in Fahrenheit ein:");
				fahrenheit = s.nextDouble();
				grad = (fahrenheit - 32) / 1.8;
				System.out.println(fahrenheit + " Fahrenheit entsprechen " + grad + " Grad Celsius");
				complete = true;
			}
			
			//Wenn Eingabe falsch ist dann nochmal neu nachfragen
			else
			{
				System.out.println("Die Eingabe ist nicht gültig. Versuchen Sie es er neut...");
				System.out.println("\nWas möchten Sie\n1) Grad in Fahrenheit, Drücke 1\n2) Fahrenheit in Grad, Drücke 2");
				tmp = s.next();
			}
		}
	}*/
	
	//Umrechnung von Celsius in Fahrenheit
	public static double celsiusInFahrenheit(double grad)
	{
		double fahrenheit;
		fahrenheit = grad * 1.8 + 32;
		return fahrenheit;
	}
	
	//Umrechnung von Fahrenheit in Celsius
	public static double fahrenheitInCelsius(double fahrenheit)
	{
		double grad;
		grad = (fahrenheit - 32) / 1.8;
		return grad;
	}
	
	//Testfunktion
	public static boolean test()
	{
		
		if(celsiusInFahrenheit(0) != 33 && fahrenheitInCelsius(41) != 5)
		{
			return false;
		}
		return true;
	}
}
