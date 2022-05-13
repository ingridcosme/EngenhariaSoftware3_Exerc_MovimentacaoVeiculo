package model;

public class Van extends Veiculo {
	private int lugaresQuantidade;

	public int getLugaresQuantidade() {
		return lugaresQuantidade;
	}

	public void setLugaresQuantidade(int lugaresQuantidade) {
		this.lugaresQuantidade = lugaresQuantidade;
	}

	@Override
	public String toString() {
		return "Van [lugaresQuantidade=" + lugaresQuantidade 
				+ ", \nplaca=" + getPlaca() 
				+ ", \nmarca=" + getMarca() 
				+ ", \nmodelo=" + getModelo() 
				+ ", \ncor=" + getCor() 
				+ ", \nvelocidadeMax=" + getVelocidadeMax() + "]";
	}
	
	

}
