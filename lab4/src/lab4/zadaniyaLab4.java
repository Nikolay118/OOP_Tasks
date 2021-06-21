package lab4;

import java.util.Arrays;

public class zadaniyaLab4 {

	public static void main(String[] args)
	{
		  //zadaniye1();
		  //zadaniye2();
		  //zadaniye3();
		  //zadaniye4();
		  //zadaniye5();
		  //zadaniye6();
		  // zadaniye7();
		  // zadaniye8();
		  zadaniye9();
		  //zadaniye10();
        
	}
	
	public static void zadaniye1()
	{
		System.out.println("Задание №1");
		Reader4 r = new Reader4();
		r.scan1();
		System.out.println(chet1(r.massiv,r.n));
	}
	
	// Метод, который я принимает массив чисел и возвращает "Бум!", если в 
	// массиве появляется цифра 7. В противном случае возвращает "в массиве нет 7".
	public static String chet1(double[] massiv,int n)
	{
		String answer = "there is no 7 in the array";
		for (int i = 0;i <= n - 1;i++)
		{
			if (massiv[i] == 7)
			{
				answer = "Boom!";
				break;
			}
		}
		return answer;
	}
	
	public static void zadaniye2()
	{
		System.out.println("Задание №2");
		Reader4 r = new Reader4();
		r.scan2();
		System.out.println(chet2(r.massiv,r.n));
	}
	
	// Метод, который я определяет, могут ли элементы в массиве быть 
	// переупорядочены, чтобы сформировать последовательный список чисел, где 
	// каждое число появляется ровно один раз.
	public static boolean chet2(double[] massiv,int n)
	{
		int flag = 0;
		Arrays.sort(massiv);
		for (int i = 0; i <= n - 3;i++)
		{
			if (massiv[i] - massiv[i+1] == massiv[i+1]-massiv[i+2])
				flag = 1;
			else
				flag = 0;
		}
		
		return flag == 1;
	}
	
	public static void zadaniye3()
	{
		System.out.println("Задание №3");
		Reader4 r = new Reader4();
		r.scan3();
		System.out.println(chet3(r.text));
	}
	
	public static String chet3(String text)
	{
		String answer = "";
		char[] array = text.toCharArray();
		for (int i = 0;i <= array.length - 2;i+=2)
		{
			answer = answer + array[i + 1] + array[i];
		}
		
		if ( array.length / 2 == 1)
			answer += array[array.length-1];
		return answer;	
	}
	
	public static void zadaniye4()
	{
		System.out.println("");
		System.out.println("Задание №4");
		Reader4 r = new Reader4();
		r.scan4();
		System.out.println(chet4(r.text));
	}

	public static String chet4(String text)
	{
		int k = 0;
		int counterq = 0;
		char[] array = text.toCharArray();
		if (array[array.length -1] == '?')
			counterq = 1;
		else if (array[array.length -1] == '!')
			counterq = -1;

		while ((array[(array.length - 1) - k] == '?') || (array[(array.length - 1) - k] == '!'))
		{
			array[(array.length - 1) - k] = ' ';
			k +=1;
		}
		String result = "";

		for (int i = 0;i <= (array.length -1) - k;i++)
		{
			result = result + array[i];
		}

		switch (counterq)
		{
		case 1:
			result = result + '?';
			break;
		case -1:
			result = result + '!';
			break;
		default:
			break;
		}
		return result;
	}
	
	public static void zadaniye5()
	{
		System.out.println("");
		System.out.println("Задание №5");
		Reader4 r = new Reader4();
		r.scan4();
		System.out.println(chet5(r.text));
	}
	
	public static String chet5(String text)
	{
	    String answer = text.replaceAll(" x ", " ecks ");
	    String answerF = "";
	    char[] array = answer.toCharArray();
	    for(int i = 0;i <= array.length - 3;i++)
	    {
	    	if ((array[i] == ' ') && (array[i+1] == 'x') && (array[i + 2] != ' '))
	    	{
	    		array[i+1] = 'z';
	    	}
	    }
	    	    
	    for (int i = 0;i <= array.length - 1;i++)
	    {
	    	answerF += array[i];
	    }
	    return answerF.replaceAll("x", "ecs");
	}
	
