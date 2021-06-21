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
		System.out.println("¬ведите количество элементов в массиве");
		n = scn.nextInt();
		massiv = new double[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("¬ведите " + (i+1) + " элемент массива");
			massiv[i] = scn.nextDouble();
		}
		scn.close();
		
	}
	
	public void scan2()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в массиве");
		n = scn.nextInt();
		massiv = new double[n];
		for (int i = 0;i <= n - 1;i++)
		{
			System.out.println("¬ведите " + (i+1) + " элемент массива");
			massiv[i] = scn.nextDouble();
		}
		scn.close();
		
	}
	
	public void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение");
		text = scn.nextLine();
		scn.close();
	}
	
	public void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение");
		text = scn.nextLine();
		scn.close();
	}
	
	public void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в масиве");
		n = scn.nextInt();
		massivN = new int[n];
		for (int i = 0;i <= n -1;i++)
		{
			System.out.println("¬ведите " + (i + 1) + " элемент массива");
			massivN[i] = scn.nextInt();
		}
		scn.close();
	}
	
	public  void scan7()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		number = scn.nextInt();
		scn.close();
	}
	
	public  void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите первое число");
		numberOne = scn.nextInt();
		System.out.println("¬ведите второе число");
		numberTwo = scn.nextInt();
		scn.close();
	}

}
