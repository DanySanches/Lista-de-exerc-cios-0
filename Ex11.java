/**11. Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:

001 ? Parafuso;
002 ? Porca;
003 ? Prego;

Para qualquer outro código: XXX ? Diversos.
*/

import java.util.Scanner;

public class Ex11{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Digite o código do produto: ");
	    int a = scanner.nextInt();
	    if(a == 001){
	       System.out.printf("%d Parafuso", a);
	    } else if (a == 002){
	        System.out.printf("%d Porca", a);
	    } else if (a == 003){
	        System.out.printf("%d Prego", a);
	    } else {
	        System.out.printf("%d Diversos", a);
	    }
	    
	    scanner.close();

	}
}