/**Faça um programa que utilize a estrutura while para ler 50 números e
 calcule e exiba a média aritmética deles.(Pesquise sobre como realizar entrada de dados)*/

import java.util.Scanner;

public class Ex14
{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int cont = 0;
	    double soma = 0;
	    
	    while(cont < 50){
	        System.out.println("Digite um número: ");
	        int n = scanner.nextInt();
	        soma += n;
	        cont++;
	      
	    }
	    
	    double media = soma/50;
	    System.out.printf("A média = %.2f %n", media);
	    
	    scanner.close();
	
	}
}