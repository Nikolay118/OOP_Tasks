package lab3;

import java.util.Scanner;

public class Reader3 {

	String word1;
	String word2;
	int n;
	int[] massiv;
	double petrol;
	double expend;
	int passengers;
	boolean cond;
	int number;
	int hkir;
	int wkir;
	int glubkir;
	int w;
	int h;
	String predloz;
	String[] coumass;
	double[] nummass;
	
	public void scan1()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество городов, которое вы хотите ввести");
		n = scn.nextInt();
		coumass = new String[n];
		nummass = new double[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("¬ведите название " + (i + 1) + " города");
			coumass[i] = scn.next();
			System.out.println("¬ведите численность населени€ " + (i + 1) + " города");
			nummass[i] = scn.nextInt();
		}
	}
	
	public void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите одно из следющих слов:камень, ножницы, бумага(первый игрок)");
		word1 = scn.next();
		System.out.println("¬ведите одно из следющих слов:камень, ножницы, бумага(второй игрок)");
		word2 = scn.next();
	}
	
	public void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в массиве");
		n = scn.nextInt();
		massiv = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("¬ведите " + (i+1) + " элемент");
		    massiv[i] = scn.nextInt();
		}
	}
	
	public void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение");
		predloz = scn.next();
	}
	
	public void scan7()
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("¬ведите высоту кирпича");
	hkir = scn.nextInt();
	System.out.println("¬ведите ширину кирпича");
	wkir = scn.nextInt();
	System.out.println("¬ведите глубину кирипича");
	glubkir = scn.nextInt();
	System.out.println("¬ведите ширину отверсти€");
	w = scn.nextInt();
	System.out.println("¬ведите высоту отверсти€");
	h = scn.nextInt();

	}
	
	public void scan8()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество бензина в литрах");
		petrol = scn.nextDouble();
		System.out.println("¬ведите расход топлива на 100 километров");
		expend = scn.nextDouble();
		System.out.println("¬ведите количество пассажиров");
		passengers = scn.nextInt();
		System.out.println("¬ключен кондиционер или нет?");
		cond = scn.nextBoolean();
	}
	
	public void scan10()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		number = scn.nextInt();
	}
	
}
