import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Collections;
public class zadaniyaLab5 {

	public static void main(String[] args)
	{
		//zadaniye1();
		zadaniye2();
		//zadaniye3();
		//zadaniye4();
		//zadaniye5();
		//zadaniye6();
		//zadaniye7();
		//zadaniye8();
		//zadaniye9();
		//zadaniye10();
		
	}

	public static void zadaniye1()
	{
		System.out.println("Задание №1");
		Reader5 r = new Reader5();
		r.scan1();
		System.out.println(chet1(r.str1,r.str2));
	}
	
	public static boolean chet1(String str1,String str2)
	{
		int index = 1;
		int[] numarray = new int[str1.length()];
		int[] numarray1 = new int[str2.length()];
		int[] flaga = new int[str1.length()];
		int[] flaga1 = new int[str2.length()];
		for (int i = 0;i < str1.length();i++)
		{
			if (flaga[i] == 1)
				continue;
			{
				for (int j = 0;j < str1.length();j++)
				{
					if (str1.charAt(i) == str1.charAt(j))
					{
						numarray[j] = index;
						flaga[j] = 1;
					}
				}
				index = index + 1;
			}
		}
		index = 1;
		for (int i = 0;i < str2.length();i++)
		{
			if (flaga1[i] == 1)
				continue;
			{
				for (int j = 0;j < str2.length();j++)
				{
					if (str2.charAt(i) == str2.charAt(j))
					{
						numarray1[j] = index;
						flaga1[j] = 1;
					}
				}
				index = index + 1;
			}
		}
		return Arrays.equals(numarray, numarray1);
	}
	
	public static void zadaniye2()
	{
		System.out.println("");
		System.out.println("Задание №2");
		System.out.println(chet2("H3","E2"));
	}
	
