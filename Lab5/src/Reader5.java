import java.util.Scanner;
public class Reader5 {

	String str;
	String str1;
	String str2;
	String[] str4;
	String str5;
	String town;
	String town2;
	String date;
	int n;
	int number1;
	int number2;
	int[] massivNum;
	int[] massivNum2;
	
	void scan1()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������ �����������");
		str1 = scn.nextLine();
		System.out.println("������� ������ �����������");
		str2 = scn.nextLine();
		scn.close();
	}
	
	
	void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����");
		n = scn.nextInt();
		scn.close();
	}
	
	void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � �������");
		int n = scn.nextInt();
		str4 = new String[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("������� " + (i+1) + " ������� �������:");
			str4[i] = scn.next();
		}
		System.out.println("������� ��������� �����:");
		str1 = scn.next();
		scn.close();
	}
	
	void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � �������");
		int n = scn.nextInt();
		massivNum2 = new int[n];
		for (int i = 0; i < n;i++)
		{
			System.out.println("������� " + (i + 1) + " ������� �������");
			massivNum2[i] = scn.nextInt();
		}
		scn.close();
		
	}
	
	void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ��������� � �������");
		int n = scn.nextInt();
		massivNum = new int[n];
		for (int i = 0; i < n;i++)
		{
			System.out.println("������� " + (i + 1) + " ������� �������");
			massivNum[i] = scn.nextInt();
		}
		scn.close();
	}
	
	void scan7()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����������");
		str = scn.nextLine();
		scn.close();
	}
	
	void scan8()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ������ �����");
		number1 = scn.nextInt();
		System.out.println("������� ������ �����");
		number2 = scn.nextInt();
		scn.close();
	}
	
	void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������ �����");
		town = scn.nextLine();
		System.out.println("������� ����");
		date = scn.nextLine();
		System.out.println("������ �����");
		town2 = scn.nextLine();
		scn.close();
	}
	
	void scan10()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����");
		number1 = scn.nextInt();
		scn.close();
	}
}
