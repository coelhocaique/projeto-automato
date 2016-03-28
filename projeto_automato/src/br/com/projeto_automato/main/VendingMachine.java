 package br.com.projeto_automato.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VendingMachine {

	public static void main(String[] args) throws IOException {

		System.out.println("Seja Bem vindo!!");
		System.out.println("Notas Aceitas: R$ 5,00,R$ 2,00,R$ 1,00.");
		System.out.println("Digite 0 para indicar o fim da entrada das notas!");
		System.out.println("Insira as notas");
		BufferedReader scanNota = new BufferedReader(new InputStreamReader(System.in));

		double valorTotal = 0, sub = 0, valorEntrada;
		
		
		valorEntrada = Double.parseDouble(scanNota.readLine());
		
		while (valorEntrada != 0) {

			if (valorEntrada == 5 || valorEntrada == 2 || valorEntrada == 1) {

				valorTotal += valorEntrada;
				
				if (valorTotal == 6) {
					System.out.println("Doce A disponivel");
					sub = 6;
				} else if (valorTotal == 7) {
					System.out.println("Doce B disponivel");
					sub = 7;
				} else if (valorTotal >= 8) {
					System.out.println("Doce C disponivel");
					sub = 8;
				} else {
					System.out.println("Nenhum doce Disponível");
				}
			}else{
				System.out.println("Valor inválido!");
			}
			
			valorEntrada = Double.parseDouble(scanNota.readLine());
		}

		System.out.println();

		if (sub == 6) {
			if ((valorTotal - sub) > 0)
				System.out.printf("Doce A escolhido! Troco: R$ %.2f\n",(valorTotal - sub));
			else
				System.out.println("Doce A escolhido sem troco!");
		} else if (sub == 7) {
			if ((valorTotal - sub) > 0)
				System.out.printf("Doce B escolhido! Troco: R$ %.2f\n",(valorTotal - sub));
			else
				System.out.println("Doce B escolhido sem troco!");
		} else if (sub >= 8) {
			if ((valorTotal - sub) > 0)
				System.out.printf("Doce C escolhido! Troco: R$ %.2f\n",(valorTotal - sub));
			else
				System.out.println("Doce C escolhido sem troco!");
		} else {
			if ((valorTotal - sub) > 0)
				System.out.printf("Nenhum doce escolhido! Troco: R$ %.2f\n",(valorTotal - sub));
			else
				System.out.println("Nenhum doce escolhido sem troco!");
		}
	}
}
