import dataParser.TranslatorTemperature;
import mathFormulars.Midnightformular;
import mathFormulars.PrimCheck;

/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 08.05.2017
 *  LastChange: sasha
 *  Author sasha
 */

public class SashaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(	TranslatorTemperature.test()){
			System.out.println("TranslatorTemperatureTest Passed!");
		}
		else{
			System.out.println("TranslatorTemperatureTest Failed!");
		}
		
		if(	PrimCheck.test()){
			System.out.println("PrimCheck Passed!");
		}
		else{
			System.out.println("PrimCheckTest Failed!");
		}
		
		if(	Midnightformular.test()){
			System.out.println("PrimCheck Passed!");
		}
		else{
			System.out.println("PrimCheckTest Failed!");
		}

	}

}
