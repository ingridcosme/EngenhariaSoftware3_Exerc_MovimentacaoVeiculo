package model;

public class Caminhao extends Veiculo {
	private int eixoQuantidade;
	private double cargaMax;
	
	public int getEixoQuantidade() {
		return eixoQuantidade;
	}
	
	public void setEixoQuantidade(int eixoQuantidade) {
		this.eixoQuantidade = eixoQuantidade;
	}
	
	public double getCargaMax() {
		return cargaMax;
	}
	
	public void setCargaMax(double cargaMax) {
		this.cargaMax = cargaMax;
	}
	
	@Override
	public String toString() {
		return "Caminhao [eixoQuantidade=" + eixoQuantidade 
				+ ", \ncargaMax=" + cargaMax 
				+ ", \nplaca=" + getPlaca() 
				+ ", \nmarca=" + getMarca() 
				+ ", \nmodelo=" + getModelo() 
				+ ", \ncor=" + getCor() 
				+ ", \nvelocidadeMax=" + getVelocidadeMax() + "]";
	}
	
	

}
