package controller;

import model.Motocicleta;
import model.Veiculo;

public class MovimentoMotocicletaController extends MovimentoController {

	@Override
	public void movimentacaoVeiculo(Veiculo veiculo) {
		if(veiculo instanceof Motocicleta) {
			int distancia = (int)((Math.random() * 81) + 20);  // valor aleatório de 20 a 100 (Km)
			System.out.println("\nA motocicleta fará um deslocamento de " + distancia + " Km,");
			
			int valorFrete = (int)((Math.random() * 51) + 30);  // valor aleatório entre 30 e 80 (R$)
			System.out.println("e o valor do frete será de R$ " + valorFrete + ",00.");
		}
	}

}
