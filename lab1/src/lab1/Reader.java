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
	
	// ����� scan1 ������������ ��� ����� ������ �����(���������� �����) ��� ������� �������
	public void scan1(){
	Scanner scn = new Scanner(System.in);
	System.out.println("������� ���������� �����");
	min = scn.nextInt();
	}

	// ����� scan2 ������������ ��� ����� ���� �����(���������� ���� ������� � ���� �������) ��� ������� �������
	public void scan2(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� 2-� �������");
		countx2 = scn.nextInt();
		System.out.println("������� ���������� 3-� �������");
		countx3 = scn.nextInt();
		}

	// ����� scan3 ������������ ��� ����� ���� �����(���������� �����, ���������� ���������, ���������� ������) ��� �������� �������
	public void scan3(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� �����");
		pobedy = scn.nextInt();
		System.out.println("������� ���������� ������");
		ni4iy = scn.nextInt();
		System.out.println("������� ���������� ���������");
		porazh = scn.nextInt();
		}

	// ����� scan4 ������������ ��� ����� ������ ����� ��� ����������,������,�������� �������
	public void scan4(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����");
		chislo = scn.nextInt();
	}

        public void scan5(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� a(� ���� true ��� false)");
		a = scn.nextBoolean();
                System.out.println("������� b(� ���� true ��� false)");
                b = scn.nextBoolean();
	}

	// ����� scan6 ������������ ��� ����� ���� �����(���������� ���������� ������, ������� ������ ���� ���������;������ �����;������ �����) ��� ������� �������
	public void scan6(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� ���������� ������, ������� �� ������ ���������");
		n = scn.nextInt();
		System.out.println("������� ������ ����� ����� � ������");
		w = scn.nextInt();
		System.out.println("������� ������ ����� ����� � ������");
		h = scn.nextInt();
	}

	// ����� scan8 ������������ ��� ����� ���� �����(prob,prize,pay) ��� �������� �������
	public void scan8(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� prob");
		prob = scn.nextInt();
		System.out.println("������� prize");
		prize = scn.nextInt();
		System.out.println("������� pay");
		pay = scn.nextInt();
	}

	// ����� scan9 ������������ ��� ����� ���� �����(���������� FPS,���������� �����) ��� �������� �������
	public void scan9(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� ���������� FPS");
		FPS = scn.nextInt();
		System.out.println("������� ���������� �����");
		cmin = scn.nextInt();
		}

	// ����� scan10 ������������ ��� ����� ���� �����(����� ��� �������,��������) ��� �������� �������
	public void scan10(){
		Scanner scn = new Scanner(System.in);
		System.out.println("������� �����");
		chislo10 = scn.nextInt();
		System.out.println("������� ��������");
		delitel = scn.nextInt();
		}

}
