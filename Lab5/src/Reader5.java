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
		System.out.println("¬ведите первое предложение");
		str1 = scn.nextLine();
		System.out.println("¬ведите второе предложение");
		str2 = scn.nextLine();
		scn.close();
	}
	
	
	void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		n = scn.nextInt();
		scn.close();
	}
	
	void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в массиве");
		int n = scn.nextInt();
		str4 = new String[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("¬ведите " + (i+1) + " элемент массива:");
			str4[i] = scn.next();
		}
		System.out.println("¬ведите финальное слово:");
		str1 = scn.next();
		scn.close();
	}
	
	void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в массиве");
		int n = scn.nextInt();
		massivNum2 = new int[n];
		for (int i = 0; i < n;i++)
		{
			System.out.println("¬ведите " + (i + 1) + " элемент массива");
			massivNum2[i] = scn.nextInt();
		}
		scn.close();
		
	}
	
	void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в массиве");
		int n = scn.nextInt();
		massivNum = new int[n];
		for (int i = 0; i < n;i++)
		{
			System.out.println("¬ведите " + (i + 1) + " элемент массива");
			massivNum[i] = scn.nextInt();
		}
		scn.close();
	}
	
	void scan7()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение");
		str = scn.nextLine();
		scn.close();
	}
	
	void scan8()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите первое число");
		number1 = scn.nextInt();
		System.out.println("¬ведите второе число");
		number2 = scn.nextInt();
		scn.close();
	}
	
	void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("ѕервый город");
		town = scn.nextLine();
		System.out.println("¬ведите дату");
		date = scn.nextLine();
		System.out.println("¬торой город");
		town2 = scn.nextLine();
		scn.close();
	}
	
	void scan10()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		number1 = scn.nextInt();
		scn.close();
	}
}
