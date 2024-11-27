
import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas*/

public class Exercicio4 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int inicio, fim, duracao;
		System.out.printf("Digite o início e o fim do jogo: ");
		inicio = scan.nextInt();
		fim = scan.nextInt();
		
		duracao = 0;

		
		if (inicio == fim) {
			System.out.println("O JOGO DUROU 24 HORAS");
		} else if (inicio == 0 && fim == 24) {
			System.out.println("O JOGO DUROU 24 HORAS");
		} else if (inicio > fim) { // condição para virada de dia
			duracao = 24 - inicio;
			duracao = duracao + fim;
			System.out.printf("\nO JOGO DUROU %d HORAS", duracao);
		} else {
			duracao = fim - inicio;
			System.out.printf("\nO JOGO DUROU %d HORAS", duracao);
		}
	
		
	}

}
