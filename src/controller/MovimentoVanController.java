package controller;

import model.Van;
import model.Veiculo;

public class MovimentoVanController extends MovimentoController {

	@Override
	public void movimentacaoVeiculo(Veiculo veiculo) {
		if(veiculo instanceof Van) {
			int passageiros = (int)((Math.random() * 10) + 3);  // valor aleatório entre 3 e 12 passageiros
			System.out.println("\nA van tem " + passageiros + " passageiros,");
			
			int paradas = (int)((Math.random() * 10) + 3);  // número aleatório entre 3 e 12 paradas
			System.out.println("e fará " + paradas + " paradas.");
		}
	}

}
