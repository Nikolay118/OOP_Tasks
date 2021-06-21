package lab1;

public class zadaniya {
	
	public static void main(String args[])
	{
		zadanie1();	
		zadanie2();
		zadanie3();
		zadanie4();
		zadanie5();
		zadanie6();
		zadanie7();
		zadanie8();
		zadanie9();
		zadanie10();
		
	}

        // ����� zadanie1 ������������ ��� ������ ��������� �������: scan1,chet1.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie1()
	{
		System.out.println("������� �1");
		Reader r = new Reader();
		r.scan1();
		int sec = chet1(r.min);
		System.out.println("���������� ������ � " + r.min + " ���. = " + sec);
		
	}

	// ����� chet1 ������������ ��� �������� ���������� ���������� ����� � �������
	public static int chet1(int min)
	{
		return min * 60;
	}

	// ����� zadanie2 ������������ ��� ������ ��������� �������: scan2,chet2.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie2()
	{
		System.out.println();
		System.out.println("������� �2");
		Reader r = new Reader();
		r.scan2();
		int answer = chet2(r.countx2,r.countx3);
		System.out.println("����� ���������� ����� = " + answer);

	}

	// ����� chet2 ������������ ��� �������� ������ ���������� �����, ����� �������� 2-x ������� � 3-� �������
	public static int chet2(int x,int y)
	{
		return x * 2 + y * 3;
	}

	// ����� zadanie3 ������������ ��� ������ ��������� �������: scan3,chet3.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie3()
	{
		System.out.println();
		System.out.println("������� �3");
		Reader r = new Reader();
		r.scan3();
		int answer = chet3(r.pobedy,r.ni4iy,r.pobedy);
		System.out.println("����� ���������� �����, ��������� �� ������ ������ " + answer);

	}

	// ����� chet3 ������������ ��� ������� ���������� ����� ������������ �� ����� ���������� ������
	public static int chet3(int pob,int ni4,int por)
	{
		return pob * 3 + ni4 * 1 + por * 0;
	}

	// ����� zadanie4 ������������ ��� ������ ��������� �������: scan4,chet4.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie4()
	{
		System.out.println();
		System.out.println("������� �4");
		Reader r = new Reader();
		r.scan4();
		boolean answer = chet4(r.chislo);
		System.out.println("��������� " + answer);
		
	}

	//����� chet4 ������������ ��� ����������� ����������� ������� ����� �� ���� ��� �������
	public static boolean chet4(int chislo)
	{
		    return chislo % 5 == 0;
	}

	// ����� zadanie5 ������������ ��� ������ ��������� �������: scan4,chet5.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie5()
	{
		System.out.println();
		System.out.println("������� �5");
		Reader r = new Reader();
		r.scan5();
		boolean answer = chet5(r.a,r.b);
		System.out.println("��������� " + answer);
		
	}

	//����� chet5 ������������ ��� ����������� ����������� ������� ����� � �� ������, � �� ���� ��� �������
	public static boolean chet5(boolean a,boolean b)
	{
			return (a && b);
	}

	// ����� zadanie6 ������������ ��� ������ ��������� �������: scan6,chet6.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie6()
	{
		System.out.println();
		System.out.println("������� �6");
		Reader r = new Reader();
		r.scan6();
		int answer = chet6(r.n,r.w,r.h);
		System.out.println("������ ������ �� " + answer + " ����");
		
	}

	// ����� chet6 ������������ ��� ����������� ���������� ������ ����, ������� ������� ����� ���������
	public static int chet6(int n, int w , int h)
	{
		return n/(w*h);
	}

	// ����� zadanie7 ������������ ��� ������ ��������� �������: scan4,chet7Squaed.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie7()
	{
		System.out.println();
		System.out.println("������� �7");
		Reader r = new Reader();
		r.scan4();
		int answer = chet7Squaed(r.chislo);
		System.out.println("������� ������ ����� �����: " + answer);
		
	}

	// ����� chet7Squaed ������������ ��� ���������� ������ ����� � �������
	public static int chet7Squaed(int b)
	{
		return b * b;
	}

	// ����� zadanie8 ������������ ��� ������ ��������� �������: scan8,chet8.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie8()
	{
		System.out.println();
		System.out.println("������� �8");
		Reader r = new Reader();
		r.scan8();
		boolean answer = chet8(r.prob,r.prize,r.pay);
		System.out.println("���������: " + answer);
	}

	// ����� chet8 ������������ ��� ����������� ������ �������
	public static boolean chet8(int prob, int prize , int pay)
	{
			return (prob * prize - pay > 0);
	}

	// ����� zadanie9 ������������ ��� ������ ��������� �������: scan9,chet9.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie9()
	{
		System.out.println();
		System.out.println("������� �9");
		Reader r = new Reader();
		r.scan9();
		int answer = chet9(r.FPS,r.cmin);
		System.out.println("���������� ������ �� ��������� �����: " + answer);
	}

	// ����� chet9 ������������ ��� ������� ������ ���������� ������ �� ��������� ����� � ����������� �� FPS
	public static int chet9(int FPS,int min)
	{
		return FPS * min * 60;
	}

	// ����� zadanie10 ������������ ��� ������ ��������� �������: scan10,chet10.����� �� ������ ��� ����������� ������ ������.
	public static void zadanie10()
	{
		System.out.println();
		System.out.println("������� �10");
		Reader r = new Reader();
		r.scan10();
		int answer = chet10(r.chislo10,r.delitel);
		System.out.println("������� �� �������: " + answer);

	}

	// ����� chet10 ������������ ��� ����������� ������� �� ������� �� ��������� %
	public static int chet10(int x,int delitel)
	{
		int answer;
		int rezdel = x / delitel;
		if ( rezdel * delitel == x)
			return 0;
		else {
			answer = x - rezdel * delitel;
			return answer;
		}

	}
	
}
