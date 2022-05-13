package model;

public class Motocicleta extends Veiculo {
	private int cilindrada;

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motocicleta [cilindrada=" + cilindrada 
				+ ", \nplaca=" + getPlaca() 
				+ ", \nmarca=" + getMarca() 
				+ ", \nmodelo=" + getModelo() 
				+ ", \ncor=" + getCor() 
				+ ", \nvelocidadeMax=" + getVelocidadeMax() + "]";
	}

	
	
}
