package lab3;

public class zadaniyaLab3 {
	
	public static void main(String args[])
	{
		 // zadaniye1();
		 // zadaniye2();
		 // zadaniye3();
		 // zadaniye4();
		 // zadaniye5();
		 // zadaniye6();
		 // zadaniye7();
		 // zadaniye8();
		 // zadaniye9();
		 // zadaniye10();
	}
	
	public static void zadaniye1()
	{
		System.out.println("������� �1");
		Reader3 r = new Reader3();
		r.scan1();
		chet1(r.nummass,r.n);
		for (int i = 0;i <= r.n - 1;i++)
		{
			System.out.println(r.coumass[i]+ ": " + (int)r.nummass[i]);
		}
	}
	
	// �����,�������, �������� ������ ������� � ���������, ���������� ������, � ������� ��� ��������� 
	// ��������� �� ���������� ��������.
	public static double[] chet1(double[] nummassiv, int n)
	{

		for (int i = 0;i <= n - 1;i++)
		{
			nummassiv[i] = Math.round(nummassiv[i]/1000000);
			nummassiv[i] *= 1000000;
		}
		
		return nummassiv;
	
	}
	
	public static void zadaniye2()
	{
		System.out.println("������� �2");
		Reader3 r = new Reader3();
		r.scan10();
		String[] answer = chet2(r.number);
		System.out.println(answer[0] + " ; " + answer[1]);
	}
	
	// �����, ������� ������� ������ ��� ������� ������������
	public static String[] chet2(double x)
	{
		String[] answer = new String[2];
		double gip = x * 2;
		double sr = x * Math.sqrt(3);
		answer[0] = String.format("%.2f", gip);
		answer[1] = String.format("%.2f", sr);
		return answer;		
	}
	
	public static void zadaniye3()
	{
		System.out.println("");
		System.out.println("������� �3");
		Reader3 r = new Reader3();
		r.scan3();
		System.out.println("���������: " + chet3(r.word1,r.word2));
	}
	
	// �����, ������� ��������� ���� "������, �������, ������".
	public static String chet3(String answer1,String answer2)
	{
		if ((answer1.equals("������")) && (answer2.equals("�������")))
			return "����� 1 ����������";
		else if ((answer2.equals("������")) && (answer1.equals("�������")))
			return "����� 2 ����������";
		else if ((answer1.equals("������")) && (answer2.equals("������")))
			return "����� 1 ����������";
		else if ((answer2.equals("������")) && (answer1.equals("������")))
			return "����� 2 ����������";
		else if ((answer1.equals("�������")) && (answer2.equals("������")))
			return "����� 1 ����������";
		else if ((answer2.equals("�������")) && (answer1.equals("������")))
			return "����� 2 ����������";
		else
	        return "�����";
		
	}
	
	public static void zadaniye4()
	{
		System.out.println("");
		System.out.println("������� �4");
		Reader3 r = new Reader3();
		r.scan4();
		System.out.println("���������: " + chet4(r.massiv,r.n));
	}
	
	// �����, ������� ����������, ����� ������ ����������� ������: ������ ��� ��������
	public static int chet4(int[] massiv,int n)
	{
		int sumchet = 0;
		int sumnechet = 0;
		for (int i = 0;i <= n-1;i++)
		{
			if (massiv[i] % 2 ==0)
				sumchet +=massiv[i];
			else
				sumnechet +=massiv[i];
		}
		
		if (sumchet > sumnechet)
			return sumchet - sumnechet;
		else
			return sumnechet - sumchet;
	}
	
	public static void zadaniye5()
	{
		System.out.println("");
		System.out.println("������� �5");
		Reader3 r = new Reader3();
		r.scan5();
		System.out.println("���������: " + chet5(r.predloz));
	}
	
	// �����, ������� ���������� �����, � ������� ��� ����� � ������ �������� ������ ���� ����������, � ��������
	public static String chet5(String text)
	{
		char[] arrayIs = text.toCharArray();
		String arrayB = text.toLowerCase();
		char[] arrayBig = arrayB.toCharArray();
		String arrayL = text.toUpperCase();
		char[] arrayLow = arrayL.toCharArray();
		String answer = "";
		for (int i = 0;i <= text.length()-1;i++)
		{
			if (arrayIs[i] == arrayBig[i])
				answer += arrayLow[i];
			else
				answer += arrayBig[i];
		}
		
		return answer;
	}
	
