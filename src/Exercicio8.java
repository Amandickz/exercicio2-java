
import java.util.Scanner;

/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.*/

public class Exercicio8 {
	
	public void execucao() {
		Scanner scan = new Scanner(System.in);
		
		double renda, total;
		
		System.out.printf("Digite o valor da sua renda: ");
		renda = scan.nextDouble();
		
		total = 0;
		
		if (renda <= 2000) {
			System.out.println("Imposto Isento");
		} else {
			renda -= 2000;
			if (renda <= 1000) {
				total = renda * 0.08;
			} else if (renda <= 2500) {
				total = 1000 * 0.08;
				renda -= 1000;
				total = total + (renda *0.18);
			} else {
				total = 1000 * 0.08;
				renda -= 1000;
				total = total + (1500 * 0.18);
				renda -= 1500;
				total = total + (renda * 0.28);
			}
			System.out.printf("Imposto: R$ %.2f", total);
		}
		
	}

}
