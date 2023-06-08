package Model;

public class Carro extends Veiculo {
	
	// diversos atributos que tornam carro um veiculo específico
	private boolean luxo;
	private int qtdePortas;

	public Carro(String placa) {
		super(placa);
		luxo = false;
		qtdePortas = 4;
	}
	
	public Carro(String placa, int qtdePortas) {
		super(placa);
		luxo = false;
		this.qtdePortas = qtdePortas;
	}
	
	// fazer setLuxo, getters, setters, toString o que for necessário

}
