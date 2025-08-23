package aula_08_16;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		{

			int avaliacao;

			System.out.println("Informe, por favor, o número de avaliações previstas para o semestre (entre 1 e 10):");
			avaliacao = sc.nextInt();

			String semestre1 = "Primeiro semestre";
			String semestre2 = "Segundo  semestre";

			System.out.printf("Digite '1' para %s ou '2' para %s:%n", semestre1, semestre2);
			int escolha = sc.nextInt();

			while (true) {
				System.out.printf("Digite '1' para %s ou '2' para %s:%n", semestre1, semestre2);
				escolha = sc.nextInt();
				if (escolha == 1) {
					System.out.printf("Você Selecionou: %s", semestre1);
					break;
				} else if (escolha == 2) {
					System.out.printf("Você Selecionou: %s", semestre2);
					break;
				} else {
					System.out.printf("Erro: Por favor selecione um Semestre:%n%n");

				}
			}
			
			float a = 2.5, b = 2.5, c = 2.5, d = 2.5, e = 2.5;
			
			System.out.println("Digite o peso da Avaliação: ");
			avaliações = sc.nextInt();
		}		
	}
}
