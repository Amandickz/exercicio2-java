
import java.util.Scanner;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

public class Exercicio6 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		double valor;
		
		System.out.printf("Digite o valor: ");
		valor = scan.nextDouble();
		
		if(valor >= 0 && valor <= 100) {
			if (valor <= 25) {
				System.out.println("Intervalo [0,25]");
			} else if (valor <= 50) {
				System.out.println("Intervalo (25,50]");
			} else if (valor <= 75) {
				System.out.println("Intervalo (50,75]");
			} else {
				System.out.println("Intervalo (75,100]");
			}
		} else {
			System.out.println("FORA DO INTERVALO");
		}
	
		
	}

}
