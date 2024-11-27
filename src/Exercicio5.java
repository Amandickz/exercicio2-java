
import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

public class Exercicio5 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
	
		int cod, qtde;
		double total;
		
		System.out.println("--------------------------------------");
		System.out.println("| CÓDIGO |  ESPECIFICAÇÃO  |  VALOR  |");
		System.out.println("|    1   | Cachorro Quente | R$ 4,00 |");
		System.out.println("|    2   |    X- Salada    | R$ 4,50 |");
		System.out.println("|    3   |    X- Bacon     | R$ 5,00 |");
		System.out.println("|    4   | Torrada Simples | R$ 2,00 |");
		System.out.println("|    5   |  Refrigerante   | R$ 1,50 |");
		System.out.println("--------------------------------------\n");
		
		System.out.printf("Digite o código do item e a quantidade: ");
		cod = scan.nextInt();
		qtde = scan.nextInt();
		
		total = 0;
		
		if (cod == 1) {
			total = qtde * 4;
			System.out.printf("\nTOTAL: R$ %.2f", total);
		} else if (cod == 2) {
			total = qtde * 4.5;
			System.out.printf("\nTOTAL: R$ %.2f", total);
		} else if (cod == 3) {
			total = qtde * 5;
			System.out.printf("\nTOTAL: R$ %.2f", total);
		} else if (cod == 4) {
			total = qtde * 2;
			System.out.printf("\nTOTAL: R$ %.2f", total);
		} else if (cod == 5) {
			total = qtde * 1.5;
			System.out.printf("\nTOTAL: R$ %.2f", total);
		} else {
			System.out.println("Código não localizado!");
		}
	
		
	}

}
