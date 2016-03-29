package br.com.projeto_automato.main;

import java.io.IOException;

import javax.swing.JOptionPane;

public class VendingMachine {

	public static void main(String[] args) throws IOException {

		double valorTotal = 0, valorEntrada = -1;
		char doce;

		while (true) {
			try {
				valorEntrada = Double.parseDouble(
						JOptionPane.showInputDialog("Seja Bem vindo!!" + "\nNotas Aceitas: R$ 5,00,R$ 2,00,R$ 1,00."
								+ "\nDigite 0 para indicar o fim da entrada das notas!" + "\nInsira as notas"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Cédula inválida!");
			}

			if (valorEntrada == 0)
				break;

			if (valorEntrada == 5 || valorEntrada == 2 || valorEntrada == 1) {
				valorTotal += valorEntrada;
			} else {
				JOptionPane.showMessageDialog(null, "Cédula inválida!");
			}
		}

		while (true) {

			String doceEnt = "";

			try {
				if (valorTotal == 6) {
					doceEnt = JOptionPane
							.showInputDialog("Doces disponíveis" + "\nDoce A: R$ 6,00" + "\nEscolha o doce preferido:");

					doce = Character.toUpperCase(doceEnt.charAt(0));

					if (doce == 'A') {
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Opção inválida!");
					}
				}else if(valorTotal <= 7){
					doceEnt = JOptionPane
							.showInputDialog("Doces disponíveis" + "\nDoce A: R$ 6,00" +
					"\nDoce B: R$ 7,00" +"\nEscolha o doce preferido:");

					doce = Character.toUpperCase(doceEnt.charAt(0));

					if (doce == 'A' || doce == 'B') {
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Opção inválida!");
					}
				}else if(valorTotal >= 8){
					doceEnt = JOptionPane
							.showInputDialog("Doces disponíveis" + "\nDoce A: R$ 6,00" + 
									"\nDoce B: R$ 7,00" + "\nDoce C: R$ 8,00" + "\nEscolha o doce preferido:");

					doce = Character.toUpperCase(doceEnt.charAt(0));

					if (doce == 'A' || doce == 'B' || doce == 'C') {
						break;
					} else {
						JOptionPane.showMessageDialog(null, "Opção inválida!");
					}
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}

		}

		switch (doce) {
		case 'A':	
			JOptionPane.showMessageDialog(null, "Doce A escolhido! Troco: R$ " + (valorTotal - 6));
			break;
		case 'B':
			JOptionPane.showMessageDialog(null, "Doce B escolhido! Troco: R$ " + (valorTotal - 7));
			break;
		case 'C':
			JOptionPane.showMessageDialog(null, "Doce C escolhido! Troco: R$ " + (valorTotal - 8));
			break;
		}

	}
}
