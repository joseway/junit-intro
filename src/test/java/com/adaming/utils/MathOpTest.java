package com.adaming.utils;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOpTest {
	private MathOp mo;
	
	@BeforeEach
	public void setup() {
		mo  = new MathOp();
		System.out.println("Dans setup()");
	}

	@Test
	public void testSomme() {		
		int a = 22;
		int b = 4;
		int expected = a + b; 
		int actual = mo.somme(a, b);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	public void testDifference() {
		MathOp mo = new MathOp();
		int a = 22;
		int b = 4;
		int expected = a - b; 
		int actual = mo.difference(a, b);
		assertThat(actual).isEqualTo(expected);
	}

	@Test
	public void testCalculerInteret() {
		double montant = 50;
		double taux = 5;
		double expected = 2.5;
		double actual = mo.calculerInteret(montant, taux);
		assertThat(actual).isEqualTo(expected);
	}
	@Test
	public void testCalculerInteretSuperieur() {
		double montant = 50;
		double taux = 15;
		double expected = 5;
		double actual = mo.calculerInteret(montant, taux);
		assertThat(actual).isEqualTo(expected);
	}
}
