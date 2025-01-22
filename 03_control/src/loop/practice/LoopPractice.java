package loop.practice;

import java.util.Scanner;

/**
 * 
 */
public class LoopPractice {

	
	Scanner sc =new Scanner(System.in);
	
	public void practice1() {
		// System.out.println("[1번 완성]");
		System.out.println("1. method1()");
		System.out.println("2. method2()");
		System.out.println("3. method3()");
		System.out.println("4. method4()");
		System.out.println("5. method5()");
		System.out.println("6. method6()");
		
		System.out.print("번호 입력 >> ");
		int input = sc.nextInt();
		
		switch(input) {
		case 1 : method1(); break; 
		
		case 2 : method2(); break; 
		
		case 3 : method3(); break;
		
		case 4 : method4(); break; 
		
		case 5 : method5(); break;
		
		case 6 : method6(); break; 
		default : System.out.println("1이상의 숫자를 입력해주세요");
		}
	}
	
	/**
	 * 사용자로부터 한 개의 값을 입력 받아
	 * 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	  단, 입력한 수는 1보다 크거나 같아야 합니다.
	 
	  만일 1 미만의 숫자가 입력됐다면
	  "1 이상의 숫자를 입력해주세요"를 출력하세요. 
	 */
	
	public void method1() {
		
		System.out.print("숫자 1개 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1 ; i<=num ; i++) {
			System.out.print(i + " ");
		}
	}
	/**
	 * 사용자로부터 한 개의 값을 입력 받아
	 * 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
      단, 입력한수는1보다크거나같아야합니다.
	 */
	
	public void method2() {
		
		System.out.print("숫자 1개 입력 : ");
		int num = sc.nextInt();
		
		for(int i=num ; i>=1 ; i--) {
			System.out.print(i + " ");
		}
	}
	
	/**
	 *  1부터 사용자에게 입력받은 수까지의 정수들의 합을 for 문을 이용하여 출력하세요.
	 */
	public void method3() {
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1 ; i<=num ; i++) {
				sum += i;
				
			System.out.print(i);
			if (i == num) System.out.print(" = ");
			else System.out.print(" + ");
		}
		
		System.out.println(sum);
	
	}
	
	/**
	 * 사용자로 부터 두개의 값을 입력 받아 그사이의 숫자를 모두 출력하세요.
      만일1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	 */
	public void method4() {
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if (num1 < 1 || num2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		
		if(num1 <= num2) {
			for(int i=num1 ; i<=num2 ; i++) {
				System.out.print(i + " ");
			}
		}
	}
	
	/**
	 * 사용자로부터 입력 받은 숫자의 단을 출력하세요.
	 */
	public void method5() {
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		for(int i=1 ; i<=9 ; i++) {
			System.out.printf("%2d x %2d = %2d\n",dan, i, dan*i);
		}
	}
	
	/**
	 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
      단, 2~9를 사이가 아닌수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
	 */
	public void method6() {
		System.out.print("시작 단 : ");
		int start = sc.nextInt();
		
		if (start < 1 || start >= 10)
			System.out.println("2~9 사이 숫자만 입력해주세요");
		
		if(start <=9 && start >= 2) {
		for(int dan = start ; dan <= 9 ; dan++) {
			System.out.printf("\n[%d단]\n", dan);
			
			// 구구단 출력
			for(int i=1 ; i<=9 ; i++) {
				System.out.printf("%2d x %2d = %2d\n",dan, i, dan*i);
			}
		}
		
	  }
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

