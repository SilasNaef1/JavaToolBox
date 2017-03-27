/*
 * 	Copyright (c) 2017 IN2C
 *	All Rights Reserved
 *
 *	This product is protected by copyright and distributed under
 *  licenses restricting copying, distribution and decompilation.
 *  
 *  GitHubUrl: https://github.com/SilasNaef1/JavaToolBox.git
 *  Date: 20.03.2017
 *  LastChange: Jannis
 *  Author Jannis
 */
package economyCalc;

public class BreakEven {
	
	private double fixeKosten;
	private double netto;
	private double varKosten;
	private double nutzMeng;
	private double nutzWert;
	private double deckungsBeitrag;
	
	public BreakEven(double fixeKosten, double netto, double varKosten) {

		this.fixeKosten = fixeKosten;
		this.netto = netto;
		this.varKosten = varKosten;
		this.deckungsBeitrag = netto - varKosten;
	}
	
	public double Nutzmeng(){
		
		if (deckungsBeitrag != 0){
			nutzMeng = fixeKosten / deckungsBeitrag;
			return nutzMeng;
		}
		else{
			return 0;
		}
		
	}
	
	public double Nutzwert(){
		if (nutzMeng != 0){
			nutzWert = nutzMeng * netto;
			return nutzWert;
		}
		else {
			return 0;
		}
		
		
	}

	/**
	 * @return the fixeKosten
	 */
	public double getFixeKosten() {
		return fixeKosten;
	}

	/**
	 * @param fixeKosten the fixeKosten to set
	 */
	public void setFixeKosten(double fixeKosten) {
		this.fixeKosten = fixeKosten;
	}

	/**
	 * @return the netto
	 */
	public double getNetto() {
		return netto;
	}

	/**
	 * @param netto the netto to set
	 */
	public void setNetto(double netto) {
		this.netto = netto;
	}

	/**
	 * @return the varKosten
	 */
	public double getVarKosten() {
		return varKosten;
	}

	/**
	 * @param varKosten the varKosten to set
	 */
	public void setVarKosten(double varKosten) {
		this.varKosten = varKosten;
	}
	
	
	
	
	
	
	

}
