package com.adaming.utils;

public class MathOp {

	public int somme(int a, int b) {
		return a + b;
	}
	public int difference(int a, int b) {
		return a - b;
	}
	public double calculerInteret(double montant, double taux) {
		double max = 10;
		if(taux > max) {
			taux = 10;
		}
		return montant * taux / 100;
	}
}