	public static String chet2(String a,String v)
	{
		int startI = Character.digit(a.charAt(1), 10);
        int startJ = a.charAt(0) - 65;
        int endI = Character.digit(v.charAt(1), 10);
        int endJ = v.charAt(0) - 65;
        double[][] web = new double[40][40];
        for (int i = 0; i < 40; i++) {
            for (int j = 0; j < 40; j++){
                web[i][j] = Double.POSITIVE_INFINITY;
            }
        }
        double k = Math.sqrt(Math.sqrt(2) / (1 + Math.sqrt(2))); // a = R*k
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (j < 7) {
                    web[i * 8 + j][i * 8 + j + 1] = i * k;
                    web[i * 8 + j + 1][i * 8 + j] = i * k;
                }
                else{
                    web[i * 8][i * 8 + j] = i * k;
                    web[i * 8 + j][i * 8] = i * k;
                }
                if (i < 4) {
                    web[i * 8 + j][(i + 1) * 8 + j] = 1;
                    web[(i + 1) * 8 + j][i * 8 + j] = 1;
                }
            }
        }
        ArrayList<Integer> res = dijkstra(web, startI * 8 + startJ, endI * 8 + endJ);
        StringBuilder sb = new StringBuilder();
        for (int i = res.size() - 2; i >= 0; i--){
            sb.append((char) (res.get(i) % 8 + 65)).append(res.get(i) / 8).append('-');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString().replaceAll("[A-H]0.+[A-H]0", "A0");
	}
	
	public static ArrayList<Integer> dijkstra(double[][] weights, int start, int end) {
        double[] dist = new double[weights.length];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        dist[start] = 0;
        boolean[] used = new boolean[weights.length];
        Arrays.fill(used, false);
        double min_dist = 0;
        int min_vertex = start;
        int[] p = new int[weights.length + 1];
        p[weights.length] = -1;
        p[start] = weights.length;
        while (min_dist < Double.POSITIVE_INFINITY)
        {
            int i = min_vertex;
            used[i] = true;
            for (int j = 0; j < dist.length; ++j)
                if (dist[i] + weights[i][j] < dist[j]) {
                    dist[j] = dist[i] + weights[i][j];
                    p[j] = i;
                }


            min_dist = Double.POSITIVE_INFINITY;
            for (int j = 0; j < dist.length; ++j)
                if (!used[j] && dist[j] < min_dist)
                {
                    min_dist = dist[j];
                    min_vertex = j;
                }
        }
        ArrayList<Integer> path = new ArrayList<>();
        while (end != -1)
        {
            path.add(end);
            end = p[end];
        }
        return path;
    }
	
	public static void zadaniye3()
	{
		System.out.println("");
		System.out.println("Задание №3");
		Reader5 r = new Reader5();
		r.scan3();
		System.out.println(chet3(r.n));
	}
	public static int chet3(int number)
	{
		if (number < 10)
		{
			return 1;
		}
		else
		{
			return 1 + chet3(number/10);
		}
	}
	
	public static void zadaniye4()
	{
		System.out.println("");
		System.out.println("Задание №4");
		Reader5 r = new Reader5();
		r.scan4();
		System.out.println(chet4(r.str4,r.str1));
	}
	
	
	public static int chet4(String[] words, String finalWord)
	{
		int[] flag = new int[6];
		int[] flagwords = new int[6];
		int answer = 0;
		int sum = 0;
		for (int i = 0; i < words.length;i++)
		{
			for (int j = 0; j < 6;j++)
			{
				for (int z = 0; z < words[i].length();z++)
				{
					if (flagwords[z] == 1)
						continue;
					{
						if (finalWord.charAt(j) == words[i].charAt(z))
						{
							flag[j] = 1;
							flagwords[z] = 1;
						}
					}
				}
			}
			sum = Arrays.stream(flag).sum();
			Arrays.fill(flag, 0);
			Arrays.fill(flagwords, 0);
			if (sum == words[i].length())
			{
				switch(sum)
				{
				case 3:
					answer += 1;
					break;
				case 4:
					answer += 2;
					break;
				case 5:
					answer +=3;
					break;
				case 6:
					answer += 54;
					break;
				default:
					answer += 0;
					break;
				}
			}
		}
		return answer;
	}
	
	public static void zadaniye5()
	{
		System.out.println("");
		System.out.println("Задание №5");
		Reader5 r = new Reader5();
		r.scan5();
		System.out.println(chet5(r.massivNum2));
	}
	
	
	public static int chet5(int[] massiv)
	{
		int max = 0;
		int counter = 2;
		for (int i = 0;i < massiv.length - 2;i++)
		{
			if ((massiv[i+1] - massiv[i]) == (massiv[i+2]- massiv[i + 1]))
				counter = counter + 1;
			else
			{
				counter = 2;
			}
			
			if (counter > max)
				max = counter;
		}
		return max;

	}
	
	public static void zadaniye6()
	{
		System.out.println("");
		System.out.println("Задание №6");
		Reader5 r = new Reader5();
		r.scan6();
		System.out.println(chet6(r.massivNum));
	}
	
	
	public static int chet6(int[] massiv)
	{
		int n = massiv.length;
		int n1 = massiv.length + 1;
		double sum;
		sum = Arrays.stream(massiv).sum();
		return (int)Math.round(Math.abs(n1 * (5 - sum / n) + sum));
	}
	
	public static void zadaniye7()
	{
		System.out.println("");
		System.out.println("Задание №7");
		Reader5 r = new Reader5();
		r.scan7();
		System.out.println(chet7(r.str));
	}
	
	
	public static String chet7(String text)
	{
		int counter = 0;
		String[] strarray = text.split(" ");
		String[] newarray = new String[strarray.length];
		for (int i = 0;i <= strarray.length - 1;i++)
		{
			for (int j = 1;j <= strarray.length;j++)
			{
				String number = String.valueOf(j);
				int key = strarray[i].indexOf(number);
				if (key != -1)
				{   counter += 1;
					newarray[Integer.parseInt(number) - 1] = strarray[i].replace(number, "");
				}
			}
		}
		if (counter == 0)
			return "";
		else
			return String.join(" ",newarray);
	}
	
	public static void zadaniye8()
	{
		System.out.println("");
		System.out.println("Задание №8");
		Reader5 r = new Reader5();
		r.scan8();
		System.out.println(chet8(r.number1,r.number2));
	}
	
	
	public static int chet8(int number1,int number2)
	{
		int count1 = (int)Math.ceil(Math.log10(number1 + 0.5));
		int count2 = (int)Math.ceil(Math.log10(number2 + 0.5));
		int index = -1;
		int result = 0;
		int[] arrayNum1 = new int[count1];
		int[] arrayNum2 = new int[count2];
		for (int i = 0; i < count1;i++)
		{
			arrayNum1[i] = number1 / (int)Math.pow(10, count1 - i - 1); 
			number1 %= (int)Math.pow(10, count1 - i - 1);
		}
		
		for (int i = 0; i < count2;i++)
		{
			arrayNum2[i] = number2 / (int)Math.pow(10, count2 - i - 1); 
			number2 %= (int)Math.pow(10, count2 - i - 1);
		}
		
		for (int i = 0; i < count1;i++)
		{
			for (int j = 0; j < count2;j++)
			{
				if (arrayNum1[i] < arrayNum2[j])
				{
					arrayNum1[i] = arrayNum2[j];
					index = j;
				}
			}
			if (index != -1)
				arrayNum2[index] = -1;
		}
	    
		for (int i = 0;i < count1;i++)
		{
			result = result + arrayNum1[i] * (int) Math.pow(10, count1 - i - 1);
		}
		return result;
	}
	
	public static void zadaniye9()
	{
		System.out.println("");
		System.out.println("Задание №9");
		Reader5 r = new Reader5();
		r.scan9();
		chet9(r.town,r.date,r.town2);
	}

	
	public static void chet9(String townOne,String date,String townTwo)
	{
		date = date.replace(",", "");
		date = date.replace(":", " ");
		String[] dateS = date.split(" ");
		String monthS = dateS[0];
		int hour = Integer.parseInt(dateS[3]);
		int minutes = Integer.parseInt(dateS[4]);
		int dateNum = Integer.parseInt(dateS[1]);
		int year = Integer.parseInt(dateS[2]);
		int monthIndex = 0;
		String[] towns = {"Los Angeles","New York","Caracas","Buenos Aires","London","Rome","Moscow","Tehran","New Delhi","Beijing","Canberra"};
		String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int[] townsTime = {-480,-300,-270,-180,0,60,180,210,330,480,600};
		int indexOne = 0, indexTwo = 0;
		for (int i = 0;i < towns.length;i++)
		{
			if (towns[i].equals(townOne))
				indexOne = i;
			if (towns[i].equals(townTwo))
				indexTwo = i;
		}
		
		for (int i = 0;i < months.length;i++)
		{
			if (monthS.equals(months[i]))
				monthIndex = i;
		}
		
		Calendar calendar = new GregorianCalendar(year, monthIndex , dateNum);
		calendar.set(Calendar.HOUR,hour);
		calendar.set(Calendar.MINUTE,minutes);
		
		calendar.add(Calendar.MINUTE,Math.max(townsTime[indexOne],townsTime[indexTwo]) - Math.min(townsTime[indexOne],townsTime[indexTwo]));
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-M-d HH:mm");
		System.out.println(formater.format(calendar.getTime()));
	}
	
	public static void zadaniye10()
	{
		System.out.println("");
		System.out.println("Задание №10");
		Reader5 r = new Reader5();
		r.scan10();
		System.out.println(chet10(r.number1));
	}
	
	
	public static boolean chet10(int number)
	{
		int i = (int)Math.ceil(Math.log10(number + 0.5));
		int numbercopy = number;
		int ybivNum = 0;
		int vozrNum = 0;
		Integer[] arrayNum = new Integer[i];
		Integer[] arrayNum1 = new Integer[i];
		i -= 1;
		while (numbercopy > 0)
		{
			arrayNum[i] = numbercopy % 10;
			arrayNum1[i] = numbercopy % 10;
			numbercopy = numbercopy / 10;
			i -= 1;
		}
		
		Arrays.sort(arrayNum, Collections.reverseOrder());
		Arrays.sort(arrayNum1);
		for (int j = 0; j <= arrayNum.length - 1;j++)
		{
			ybivNum = ybivNum + arrayNum[j] * (int) Math.pow(10, arrayNum.length - j - 1);
		}
		
		for (int j = 0; j <= arrayNum1.length - 1;j++)
		{
			vozrNum = vozrNum + arrayNum1[j] * (int) Math.pow(10, arrayNum1.length - j - 1);
		}
			if (((arrayNum[0] != 0) && (arrayNum1[0] != 0)) && ((ybivNum < number) || (vozrNum < number)))
				return false;
			else
				return true;
		
	}
	
	
}
