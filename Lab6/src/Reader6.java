import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Reader6 {
	String str;
	String str1;
	int number;
	ArrayList<Integer> arrayList = new ArrayList<>();
	ArrayList<Integer> arrayList2 = new ArrayList<>();
	
	void scan1()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите первое предложение");
		str = scn.nextLine();
		System.out.println("¬ведите второе предложение");
		str1 = scn.nextLine();
		scn.close();
	}
	void scan2()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите предложение");
		str = scn.nextLine();
		System.out.println("ƒлина среза");
		number = scn.nextInt();
	}
	
	void scan3()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите message");
		str = scn.nextLine();
		System.out.println("¬ведите key");
		str1 = scn.nextLine();	
		scn.close();
	}
	
	void scan4() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		number = Integer.parseInt(reader.readLine());
		boolean flag = true;
		while (flag)
		{
			String number = reader.readLine();
			if (number.equals(""))
			{
				flag = false;
				break;
			}
			arrayList.add(Integer.parseInt(number));
		}
	}
	
	void scan5()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		number = scn.nextInt();
		scn.close();
	}
	
	void scan6()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		str = scn.nextLine();
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
		System.out.println("¬ведите число");
		number = scn.nextInt();
		scn.close();
	}
	
	void scan9()
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите пердложение");
		str = scn.nextLine();
	}
	
	void scan10() throws IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = true;
		while (flag)
		{
			String number = reader.readLine();
			if (number.equals(""))
			{
				flag = false;
				break;
			}
			arrayList2.add(Integer.parseInt(number));
		}
	}

}