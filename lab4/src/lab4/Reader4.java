package lab4;
import java.util.Scanner;
public class Reader4 {
	int n;
	int number;
	double[] massiv;
	int[] massivN;
	String text;
	int numberOne;
	int numberTwo;
	public void scan1()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � �������");
		n = scn.nextInt();
		massiv = new double[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("������� " + (i+1) + " ������� �������");
			massiv[i] = scn.nextDouble();
		}
		scn.close();
		
	}
	
	public void scan2()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � �������");
		n = scn.nextInt();
		massiv = new double[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("������� " + (i+1) + " ������� �������");
			massiv[i] = scn.nextDouble();
		}
		scn.close();
		
	}
	
	public void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����������");
		text = scn.nextLine();
		scn.close();
	}
	
	public void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����������");
		text = scn.nextLine();
		scn.close();
	}
	
	public void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � ������");
		n = scn.nextInt();
		massivN = new int[n];
		for (int i = 0;i <= n -1;i++)
		{
			System.out.println("������� " + (i + 1) + " ������� �������");
			massivN[i] = scn.nextInt();
		}
		scn.close();
	}
	
	public  void scan7()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����");
		number = scn.nextInt();
		scn.close();
	}
	
	public  void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������ �����");
		numberOne = scn.nextInt();
		System.out.println("������� ������ �����");
		numberTwo = scn.nextInt();
		scn.close();
	}

}
