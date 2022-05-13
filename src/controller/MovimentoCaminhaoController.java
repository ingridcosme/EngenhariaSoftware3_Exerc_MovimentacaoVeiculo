package controller;

import model.Caminhao;
import model.Veiculo;

public class MovimentoCaminhaoController extends MovimentoController {

	@Override
	public void movimentacaoVeiculo(Veiculo veiculo) {
		if(veiculo instanceof Caminhao) {
			int carga = (int)((Math.random() * 2001) + 1000);  // número aleatório de 1000 a 3000 Kg
			System.out.println("\nO caminhão carregará " + carga + " Kg de carga,");
			
			int distancia = (int)((Math.random() * 2501) + 500);  // valor aleatório de 500 a 3000 Km
			System.out.println("fará um deslocamento de " + distancia + " Km,");
			
			int valorFrete = (int)((Math.random() * 3001) + 2000);  // valor aleatório entre 2000 e 5000 (R$)
			System.out.println("e o valor do frete será de R$ " + valorFrete + ",00.");
		}
	}

}
