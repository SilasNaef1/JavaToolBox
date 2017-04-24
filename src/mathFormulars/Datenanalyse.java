/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 24.04.2017
 *  LastChange: muster
 *  Author muster
 */
package mathFormulars;

import java.util.Arrays;

public class Datenanalyse {
	
	private int[] Werte;

	
	public Datenanalyse(int wert1) {
		Werte = new int[1];
		Werte[0] = wert1;
	}
	
	public Datenanalyse(int wert1, int wert2) {
		Werte = new int[2];
		Werte[0] = wert1;
		Werte[1] = wert2;
	}
	public Datenanalyse(int wert1, int wert2, int wert3) {
		Werte = new int[3];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
	}
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4) {
		Werte = new int[4];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
	}
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4, int wert5) {
		Werte = new int[5];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
		Werte[4] = wert5;
	}
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4, int wert5, 
			int wert6) {
		Werte = new int[6];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
		Werte[4] = wert5;
		Werte[5] = wert6;
	}
	
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4, int wert5, 
			int wert6, int wert7) {
		Werte = new int[7];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
		Werte[4] = wert5;
		Werte[5] = wert6;
		Werte[6] = wert7;
	}
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4, int wert5, 
			int wert6, int wert7, int wert8) {
		Werte = new int[8];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
		Werte[4] = wert5;
		Werte[5] = wert6;
		Werte[6] = wert7;
		Werte[7] = wert8;
	}
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4, int wert5, 
			int wert6, int wert7, int wert8, int wert9) {
		Werte = new int[9];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
		Werte[4] = wert5;
		Werte[5] = wert6;
		Werte[6] = wert7;
		Werte[7] = wert8;
		Werte[8] = wert9;
	}
	public Datenanalyse(int wert1, int wert2, int wert3, int wert4, int wert5, 
			int wert6, int wert7, int wert8, int wert9, int wert10) {
		Werte = new int[10];
		Werte[0] = wert1;
		Werte[1] = wert2;
		Werte[2] = wert3;
		Werte[3] = wert4;
		Werte[4] = wert5;
		Werte[5] = wert6;
		Werte[6] = wert7;
		Werte[7] = wert8;
		Werte[8] = wert9;
		Werte[9] = wert10;
	}
	
	
	public int Median(){
		Arrays.sort(Werte);
		int middle = ((Werte.length) / 2);
		
		if(Werte.length % 2 == 0){
		 int medianA = Werte[middle];
		 int medianB = Werte[middle-1];
		 int median = (medianA + medianB) / 2;
		 return median;
		} else{
		 int median = Werte[middle];
		 return median;
		}
		
	}
	
	public double Durchschnitt(){
		int durchschnittzahl = 0;
		
		for(int i=0;i<Werte.length; i++){
			
			durchschnittzahl = durchschnittzahl + Werte[i];
		}
		;
		double durchschnitt = (double)(durchschnittzahl)/(double)(Werte.length);
	
		
		
		return durchschnitt;
	}
	
	public boolean Test(){
		double test = Median();
		System.out.println(test);
		
		if (test == 5){
			return true;
		
		}
		else{
			return false;
		}
	}
	
	

}
