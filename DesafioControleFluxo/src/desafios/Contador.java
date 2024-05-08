package desafios;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = scanner.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException  exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validando o erro e lançando execeçao
		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException();
		}else {
			int contagem = parametroDois - parametroUm;
			//imprimindo variaveis da contagem
			for (int i=1;i<=contagem;i++) {
				System.out.println(i);
				}
			}
	}
	
}
	