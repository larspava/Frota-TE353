package Model;

public class Caminhao extends Veiculo {
	private int capacidadeCargaKg;
	private boolean vuc; // Veículo Urbano de Carga, até 10 ton

	public Caminhao(String placa, String marca, String modelo, int capacidadeCarga) {
		super(placa, marca, modelo);
		this.capacidadeCargaKg = capacidadeCarga;
		if (capacidadeCarga < 10000)
			this.vuc = true;
		else this.vuc = false;
	}
	
	public boolean isVuc() {
		return vuc;
	}
	
	// fazer getters, setters, toString o que for necessário


	public int getCapacidadeCargaKg() {
		return capacidadeCargaKg;
	}

	public void setCapacidadeCargaKg(int capacidadeCargaKg) {
		this.capacidadeCargaKg = capacidadeCargaKg;
	}

	public void setVuc(boolean vuc) {
		this.vuc = vuc;
	}
}
