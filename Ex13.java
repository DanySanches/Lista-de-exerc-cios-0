/** Escreva uma classe que imprima todas as possibilidades de que no lançamento
de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.*/

public class Ex13
{
	public static void main(String[] args) {
		for (int d1 = 1; d1 <= 6; d1++){
		    for(int d2 = 1; d2 <= 6; d2 ++){
		        if(d1 + d2 ==7){
		            System.out.printf("Dado 1 = %d e Dado 2 = %d %n" , d1 , d2);
		        }      
		    }
		}
	}
}