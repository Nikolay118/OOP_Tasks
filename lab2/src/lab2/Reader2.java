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
		System.out.println("¬ведите количество домов на улице");
		Sn = scn.nextInt();
		System.out.println("¬ведите номер дома");
		number = scn.nextInt();
	}
	public void scan2()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите им€ и фамилию");
		nameAndSurname = scn.nextLine();
	}
	public void scan3(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите стоимость товара");
		price = scn.nextInt();
		System.out.println("¬ведите скидку на товар");
		discount = scn.nextInt();
	}
	
	public void scan4()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество элементов в масиве");
		n = scn.nextInt();
		massiv = new int[n];
		for (int i = 0;i <= n-1;i++)
		{
			System.out.println("¬ведите " + (i+1)+ " элемент массива");
			massiv[i] = scn.nextInt();
		}
	}
	
	public void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите первое число");
		firstN = scn.nextInt();
		System.out.println("¬ведите второе число");
		secondN = scn.nextInt();
		System.out.println("¬ведите третье число");
		thirdN = scn.nextInt();
		
	}
	public void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение, которое вы хотите воспроизвести задом наперед");
		text = scn.nextLine();
	}
	
	
	public void scan7()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите зарплату первого программиста");
		payday1 = scn.nextInt();
		System.out.println("¬ведите зарплату второго программиста");
		payday2 = scn.nextInt();
		System.out.println("¬ведите зарплату третьего программиста");
		payday3 = scn.nextInt();
	}
	
	public void scan8()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите набор символов");
		simvols = scn.nextLine();
	}
	
	public void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение");
		predlozhenie = scn.nextLine();
	}
	
	public void scan10()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите первое предложение");
		predlozhenieFir = scn.nextLine();
		System.out.println("¬ведите второе предложение");
		predlozhenieSec = scn.nextLine();
	}
}
