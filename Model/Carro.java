package Model;

public class Carro extends Veiculo {
	
	// diversos atributos que tornam carro um veiculo específico
	private boolean luxo;
	private int qtdePortas;

	public Carro(String placa, String modelo, String marca) {
		super(placa, modelo, marca);
		this.luxo = false;
		this.qtdePortas = 4;
	}
	
	public Carro(String placa, String modelo, String marca, int qtdePortas) {
		super(placa, modelo, marca);
		this.luxo = false;
		this.qtdePortas = qtdePortas;
	}

	public Carro(String placa, String modelo, String marca, Boolean luxo) {
		super(placa, modelo, marca);
		this.luxo = luxo;
		this.qtdePortas = 4;
	}

	public Carro(String placa, String modelo, String marca, int qtdePortas, Boolean luxo) {
		super(placa, modelo, marca);
		this.luxo = luxo;
		this.qtdePortas = qtdePortas;
	}
	
	// fazer setLuxo, getters, setters, toString o que for necessário

	public boolean isLuxo() {
		return luxo;
	}

	public void setLuxo(boolean luxo) {
		this.luxo = luxo;
	}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}
}
