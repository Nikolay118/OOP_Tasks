package lab1;
import java.util.Scanner;
public class Reader {
	int min;
	int countx2;
	int countx3;
	int pobedy;
	int ni4iy;
	int porazh;
	int chislo;
	int n;
	int w;
	int h;
	int prob;
	int prize;
	int pay;
	int FPS;
	int cmin;
	int chislo10;
	int delitel;
    boolean a;
    boolean b;
	
	// ћетод scan1 предназначен дл€ ввода одного числа(количество минут) дл€ первого задани€
	public void scan1(){
	Scanner scn = new Scanner(System.in);
	System.out.println("¬ведите количество минут");
	min = scn.nextInt();
	}

	// ћетод scan2 предназначен дл€ ввода двух чисел(количество двух очковых и трех очковых) дл€ второго задани€
	public void scan2(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество 2-х очковых");
		countx2 = scn.nextInt();
		System.out.println("¬ведите количество 3-х очковых");
		countx3 = scn.nextInt();
		}

	// ћетод scan3 предназначен дл€ ввода трех чисел(количество побед, количество поражений, количетсво ничьих) дл€ третьего задани€
	public void scan3(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество побед");
		pobedy = scn.nextInt();
		System.out.println("¬ведите количество ничьих");
		ni4iy = scn.nextInt();
		System.out.println("¬ведите количество поражений");
		porazh = scn.nextInt();
		}

	// ћетод scan4 предназначен дл€ ввода одного числа дл€ четвертого,п€того,седьмого задани€
	public void scan4(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		chislo = scn.nextInt();
	}

        public void scan5(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите a(в виде true или false)");
		a = scn.nextBoolean();
                System.out.println("¬ведите b(в виде true или false)");
                b = scn.nextBoolean();
	}

	// ћетод scan6 предназначен дл€ ввода трех чисел(количество квадратных метров, которые могуть быть закрашены;ширина стены;высота стены) дл€ шестого задани€
	public void scan6(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество квадратных метров, которые вы можете закрасить");
		n = scn.nextInt();
		System.out.println("¬ведите ширину одной стены в метрах");
		w = scn.nextInt();
		System.out.println("¬ведите высоту одной стены в метрах");
		h = scn.nextInt();
	}

	// ћетод scan8 предназначен дл€ ввода трех чисел(prob,prize,pay) дл€ восьмого задани€
	public void scan8(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите prob");
		prob = scn.nextInt();
		System.out.println("¬ведите prize");
		prize = scn.nextInt();
		System.out.println("¬ведите pay");
		pay = scn.nextInt();
	}

	// ћетод scan9 предназначен дл€ ввода двух чисел(количество FPS,количество минут) дл€ дев€того задани€
	public void scan9(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите количество FPS");
		FPS = scn.nextInt();
		System.out.println("¬ведите количество минут");
		cmin = scn.nextInt();
		}

	// ћетод scan10 предназначен дл€ ввода двух чисел(число дл€ делени€,делитель) дл€ дес€того задани€
	public void scan10(){
		Scanner scn = new Scanner(System.in);
		System.out.println("¬ведите число");
		chislo10 = scn.nextInt();
		System.out.println("¬ведите делитель");
		delitel = scn.nextInt();
		}

}
