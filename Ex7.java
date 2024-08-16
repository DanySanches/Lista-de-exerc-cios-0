/**Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e 
que a variável B passe a possuir o valor da variável A. 
Apresentar os valores trocados.*/
import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o valor de A: ");
		int a = scanner.nextInt();
		System.out.println("O valor de A é: " + a);
		System.out.println("Digite o valor de B: ");
		int b = scanner.nextInt();
		System.out.println("O valor de B é: " + b);
		int c = a;
		a = b;
		b = c;
		System.out.printf("O novo valor de  A e %d e o novo valor de B é %d", a, b );

		scanner.close();

	}
}