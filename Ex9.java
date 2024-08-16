/**Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.*/
public class Ex9{
	public static void main(String[] args) {
	    
	    
		for (int i = 0;  i<= 10; i++){
		 int expoente = 2;
		 int resultado =(int) Math.pow(i, expoente);
		 System.out.printf("%d² =  %d. %n", i, resultado);
		    
		}
	}
}