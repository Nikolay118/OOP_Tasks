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

        // Метод zadanie1 предназначен для вызова следующих методов: scan1,chet1.Также он служит для корректного вывода данных.
	public static void zadanie1()
	{
		System.out.println("Задание №1");
		Reader r = new Reader();
		r.scan1();
		int sec = chet1(r.min);
		System.out.println("Количество секунд в " + r.min + " мин. = " + sec);
		
	}

	// Метод chet1 предназначен для перевода указанного количества минут в секунды
	public static int chet1(int min)
	{
		return min * 60;
	}

	// Метод zadanie2 предназначен для вызова следующих методов: scan2,chet2.Также он служит для корректного вывода данных.
	public static void zadanie2()
	{
		System.out.println();
		System.out.println("Задание №2");
		Reader r = new Reader();
		r.scan2();
		int answer = chet2(r.countx2,r.countx3);
		System.out.println("Общее количество очков = " + answer);

	}

	// Метод chet2 предназначен для подсчета общего количества очков, путем сложения 2-x очковых и 3-х очковых
	public static int chet2(int x,int y)
	{
		return x * 2 + y * 3;
	}

	// Метод zadanie3 предназначен для вызова следующих методов: scan3,chet3.Также он служит для корректного вывода данных.
	public static void zadanie3()
	{
		System.out.println();
		System.out.println("Задание №3");
		Reader r = new Reader();
		r.scan3();
		int answer = chet3(r.pobedy,r.ni4iy,r.pobedy);
		System.out.println("Общее количество очков, набранных на данный момент " + answer);

	}

	// Метод chet3 предназначен для расчета количества очков заработанных во время футбольных матчей
	public static int chet3(int pob,int ni4,int por)
	{
		return pob * 3 + ni4 * 1 + por * 0;
	}

	// Метод zadanie4 предназначен для вызова следующих методов: scan4,chet4.Также он служит для корректного вывода данных.
	public static void zadanie4()
	{
		System.out.println();
		System.out.println("Задание №4");
		Reader r = new Reader();
		r.scan4();
		boolean answer = chet4(r.chislo);
		System.out.println("Результат " + answer);
		
	}

	//Метод chet4 предназначен для определения возможности деления числа на пять без остатка
	public static boolean chet4(int chislo)
	{
		    return chislo % 5 == 0;
	}

	// Метод zadanie5 предназначен для вызова следующих методов: scan4,chet5.Также он служит для корректного вывода данных.
	public static void zadanie5()
	{
		System.out.println();
		System.out.println("Задание №5");
		Reader r = new Reader();
		r.scan5();
		boolean answer = chet5(r.a,r.b);
		System.out.println("Результат " + answer);
		
	}

	//Метод chet5 предназначен для определения возможности деления числа и на четыре, и на пять без остатка
	public static boolean chet5(boolean a,boolean b)
	{
			return (a && b);
	}

	// Метод zadanie6 предназначен для вызова следующих методов: scan6,chet6.Также он служит для корректного вывода данных.
	public static void zadanie6()
	{
		System.out.println();
		System.out.println("Задание №6");
		Reader r = new Reader();
		r.scan6();
		int answer = chet6(r.n,r.w,r.h);
		System.out.println("Краски хватит на " + answer + " стен");
		
	}

	// Метод chet6 предназначен для возвращения количества полных стен, которые человек может покрасить
	public static int chet6(int n, int w , int h)
	{
		return n/(w*h);
	}

	// Метод zadanie7 предназначен для вызова следующих методов: scan4,chet7Squaed.Также он служит для корректного вывода данных.
	public static void zadanie7()
	{
		System.out.println();
		System.out.println("Задание №7");
		Reader r = new Reader();
		r.scan4();
		int answer = chet7Squaed(r.chislo);
		System.out.println("Квадрат целого числа равен: " + answer);
		
	}

	// Метод chet7Squaed предназначен для возведения целого числа в квадрат
	public static int chet7Squaed(int b)
	{
		return b * b;
	}

	// Метод zadanie8 предназначен для вызова следующих методов: scan8,chet8.Также он служит для корректного вывода данных.
	public static void zadanie8()
	{
		System.out.println();
		System.out.println("Задание №8");
		Reader r = new Reader();
		r.scan8();
		boolean answer = chet8(r.prob,r.prize,r.pay);
		System.out.println("Результат: " + answer);
	}

	// Метод chet8 предназначен для определения чистой прибыли
	public static boolean chet8(int prob, int prize , int pay)
	{
			return (prob * prize - pay > 0);
	}

	// Метод zadanie9 предназначен для вызова следующих методов: scan9,chet9.Также он служит для корректного вывода данных.
	public static void zadanie9()
	{
		System.out.println();
		System.out.println("Задание №9");
		Reader r = new Reader();
		r.scan9();
		int answer = chet9(r.FPS,r.cmin);
		System.out.println("Количество кадров за указанное время: " + answer);
	}

	// Метод chet9 предназначен для расчета общего количества кадров за указанное время в зависимости от FPS
	public static int chet9(int FPS,int min)
	{
		return FPS * min * 60;
	}

	// Метод zadanie10 предназначен для вызова следующих методов: scan10,chet10.Также он служит для корректного вывода данных.
	public static void zadanie10()
	{
		System.out.println();
		System.out.println("Задание №10");
		Reader r = new Reader();
		r.scan10();
		int answer = chet10(r.chislo10,r.delitel);
		System.out.println("Остаток от деления: " + answer);

	}

	// Метод chet10 предназначен для определения остатка от деления не используя %
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
