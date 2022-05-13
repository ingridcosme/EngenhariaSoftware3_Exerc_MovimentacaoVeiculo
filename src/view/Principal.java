package view;

import controller.MovimentoAutomovelController;
import controller.MovimentoCaminhaoController;
import controller.MovimentoMotocicletaController;
import controller.MovimentoVanController;
import model.Automovel;
import model.Caminhao;
import model.Motocicleta;
import model.Van;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("\n---- Iniciando movimentação Automóvel ----");
		
		Automovel automovel = new Automovel();
		automovel.setAno(2020);
		automovel.setCor("chumbo");
		automovel.setMarca("Nissan");
		automovel.setModelo("Versa");
		automovel.setPlaca("LSN4I49");
		automovel.setPortaQuantidade(5);
		automovel.setVelocidadeMax(185d);
		
		MovimentoAutomovelController automovelCont = new MovimentoAutomovelController();
		automovelCont.inicioMovimentacao(automovel);
		automovelCont.movimentacaoVeiculo(automovel);
		
		System.out.println("\n---- Iniciando movimentação Caminhão ----");
		
		Caminhao caminhao = new Caminhao();
		caminhao.setCargaMax(0);
		caminhao.setCor(null);
		caminhao.setEixoQuantidade(0);
		caminhao.setMarca(null);
		caminhao.setModelo(null);
		caminhao.setPlaca(null);
		caminhao.setVelocidadeMax(0);
		
		MovimentoCaminhaoController caminhaoCont = new MovimentoCaminhaoController();
		caminhaoCont.inicioMovimentacao(caminhao);
		caminhaoCont.movimentacaoVeiculo(caminhao);
		
		System.out.println("\n---- Iniciando movimentação Motocicleta ----");
		
		Motocicleta moto = new Motocicleta();
		moto.setCilindrada(0);
		moto.setCor(null);
		moto.setMarca(null);
		moto.setModelo(null);
		moto.setPlaca(null);
		moto.setVelocidadeMax(0);
		
		MovimentoMotocicletaController motoCont = new MovimentoMotocicletaController();
		motoCont.inicioMovimentacao(moto);
		motoCont.movimentacaoVeiculo(moto);
		
		System.out.println("\n---- Iniciando movimentação Van ----");
		
		Van van = new Van();
		van.setCor(null);
		van.setMarca(null);
		van.setModelo(null);
		van.setPlaca(null);
		van.setVelocidadeMax(0);
		van.setLugaresQuantidade(0);
		
		MovimentoVanController vanCont = new MovimentoVanController();
		vanCont.inicioMovimentacao(van);
		vanCont.movimentacaoVeiculo(van);
		
		
	}

}
