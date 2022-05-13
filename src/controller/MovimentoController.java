package controller;

import model.Veiculo;

public abstract class MovimentoController {
	
	public void inicioMovimentacao(Veiculo veiculo) {
		System.out.println("\nVeículo iniciou a movimentação.\n" + veiculo);
	}
	
	public abstract void movimentacaoVeiculo(Veiculo veiculo);
	

}
