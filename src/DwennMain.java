/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 08.05.2017
 *  Method: Test
 *  LastChange: Dueen
 *  Author Dueen
 */

public class DwennMain {

	public static void main(String[] args) {
		
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
