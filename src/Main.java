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
 *  LastChange: Dueen
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
		mathFormulars.Function.testLinearFunction();

	
		System.out.println("Testfälle Dreieck!");
		System.out.println("______________________________________________");
		Function test = mathFormulars.Function.linearFunction(6, -1, 2, 2);		
	
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
		
		
		System.out.println(StringToInt.ConvertStringToInt("123"));
		System.out.println(StringToInt.ConvertStringToInt("Test"));
		
		System.out.println("Testfall Quersumme");
		System.out.println("************************************");
		System.out.println(QuerSumme.Quersumme(121212));
		if(StringToInt.Test()) {
			System.out.println("StringToInt: " + "Passed!");
		} else {
			System.out.println("StringToInt: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle StringToInt");
		
		
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
		System.out.println("Testfall Einholzeitunkt");
		System.out.println("************************************");
		if(mathFormulars.EinholzeitPunkt.test()) {
			System.out.println("Einholzeitpunkt: " + "Passed!");
		} else {
			System.out.println("Einholzeitpunkt: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle Quersumme");

		System.out.println("Testfall Datenanlyse");
		System.out.println("************************************");
		Datenanalyse analyse = new Datenanalyse(5, 16, 1, 2, 6);
		if(analyse.Test()) {
			System.out.println("Datenanalyse: " + "Passed!");
		} else {
			System.out.println("Datenanalyse: " + "Failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle Datenanalyse");
	
		calculateRuntime.setEndTime();
		calculateRuntime.Output();
		
		System.out.println("Testfall LinearFunction");
		System.out.println("************************************");
		if(	mathFormulars.Function.testLinearFunction()){
			System.out.println("LinearFunctionTest Passed!");
		}
		else{
			System.out.println("LinearFunctionTest failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle LinearFunction");
		
		System.out.println("Testfall TranslatorKmhToMs");
		System.out.println("************************************");
		if(	dataParser.TranslatorKmhToMs.testTranslation()){
			System.out.println("Translator test Passed!");
		}
		else{
			System.out.println("Translator test failed!");
		}
		System.out.println("______________________________________________");
		System.out.println("Ende Testfälle TranslatorKmhToMs");

	}

}
