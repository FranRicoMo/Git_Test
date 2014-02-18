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

}
