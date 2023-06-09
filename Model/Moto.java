package Model;

public class Moto extends Veiculo {
	private int cilindrada;
	private boolean bagageiro;

	public Moto(String placa, String marca, String modelo) {
		super(placa, marca, modelo);
	}

	public Moto(String placa, String marca, String modelo, int cilindrada){
		super(placa, marca, modelo);
		this.cilindrada = cilindrada;
		this.bagageiro = true;
	}

	public Moto(String placa, String marca, String modelo, Boolean bagageiro){
		super(placa, marca, modelo);
		this.cilindrada = 150;
		this.bagageiro = bagageiro;
	}

	public Moto(String placa, String marca, String modelo, Integer cilindrada, Boolean bagageiro){
		super(placa, marca, modelo);
		this.cilindrada = cilindrada;
		this.bagageiro = bagageiro;
	}
	
	// outros construtores (sobrecarga), cilindradas por parâmetro, sem bageiro
	
	// getters, setters, toString e o que for necessário


	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public boolean isBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(boolean bagageiro) {
		this.bagageiro = bagageiro;
	}

}
