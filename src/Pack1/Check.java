package Pack1;

import java.util.Scanner;

class Check {
	public static void main(String[] args) {
		Scanner scanInt=new Scanner(System.in);
		System.out.println("Введите числа");
		int a=scanInt.nextInt();
		int b=scanInt.nextInt();
		try{checkValue(a,b);
			}catch(CompareExeption e) {
				e.ThisCompareExeption();
			}
		
		
	}
 
	static void checkValue(int a, int b) throws CompareExeption {
		   if (a==b) throw new CompareExeption();		
			
		   else if(a>b) {
				System.out.println("Первое число больше второго");
				}
			else  {
				System.out.println("Второе число больше первого");
			}
			
	}

}

class CompareExeption extends Exception{
	static void ThisCompareExeption() {
		System.err.println("Нельзя вводить одинаковые числа");
	}
	}
