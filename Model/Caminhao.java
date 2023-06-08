package Model;

public class Caminhao extends Veiculo {
	private int capacidadeCargaKg;
	private boolean vuc; // Veículo Urbano de Carga, até 10 ton

	public Caminhao(String placa, int capacidadeCarga) {
		super(placa);
		this.capacidadeCargaKg = capacidadeCarga;
		if (capacidadeCarga < 10000) 
			vuc = true;
		else vuc = false;
	}
	
	public boolean isVuc() {
		return vuc;
	}
	
	// fazer getters, setters, toString o que for necessário


}
