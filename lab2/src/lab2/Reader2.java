package lab2;

import java.util.Scanner;

public class Reader2 {
	int price;
	int discount;
	int n;
	int[] massiv;
	int firstN;
	int secondN;
	int thirdN;
	int payday1;
	int payday2;
	int payday3;
    int Sn;
	int number;
	String nameAndSurname;
	String text;
	String simvols;
	String predlozhenie;
	String predlozhenieFir;
	String predlozhenieSec;
	
	public void scan1()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ����� �� �����");
		Sn = scn.nextInt();
		System.out.println("������� ����� ����");
		number = scn.nextInt();
	}
	public void scan2()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ��� � �������");
		nameAndSurname = scn.nextLine();
	}
	public void scan3(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ��������� ������");
		price = scn.nextInt();
		System.out.println("������� ������ �� �����");
		discount = scn.nextInt();
	}
	
	public void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � ������");
		n = scn.nextInt();
		massiv = new int[n];
		for (int i = 0;i <= n-1;i++)
		{
			System.out.println("������� " + (i+1)+ " ������� �������");
			massiv[i] = scn.nextInt();
		}
	}
	
	public void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������ �����");
		firstN = scn.nextInt();
		System.out.println("������� ������ �����");
		secondN = scn.nextInt();
		System.out.println("������� ������ �����");
		thirdN = scn.nextInt();
		
	}
	public void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����������, ������� �� ������ ������������� ����� �������");
		text = scn.nextLine();
	}
	
	
	public void scan7()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �������� ������� ������������");
		payday1 = scn.nextInt();
		System.out.println("������� �������� ������� ������������");
		payday2 = scn.nextInt();
		System.out.println("������� �������� �������� ������������");
		payday3 = scn.nextInt();
	}
	
	public void scan8()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ����� ��������");
		simvols = scn.nextLine();
	}
	
	public void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����������");
		predlozhenie = scn.nextLine();
	}
	
	public void scan10()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������ �����������");
		predlozhenieFir = scn.nextLine();
		System.out.println("������� ������ �����������");
		predlozhenieSec = scn.nextLine();
	}
}