	public static void zadaniye6()
	{
		System.out.println("");
		System.out.println("������� �6");
		Reader3 r = new Reader3();
		r.scan5();
		System.out.println("���������: " + chet6(r.predloz));
	}
	
	// �����, ������� ������������� inator �� �����, ���� ����� ������������� ���������, � ��������� 
	// ������ ������ ���� ������������� -inator
	// ��������� ����� ����� ��������� ����� � �����, ���������� '000'.
	public static String chet6(String text)
	{
		int n = text.length();
		int flag = 0;
		char[] glasn = {'a','e','i','o','u','y'};
		char[] array = text.toCharArray();
		for (int i = 0; i <= 5;i++)
		{
			if (array[n-1] == glasn[i])
			{
				text = text + "-inator" + " " + text.length() + "000";
				flag = 1;
			}
		}
		
		if (flag == 0)
			text = text + "inator" + " " + text.length() + "000";
		return text;	
	}
	
	public static void zadaniye7()
	{
		System.out.println("");
		System.out.println("������� �7");
		Reader3 r = new Reader3();
		r.scan7();
		System.out.println("���������: " + chet7(r.hkir,r.wkir,r.glubkir,r.h,r.w));
	}

	// �����, ������� ��������� ��� ��������� ������� �: ������(a), 
	// ������(b) � �������(c) � ���������� true, ���� ���� ������ ����� ����������� � 
	// ��������� � �������(w) � �������(h).
	public static boolean chet7(int hkir,int wkir,int glubkir,int h,int w)
	{
		return ((hkir * wkir <= h * w)||(hkir * glubkir <= h * w)||(wkir * glubkir <= h * w));
	}
	
	public static void zadaniye8()
	{
		System.out.println("");
		System.out.println("������� �8");
		Reader3 r = new Reader3();
		r.scan8();
		System.out.format("%.2f",chet8(r.petrol,r.expend,r.passengers,r.cond));
	}
	
	// �����, ������� ��������� ������� (�����), ������ �������
	// (�����/100 ��), ����������, ����������� (���������� ��������) � ����������
	// ������������ ����������, ������� ����� �������� ����������
	public static double chet8(double petrol,double expend,int passengers,boolean cond)
	{
		if (cond == true)
			return petrol / (expend + 0.05 * expend * passengers + (expend + 0.05 * expend * passengers) * 0.1 )*100;
		else
			return petrol / (expend + 0.05 * expend * passengers)*100;
	}
	
	public static void zadaniye9()
	{
		System.out.println("");
		System.out.println("������� �9");
		Reader3 r = new Reader3();
		r.scan4();
		System.out.println("������� �������������� �����: " + chet9(r.massiv,r.n));
	}
	
	// �����, ������� ��������� ������ ����� � ���������� ������� �������� ���� ����� �������
	public static double chet9(int[] massiv,int n)
	{
		double sum = 0;
		for (int i = 0;i <= n-1;i++)
		{
			sum += massiv[i];
		}
		return sum / n;
		
	}
	
	public static void zadaniye10()
	{
		System.out.println("");
		System.out.println("������� �10");
		Reader3 r = new Reader3();
		r.scan10();
		System.out.println("���������: " + chet10(r.number));
	}
	
	// �����, ������� ��������� ����� � �������� ������� ������ �
	// ���������� true, ���� ����� ��� ���� ����� �� �� ��������, ��� � ��� �����. � 
	// ��������� ������ ������� false.
	public static boolean chet10(int number)
	{
		int sum = 0;
		int ostatok = 0;
		int forAns = number;
		while (number > 0)
		{
			ostatok  = number % 10;
			sum += ostatok;
			number -= ostatok;
			number /=10;
		}
		return (((forAns % 2 == 0)&&(sum % 2 == 0))||((forAns % 2 == 1)&&(sum % 2 == 1)));		
	}
	
	

}
