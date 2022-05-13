package model;

public class Automovel extends Veiculo {
	private int portaQuantidade;
	private int ano;
	
	public int getPortaQuantidade() {
		return portaQuantidade;
	}
	
	public void setPortaQuantidade(int portaQuantidade) {
		this.portaQuantidade = portaQuantidade;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Automovel [portaQuantidade=" + portaQuantidade 
				+ ", \nano=" + ano 
				+ ", \nplaca=" + getPlaca() 
				+ ", \nmarca=" + getMarca() 
				+ ", \nmodelo=" + getModelo() 
				+ ", \ncor=" + getCor() 
				+ ", \nvelocidadeMax=" + getVelocidadeMax() + "]";
	}
	
	

}
