
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

public class Exercicio1 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int num;
		System.out.printf("Digite um número: ");
		num = scan.nextInt();
		
		if(num >= 0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
	
		
	}

}
