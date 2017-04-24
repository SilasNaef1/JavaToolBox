/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 13.03.2017
 *  Method: Test
 *  LastChange: Jannis
 *  Author: Silas
 */
import java.math.RoundingMode;

import cryptography .*;
import dataParser .*;
import economyCalc .*;
import mathFormulars.*;
import runtimeCalculations.calculateRuntime;

public class Main {

	public static void main(String[] args) {
		Test();
		
	}
	
	public static void Test()
	{
<<<<<<< HEAD
		mathFormulars.Function.testLinearFunction();

	
		System.out.println("Testfälle Dreieck!");
		System.out.println("______________________________________________");
=======
		Function test = mathFormulars.Function.linearFunction(6, -1, 2, 2);
>>>>>>> f6fc55f6373b905b40a3113616b31199dff07856
		
	
		calculateRuntime.setStartTime();
		System.out.println("Testfall Rechtwinkliges Dreieck");
		System.out.println("************************************");
		if(RightTriangle.test()) {
			System.out.println("RightTriangle: " + "Passed!");
		} else {
			System.out.println("RightTriangle: " + "Failed!");
		}
	
		System.out.println("Testfall StringToInt");
		System.out.println("************************************");
<<<<<<< HEAD
		
		
		System.out.println(StringToInt.ConverStringToInt("123"));
		System.out.println(StringToInt.ConverStringToInt("Test"));
		
		System.out.println("Testfall Quersumme");
		System.out.println("************************************");
		System.out.println(QuerSumme.QuersummeInt(121212));
=======
		if(StringToInt.Test()) {
			System.out.println("StringToInt: " + "Passed!");
		} else {
			System.out.println("StringToInt: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle StringToInt");
>>>>>>> f6fc55f6373b905b40a3113616b31199dff07856
		
		
		System.out.println("Testfall Runden");
		System.out.println("************************************");
		if(mathFormulars.Round.Test()) {
			System.out.println("Runden: " + "Passed!");
		} else {
			System.out.println("Runden: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle Runden");
		
		System.out.println("Testfall Mehrwertsteuer");
		System.out.println("************************************");
		if(mathFormulars.ValueAddedTaxVAT.Test()) {
			System.out.println("Mehrwertsteuer: " + "Passed!");
		} else {
			System.out.println("Mehrwertsteuer: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle Runden");
		
		System.out.println("Testfall CaesarCode");
		System.out.println("************************************");
		
		if(cryptography.CaesarCode.Test()) {
			System.out.println("CaesarCode: " + "Passed!");
		} else {
			System.out.println("CaesarCode: " + "Failed!");
		}
		
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle CaesarCode");
		
		System.out.println("Testfall BreakEven");
		System.out.println("************************************");
		BreakEven rechner = new BreakEven();
		if(rechner.Test()) {
			System.out.println("BreakEven: " + "Passed!");
		} else {
			System.out.println("BreakEven: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle BreakEven");

		
		System.out.println("Testfall Quersumme");
		System.out.println("************************************");
		if(mathFormulars.QuerSumme.Test()) {
			System.out.println("Quersumme: " + "Passed!");
		} else {
			System.out.println("Quersumme: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle Quersumme");
		if(	TranslatorTemperature.test()){
			System.out.println("TranslatorTemperatureTest Passed!");
		}
		else{
			System.out.println("TranslatorTemperatureTest Failed!");
		}
		calculateRuntime.setEndTime();
		calculateRuntime.Output();

	}

}
