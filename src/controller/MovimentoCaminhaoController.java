package controller;

import model.Caminhao;
import model.Veiculo;

public class MovimentoCaminhaoController extends MovimentoController {

	@Override
	public void movimentacaoVeiculo(Veiculo veiculo) {
		if(veiculo instanceof Caminhao) {
			int carga = (int)((Math.random() * 2001) + 1000);  // n�mero aleat�rio de 1000 a 3000 Kg
			System.out.println("\nO caminh�o carregar� " + carga + " Kg de carga,");
			
			int distancia = (int)((Math.random() * 2501) + 500);  // valor aleat�rio de 500 a 3000 Km
			System.out.println("far� um deslocamento de " + distancia + " Km,");
			
			int valorFrete = (int)((Math.random() * 3001) + 2000);  // valor aleat�rio entre 2000 e 5000 (R$)
			System.out.println("e o valor do frete ser� de R$ " + valorFrete + ",00.");
		}
	}

}
