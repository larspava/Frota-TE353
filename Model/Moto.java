package Model;

public class Moto extends Veiculo {
	private int cilindrada;
	private boolean bagageiro;

	public Moto(String placa) {
		super(placa);
		cilindrada = 150;
		bagageiro = true;
	}
	
	// outros construtores (sobrecarga), cilindradas por parâmetro, sem bageiro
	
	// getters, setters, toString e o que for necessário

}
