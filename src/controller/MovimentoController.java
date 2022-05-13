package controller;

import model.Veiculo;

public abstract class MovimentoController {
	
	public void inicioMovimentacao(Veiculo veiculo) {
		System.out.println("\nVe�culo iniciou a movimenta��o.\n" + veiculo);
	}
	
	public abstract void movimentacaoVeiculo(Veiculo veiculo);
	

}
