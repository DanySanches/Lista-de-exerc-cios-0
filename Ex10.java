/**10. Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha 
o valor de 6, a segunda o valor 4 e a terceira receba o valor da divisão da
primeira pela segunda. Exiba o valor da terceira variável. Faça uma análise do
resultado.
*/



public class Ex10{
	public static void main(String[] args) {
	    int a = 6;
        int b = 4;
        int c = a/b;
		System.out.println(c);
	}
}

/**Para mostrar o resultado correto, a variável C teria que ser um float ou double,
porém como  queremos int a parte decimal é descartada mostrando apenas o nº inteiro 1 e não 1.5.*/