package lab2;
public class zadaniyaLab2 {
	public static void main(String args[])
	{
        zadaniye1();
		zadaniye2();
		zadaniye3();
		zadaniye4();
		zadaniye5();
        zadaniye6();
		zadaniye7();
		zadaniye8();
		zadaniye9();
		zadaniye10();
	
	}
	
	public static void zadaniye1()
	{
		System.out.println("������� �1");
		Reader2 r = new Reader2();
		r.scan1();
		int answer = chet1(r.Sn,r.number);
		System.out.println(answer);
	}
	
	// ����� ��� ������ ����������������  ���� �� �����
	public static int chet1(int n, int number)
	{
		int index = 0;
		int[] polarray = new int[n];
		for (int i = 0;i <= n-1;i++)
		{
			polarray[i] = 2*i + 2;
		}
		
		int[] otriarray = new int[n];
		int j = n-1;
		for (int i = 0;i <= n-1;i++)
		{
			otriarray[i] = 2*j + 1;
			j -=1;
		}
		
		if (number % 2 ==0)
		{
		   for (int i = 0; i<=n-1;i++)
		   {
			    if (polarray[i] == number)
				    index = i;
		   }
		return otriarray[index];
		}
		else
		{
			for (int i = 0; i <= n-1;i++)
			{
				if (otriarray[i] == number)
					index = i;
			}
			return polarray[index];
		}

		
	}
	
	public static void zadaniye2()
	{
		System.out.println("");
		System.out.println("������� �2");
		Reader2 r = new Reader2();
		r.scan2();
		System.out.println("������� � ���: " + chet2(r.nameAndSurname));
	}
	
	// ����� ��� ������ ������� ����� � �������
	public static String chet2(String NandS)
	{
		char[] array = NandS.toCharArray();
		String name = "";
		String surname = "";
		int i = 0;
		while (array[i] != ' ')
		{
			name = name + array[i];
			i += 1;
		}

		for (i = i;i <= NandS.length()-1;i++)
		{
			surname = surname + array[i];
		}
		
		return surname + " " + name;
	}

	public static void zadaniye3()
	{
		System.out.println("");
		System.out.println("������� �3");
		Reader2 r = new Reader2();
		r.scan3();
		System.out.println("�������� ��������� ������ " + chet3(r.price,r.discount));
	}
	
	// ����� ��� ������ �������� ��������� ������ � ������ ������
	public static double chet3(int price,int discount)
	{
		return price - (price / 100 * discount);
	}
	
	public static void zadaniye4()
	{
		System.out.println("");
		System.out.println("������� �4");
		Reader2 r = new Reader2();
		r.scan4();
		System.out.println("������� ����� ���������� ��������� ������� � ���������� " + chet4(r.massiv,r.n));
	}
	
	// �����, ������� ������� ������� ����� ������������ ��������� ������� � ����������� ��������� �������
	public static int chet4(int[] massiv,int n)
	{
		int min = massiv[0];
		int max = massiv[0];
		for (int i = 0;i <= n - 2;i++)
		{
			if (min > massiv[i+1])
				min = massiv[i+1];
		}
		
		for (int i = 0;i <= n - 2;i++)
		{
			if (max < massiv[i+1])
				max = massiv[i+1];
		}
		
		return max - min;
	}
	
	public static void zadaniye5()
	{
		System.out.println("");
		System.out.println("������� �5");
		Reader2 r = new Reader2();
		r.scan5();
		System.out.println("���������� ����� �����, ������� ���������� ��������: " + chet5(r.firstN,r.secondN,r.thirdN));
	}
	
	// �����, ������� ��������� ��� ����� � ���������� ���������� ������������� �����
	public static int chet5(int a,int b,int c)
	{
		int counter = 0;
		if (a == b)
		{
			counter = 2;
			if (a == c)
				counter +=1;
		}
		else if (a == c)
		{
			counter = 2;
		    if (a == b)
			    counter +=1;
		}
		else if (b == c)
			{
				counter = 2;
				if (b == a)
					counter +=1;
			}
		return counter;
	}
	
