package loop.practice;

import java.util.Scanner;

/**
 * 
 */
public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// System.out.println("[1번 완성]");
		System.out.println("1. method1()");
		System.out.println("2. method2()");
		System.out.println("3. method3()");
		System.out.println("4. method4()");
		System.out.println("5. method5()");
		System.out.println("6. method6()");
		System.out.println("7. method7()");
		System.out.println("7. method7()");
		System.out.println("8. method8()");
		System.out.println("9. method9()");
		System.out.println("10. method10()");
		System.out.println("11. method11()");
		System.out.println("12. method12()");
		System.out.println("13. method13()");
		System.out.println("14. method14()");
		System.out.println("15. method15()");
		System.out.println("16. method16()");

		System.out.print("번호 입력 >> ");
		int input = sc.nextInt();

		switch (input) {
		case 1:
			method1();
			break;

		case 2:
			method2();
			break;

		case 3:
			method3();
			break;

		case 4:
			method4();
			break;

		case 5:
			method5();
			break;

		case 6:
			method6();
			break;

		case 7:
			method7();
			break;

		case 8:
			method8();
			break;

		case 9:
			method9();
			break;

		case 10:
			method10();
			break;

		case 11:
			method11();
			break;

		case 12:
			method12();
			break;

		case 13:
			method13();
			break;

		case 14:
			method14();
			break;

		case 15:
			method15();
			break;

		case 16:
			method16();
			break;
		default:
			System.out.println("1이상의 숫자를 입력해주세요");
		}
	}

	/**
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요. 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 
	 * 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.
	 */

	public void method1() {

		System.out.print("숫자 1개 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
	}

	/**
	 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요. 단, 입력한수는1보다크거나같아야합니다.
	 */

	public void method2() {

		System.out.print("숫자 1개 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	/**
	 * 1부터 사용자에게 입력받은 수까지의 정수들의 합을 for 문을 이용하여 출력하세요.
	 */
	public void method3() {

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;

			System.out.print(i);
			if (i == num)
				System.out.print(" = ");
			else
				System.out.print(" + ");
		}

		System.out.println(sum);

	}

	/**
	 * 사용자로 부터 두개의 값을 입력 받아 그사이의 숫자를 모두 출력하세요. 만일1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를
	 * 출력하세요.
	 */
	public void method4() {

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");

		if (num1 <= num2) {
			for (int i = num1; i <= num2; i++) {
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

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d x %2d = %2d\n", dan, i, dan * i);
		}
	}

	/**
	 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요. 단, 2~9를 사이가 아닌수를 입력하면 “2~9 사이 숫자만 입력해주세요”를
	 * 출력하세요.
	 */
	public void method6() {
		System.out.print("시작 단 : ");
		int start = sc.nextInt();

		if (start < 1 || start >= 10)
			System.out.println("2~9 사이 숫자만 입력해주세요");

		if (start <= 9 && start >= 2) {
			for (int dan = start; dan <= 9; dan++) {
				System.out.printf("\n[%d단]\n", dan);

				// 구구단 출력
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%2d x %2d = %2d\n", dan, i, dan * i);
				}
			}

		}
	}

	/**
	 * 정수입력: 4
	 *
	 **
	 ***
	 ****
	 */
	public void method7() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}

	/**
	 * 정수입력: 4
	 ****
	 ***
	 **
	 *
	 */
	public void method8() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}

	/**
	 * 정수입력: 4
	 *
	 **
	 ***
	 ****
	 */
	public void method9() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");

			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}

	/**
	 * 정수입력: 3
	 *
	 **
	 ***
	 **
	 *
	 */
	public void method10() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		for (int i = 0; i < num - 1; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}

	/**
	 * 정수입력: 4
	 *
	 ***
	 *****
	 *******
	 */
	public void method11() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");

			for (int j = 0; j < i * 2 + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}

	/**
	 * 정수입력: 5
	 *****
	 * * * *
	 *****
	 * 
	 */
	public void method12() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				if (row == 0 || row == num - 1 || col == 0 || col == num - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		sc.close();
	}

	/**
	 * 1부터 사용자에게 입력 받은 수 중에서 1) 2와3의 배수를 모두 출력하고 2) 2와3의 공배수의 개수를 출력하세요.
	 * 
	 * ‘공배수’는둘이상의수의공통인배수라는뜻으로어떤수를해당수들로나눴을때 모두나머지가0이나오는수
	 * 
	 * 자연수하나를입력하세요: 15 2 3 4 6 8 9 10 12 14 15 count : 2
	 */
	public void method13() {
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;

		for (int i = 0; i < num; i++) {
			if ((i + 1) % 2 == 0 || (i + 1) % 3 == 0) {
				System.out.print(i + 1 + " ");
				if ((i + 1) % (2 * 3) == 0)
					count++;
			}
		}
		System.out.println("\ncount : " + count);

		sc.close();
	}

	/**
	 * 사용자로부터 입력받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요. 단, 입력한 수가 2보다 작은 경우 “잘못입력하셨습니다.”를
	 * 출력하세요.
	 * 
	 * ‘소수’는 n을 1부터 n까지로 나누었을때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다. ex) 2, 3, 5, 7, 11 …
	 * 
	 * 숫자: 5 소수입니다. 숫자: 9 소수가 아닙니다. 숫자: 0 잘못 입력하셨습니다.
	 */
	public void method14() {
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		boolean isPrime = true;

		if (num < 2) {
			System.out.print("잘못입력하셨습니다. ");
			return;
		}

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}

		System.out.printf(isPrime ? "소수입니다." : "소수가 아닙니다.");
	}

	/**
	 * 위 문제와 모든것이 동일하나, 입력한 수가 2보다 작은 경우
       “잘못입력하셨습니다.”를 출력하면서 다시 사용자가 값을 입력하도록 하세요.
       
     * ‘소수’는 n을 1부터 n까지로 나누었을때 나누어 떨어지는 수가 1과 n뿐인 수를 말한다.
 		ex) 2, 3, 5, 7, 11 … 
 		
 	 * 숫자: 5  소수입니다.
	   숫자: 9  소수가 아닙니다.
	   숫자: 0  잘못 입력하셨습니다. 
	   숫자: 13 소수입니다.
	 */
	public void method15() {
		int num;
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 2) {
				System.out.println("잘못입력하셨습니다. ");
				continue;
			}
			break;
		}
		boolean isPrime = true; 
		
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				isPrime = false;
				break;
			}
		}
	
		
		
		System.out.printf(isPrime ? "소수입니다." : "소수가 아닙니다.");
		
	}

	/**
	 * 2부터 사용자가 입력한 수까지의 소수를 모두 출력하고 소수의 개수를 출력하세요. 단, 입력한 수가 2보다 작은경우 “잘못입력하셨습니다.”를
	 * 출력하세요.
	 * 
	 * 숫자: 11 2 3 5 7 11 2부터 11까지 소수의 개수는 5개입니다.
	 */
	public void method16() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		int count = 0; // 소수를 개수를 세기 위한 변수

		// 2부터 입력 받은 수 까지 1개씩 접근하는 for문
		for (int i = 2; i <= num; i++) {
			boolean flag = true; // 깃발(신호 용도)

			// 1과 자기자신(num)을 뺀 정수를 한 개씩 접근(x)
			for (int x = 2; x < i; x++) {

				if (i % x == 0) { // 1, 자기자신 빼고 나누어 떨어지는 수 존재
					flag = false;
					break;
				}
			}

			if (flag) {
				System.out.print(i + " ");
				count++;
			}

		}

	}

}
