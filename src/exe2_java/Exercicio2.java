package exe2_java;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

public class Exercicio2 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int num;
		System.out.printf("Digite um número: ");
		num = scan.nextInt();
		
		if((num % 2) == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
	
		
	}

}
