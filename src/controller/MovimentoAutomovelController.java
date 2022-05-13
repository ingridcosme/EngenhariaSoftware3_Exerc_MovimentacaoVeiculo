package controller;

import model.Automovel;
import model.Veiculo;

public class MovimentoAutomovelController extends MovimentoController {

	@Override
	public void movimentacaoVeiculo(Veiculo veiculo) {
		if(veiculo instanceof Automovel) {
			int segundos = (int)((Math.random() * 21) + 10);  // valor aleat�rio de 10 a 30 segundos
			System.out.println("\nO autom�vel levar� " + segundos + " s para atingir 100 Km/h,");
			
			int distancia = (int)((Math.random() * 601) + 50);  // valor aleat�rio de 50 a 650 Km
			System.out.println("e far� um deslocamento de " + distancia + " Km,");
			
			int passageiros = (int)((Math.random() * 3) + 1);  // n�mero aleat�rio de 1 a 4
			System.out.println("tendo " + passageiros + " passageiros.");
		}
	}

}
