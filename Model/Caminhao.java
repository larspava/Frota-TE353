package Model;

/**
 * Representa um veículo do tipo caminhão.
 * Esta classe estende a classe abstrata Veiculo, herdando seus atributos e métodos.
 * 
 * @author Willy Oliveira
 * @version 1.1
 * @since 1.0
 */
public class Caminhao extends Veiculo {

    private int capacidadeCargaKg;
    private boolean vuc; // Veículo Urbano de Carga, até 10 ton

    /**
     * Construtor que cria um caminhão especificando a placa, marca, modelo e capacidade de carga.
     * Verifica se a capacidade de carga é menor que 10.000 kg para definir se é um VUC (Veículo Urbano de Carga).
     *
     * @param placa            a placa do caminhão
     * @param marca            a marca do caminhão
     * @param modelo           o modelo do caminhão
     * @param capacidadeCarga  a capacidade de carga do caminhão em quilogramas
     */
    public Caminhao(String placa, String marca, String modelo, int capacidadeCarga) {
        super(placa, marca, modelo);
        this.capacidadeCargaKg = capacidadeCarga;
        if (capacidadeCarga < 10000) {
            this.vuc = true;
        } else {
            this.vuc = false;
        }
    }

    /**
     * Verifica se o caminhão é um VUC (Veículo Urbano de Carga).
     * @return true se o caminhão é um VUC, false caso contrário
     */
    public boolean isVuc() {
        return vuc;
    }

    /**
     * Retorna a capacidade de carga do caminhão em quilogramas.
     * @return a capacidade de carga do caminhão em quilogramas
     */
    public int getCapacidadeCargaKg() {
        return capacidadeCargaKg;
    }

    /**
     * Define a capacidade de carga do caminhão em quilogramas.
     * @param capacidadeCargaKg a capacidade de carga do caminhão em quilogramas
     */
    public void setCapacidadeCargaKg(int capacidadeCargaKg) {
        this.capacidadeCargaKg = capacidadeCargaKg;
    }

    /**
     * Define se o caminhão é um VUC (Veículo Urbano de Carga).
     * @param vuc true se o caminhão é um VUC, false caso contrário
     */
    public void setVuc(boolean vuc) {
        this.vuc = vuc;
    }
}
