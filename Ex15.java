/**Refaça o programa anterior utilizando a estrutura do while.)*/

import java.util.Scanner;

public class Ex15
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int cont = 0;
	    double soma = 0;
	    
	    do{
	        System.out.println("Digite um número: ");
	        int n = scanner.nextInt();
	        soma += n;
	        cont++;
	    } while(cont < 50);
	    double media = soma/50;
	    System.out.printf("A média = %.2f %n", media);
	    
	    scanner.close();
	
	}
}