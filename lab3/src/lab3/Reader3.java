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
		System.out.println("������� ���������� �������, ������� �� ������ ������");
		n = scn.nextInt();
		coumass = new String[n];
		nummass = new double[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("������� �������� " + (i + 1) + " ������");
			coumass[i] = scn.next();
			System.out.println("������� ����������� ��������� " + (i + 1) + " ������");
			nummass[i] = scn.nextInt();
		}
	}
	
	public void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���� �� �������� ����:������, �������, ������(������ �����)");
		word1 = scn.next();
		System.out.println("������� ���� �� �������� ����:������, �������, ������(������ �����)");
		word2 = scn.next();
	}
	
	public void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � �������");
		n = scn.nextInt();
		massiv = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("������� " + (i+1) + " �������");
		    massiv[i] = scn.nextInt();
		}
	}
	
	public void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����������");
		predloz = scn.next();
	}
	
	public void scan7()
	{
	Scanner scn = new Scanner(System.in);
	System.out.println("������� ������ �������");
	hkir = scn.nextInt();
	System.out.println("������� ������ �������");
	wkir = scn.nextInt();
	System.out.println("������� ������� ��������");
	glubkir = scn.nextInt();
	System.out.println("������� ������ ���������");
	w = scn.nextInt();
	System.out.println("������� ������ ���������");
	h = scn.nextInt();

	}
	
	public void scan8()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ������� � ������");
		petrol = scn.nextDouble();
		System.out.println("������� ������ ������� �� 100 ����������");
		expend = scn.nextDouble();
		System.out.println("������� ���������� ����������");
		passengers = scn.nextInt();
		System.out.println("������� ����������� ��� ���?");
		cond = scn.nextBoolean();
	}
	
	public void scan10()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����");
		number = scn.nextInt();
	}
	
}