	public static void zadaniye6()
	{
		System.out.println("");
		System.out.println("������� �6");
		Reader2 r = new Reader2();
		r.scan6();
		System.out.println("����������� ����� ��������: " + chet6(r.text));
	}
	
	// �����, ������� �������� �� ���� ������ � ������� �� � �������� �������
	public static String chet6(String text)
	{
		char[] array = text.toCharArray();
		String answer = "";
		for (int i = text.length()- 1;i>=0;i--)
		{
			answer = answer + array[i];
		}
		return answer;
	}
	
	public static void zadaniye7()
	{
		System.out.println("");
		System.out.println("������� �7");
		Reader2 r = new Reader2();
		r.scan7();
		System.out.println("������� ����� ���������� � ������������ ���������: " + chet7(r.payday1,r.payday2,r.payday3));
		
		
	}
	
	// �����, ������� �������� �� ���� ��� �������� ������������� � ������� ������� ����� ����� ������� �������� � ����� ������ ��������
	public static int chet7(int payday1,int payday2,int payday3)
	{
		int min = payday1;
		if (min > payday2)
			min = payday2;
		if (min > payday3)
			min = payday3;
		
		int max = payday1;
		if (max < payday2)
			max = payday2;
		if (max < payday3)
			max = payday3;
		
		return max - min;
	}
	
	public static void zadaniye8()
	{
		System.out.println("");
		System.out.println("������� �8");
		Reader2 r = new Reader2();
		r.scan8();
		System.out.println("��������� " + chet8(r.simvols));
	}
	
	// �����, ������� ��������� �� ���� ������ � ���������� true, ���� ���������� �������� x ��������� � ����������� �������� o
	public static boolean chet8(String simvols)
	{
		int counterO = 0;
		int counterX = 0;
		char[] array = simvols.toCharArray();
		for (int i = 0;i <= simvols.length()-1;i++)
		{
			if ((array[i] == 'o') || (array[i] == 'O'))
				counterO +=1;
			else if ((array[i] == 'x') || (array[i] == 'X'))
				counterX +=1;	
		}
		
		if ((counterO != 0) && (counterX != 0))
			return counterO == counterX;
		else 
			return true;
	}
	
	public static void zadaniye9()
	{
		System.out.println("");
		System.out.println("������� �9");
		Reader2 r = new Reader2();
		r.scan9();
		System.out.println(chet9(r.predlozhenie));
	}
	// �����, ������� ������� ����� bomb � ��������� ����������� � ���������� true, ���� ��� ����� ������������ � ��������� �����������
	public static String chet9(String text)
	{
		String substring = "bomb";
		String substringB = "BOMB";
		if (text.contains(substring)|| text.contains(substringB) )
			return "DUCK!";
		else 
			return "Relax, there's no bomb.";
		
	}
	public static void zadaniye10()
	{
		System.out.println("");
		System.out.println("������� �10");
		Reader2 r = new Reader2();
		r.scan10();
		System.out.println("���������: " + chet10(r.predlozhenieFir,r.predlozhenieSec));
	}
	
	// �����, ������� ���������� true, ���� ����� �������� ASCII ������ ������ ��������� � ������ 
	// �������� ASCII ������ ������, � ��������� ������ ���������� false.
	public static boolean chet10(String text1,String text2)
	{
		int Askii1 = 0;
		char[] array1 = text1.toCharArray();
		for (int i = 0;i <= text1.length()-1;i++)
		{
			Askii1 = Askii1 + (int) array1[i];
		}
		
		int Askii2 = 0;
		char[] array2 = text2.toCharArray();
		for (int i = 0;i <= text2.length()-1;i++)
		{
			Askii2 = Askii2 + (int) array2[i];
		}
		return Askii1 == Askii2;
		
	}

}