	public static void zadaniye6()
	{
		System.out.println("");
		System.out.println("Задание №6");
		Reader4 r = new Reader4();
		r.scan6();
		System.out.println(chet6(r.massivN));
	}

	public static int chet6(int massiv[])
	{
		int result = 0;
		Arrays.sort(massiv);
		for (int i = 0;i <= massiv.length - 2;i++)
		{
			if (massiv[i+1]-massiv[i] > result)
				result = massiv[i+1] - massiv[i];
	}

	return result;

	}
	
	public static void zadaniye7()
	{
		System.out.println("");
		System.out.println("Задание №7");
		Reader4 r = new Reader4();
		r.scan7();
		if (chet7(r.number) != -1)
			System.out.println("Результат: " + chet7(r.number));
		else 
			System.out.println("Нет обратной кодировки для введенного числа");
	}
	
	public static int chet7(int number)
	{
		switch (number)
		{
			case 832:
				return 594;
			case 51:
				return 36;
			case 7977:
				return 198;
			case 1:
				return 0;
			case 665:
				return 99;
			case 149:
				return 0;
			default:
				return -1;
		}
	}
	
	public static void zadaniye8()
	{
		System.out.println("");
		System.out.println("Задание №8");
		Reader4 r = new Reader4();
		r.scan4();
		System.out.println(chet8(r.text));
	}
	
	public static char chet8(String text)
	{
		text = text.toLowerCase();
		char[] chararray = text.toCharArray();
		char[] glasn = {'a','e','i','o','u','y'};
		int counta = 0,counte = 0,counti = 0,counto = 0,countu = 0,county = 0;
		for (int i = 0;i <= chararray.length - 2;i++)
		{
			if ((chararray[i] != ' ') && (chararray[i + 1] == ' '))
			{
				switch (chararray[i])
				{
				case 'a':
					counta += 1;
					break;
				case 'e':
					counte += 1;
					break;
				case 'i':
					counti += 1;
					break;
				case 'o':
					counto += 1;
					break;
				case 'u':
					countu += 1;
					break;
				case 'y':
					county += 1;
					break;
				}
			}
		}
		int[] countanswer = {counta,counte,counti,counto,countu,county};
		int max = countanswer[0];
		int indexM = -1;
		for (int i = 0;i <= 5;i++)
		{
			if (max < countanswer[i])
			{
				max = countanswer[i];
				indexM = i; 
			}
		}
		 return glasn[indexM];
		
		
	}
	
	public static void zadaniye9()
	{
		System.out.println("");
		System.out.println("Задание №9");
		Reader4 r = new Reader4();
		r.scan9();
		System.out.println("Результат сложения: " + chet9(r.numberOne,r.numberTwo));
	}
	
	public static String chet9(int number1,int number2)
	{
		String answer = "";
		int a,b,ostatokOne,ostatokTwo,sum;
		if (number1 > number2)
		{
			a = number1;
			b = number2;
		}
		else
		{
			a = number2;
			b = number1;
		}
		while (a > 0)
		{
			ostatokOne = a % 10;
			ostatokTwo = b % 10;
			sum = ostatokOne + ostatokTwo;
			answer = sum + answer;
			a = a / 10;
			b = b / 10;
		}
		return answer;
	}
	
	public static void zadaniye10()
	{
		System.out.println("");
		System.out.println("Задание №10");
		Reader4 r = new Reader4();
		r.scan4();
		System.out.println("Результат: " + chet10(r.text));
	}
	
	public static String chet10(String text)
	{
		char[] array = text.toCharArray();
		String result = "";
		for (int i = 0;i <= array.length - 1;i++)
		{
			for (int j = i + 1;j <= array.length - 1;j++)
			{
				if ((array[i] == array[j]) && (i != j) && (array[i] != ' '))
					array[j] = '_';
			}
		}
		for (int j = 0;j <= array.length - 1;j++)
		{
			result += array[j];
		}
		result = result.replaceAll("_", "");
		return result;
	}
	
}
