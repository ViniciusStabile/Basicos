package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para a sequencia fibonacci");
		int num = sc.nextInt();
		List<Integer> fib = new ArrayList<Integer>();

		int i = 0;
		while (true) {
			int f = fibonacci(i);
			if (f > num) {
				break;
			}
			fib.add(f);
			i++;
		}
		if (fib.contains(num)) {
			System.out.printf("O número %d pertence à sequência de Fibonacci.", num);
		} else {
			System.out.printf("O número %d não pertence à sequência de Fibonacci.", num);
		}
		sc.close();
	}

	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}

	}
}
