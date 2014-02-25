package de.e4a;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zahlen = new int[5];
		int[] zahlen1 = { 42, 13, 27, -3, 42 };

		// Ausgabe mit for each

		for (int zahl : zahlen1) {
			System.out.println(zahl);
		}

		// Ausgabe mit for Schleife
		for (int index = 0; index < zahlen1.length; index++) {
			System.out.println(zahlen1[index]);
		}

		int maximum = max(zahlen1);
		System.out.println("Das Maximum ist:" + maximum);

		int minimum = min(zahlen1);
		System.out.println("Das Minimum ist:" + minimum);

		// Personenanzahl ausgeben mit KlassenMethoden am 25.02.2014

		Person p = new Person(23, "Tom");
		Person b = new Person(10, "Alex");
		System.out.println(Person.getZaehler());

		Testklasse.fib();
		for(int i = -1; i < 10; i++){
			System.out.println(fibonacciIterativ(i));
			
		}
		

	}

	// Fibonaccireihe Berechnen 25.02.2014

	public static void fib() {
		int[] fib = new int[50];
		fib[0] = 1;
		fib[1] = 1;

		// Ausgabe:
		for (int i = 2; i < fib.length; i++) {
			fib[i] = fib[i - 1] + fib[i - 2]; // Vorgänger Minus Vor-Vorgänger
			System.out.println(fib[i]);
		}
	}

	public static int fibonacciIterativ(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (n >= 2) {
			int erg = 0;
			int opa = 1;
			int vater = 1;
			for (int i = 2; i <= n; i++) {
				erg = opa + vater;
				opa = vater;
				vater = erg;
			}
			return erg;
		} else {
			return -1; // Fehler
		}

	}

	public static int fibrecursiv(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibrecursiv(n - 1) + fibrecursiv(n - 2);
		}
	}

	public static int max(int[] i) {
		int max = i[0];
		for (int index = 1; index < i.length; index++) {
			if (i[index] > max) {
				max = i[index];
			}
		}
		return max;
	}

	public static int min(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
