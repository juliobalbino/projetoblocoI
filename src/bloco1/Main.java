package bloco1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		Scanner sc = new Scanner(System.in);


		System.out.println("******************************************************************************************************");
		System.out.println("Jogo de perguntas e respostas!!");

		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o nome da sua intituição de ensino: ");
		String nomeInstituicao = sc.nextLine();
		System.out.print("Você é aluno ou professor? ");
		String alunoProfessor = sc.nextLine();


		if (alunoProfessor.equals("aluno")){

			System.out.print("Você está no ensino médio ou fundamental? ");
			String escolaridade = sc.nextLine();
			System.out.print("Qual a sua idade? ");
			int idade = sc.nextInt();

			Aluno aluno1 = new Aluno(nome,nomeInstituicao,escolaridade,idade);
			

			System.out.println("******************************************************************************************************");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.print("Escolha a matéria: ");
		}
	}
}
