
import java.util.Scanner;

/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.”.*/

public class Exercicio7 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		double x, y;
		
		System.out.printf("Digite o valor de x e y: ");
		x = scan.nextDouble();
		y = scan.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else {
			if (x == 0) {
				System.out.println("Eixo X ");
			}
			
			if (y == 0) {
				System.out.println("Eixo Y ");
			}
			
			if (x >= 0 && y >= 0) {
				System.out.println("Q1");
			} else if (x <= 0 && y >= 0) {
				System.out.println("Q2");
			} else if (x <= 0 && y <= 0) {
				System.out.println("Q3");
			} else if (x >= 0 && y <= 0) {
				System.out.println("Q4");
			} else {
			}
		} 
		
	}

}
