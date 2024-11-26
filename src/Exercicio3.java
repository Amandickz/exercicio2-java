
import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.*/

public class Exercicio3 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int a, b;
		System.out.printf("Digite dois números: ");
		a = scan.nextInt();
		b = scan.nextInt();
		
		if(a >= b) {
			if(a % b == 0) {
				System.out.println("SÃO MÚLTIPLOS");
			} else {
				System.out.println("NÃO SÃO MÚLTIPLOS");
			}
		} else {
			if(b % a == 0) {
				System.out.println("SÃO MÚLTIPLOS");
			} else {
				System.out.println("NÃO SÃO MÚLTIPLOS");
			}
		}
	
		
	}

}
