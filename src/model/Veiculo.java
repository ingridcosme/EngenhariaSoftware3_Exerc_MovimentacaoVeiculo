package model;

public class Veiculo {
	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private double velocidadeMax;
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public double getVelocidadeMax() {
		return velocidadeMax;
	}
	
	public void setVelocidadeMax(double velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa 
				+ ", \nmarca=" + marca 
				+ ", \nmodelo=" + modelo 
				+ ", \ncor=" + cor
				+ ", \nvelocidadeMax=" + velocidadeMax + "]";
	}
	
	

}
