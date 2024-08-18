/*Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.*/

import java.util.Scanner;

public class Ex8
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o valor de X: ");
		int x = scanner.nextInt();
		if(x % 2 == 0) {
		    System.out.printf("%d é par.", x);
		} else {
	        System.out.printf("%d é impar.", x);
	    	}
		scanner.close();
	}
}
