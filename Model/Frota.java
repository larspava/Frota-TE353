package Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Representa uma frota de veículos.
 * Esta classe implementa a interface Iterable<Veiculo>, permitindo que a frota seja iterada.
 *
 * @author Willy Oliveira
 * @version 1.1
 * @since 1.0
 */
public class Frota implements Iterable<Veiculo> {

    private ArrayList<Veiculo> frota;

    /**
     * Construtor padrão que cria uma nova instância de Frota.
     * Inicializa a lista de veículos da frota.
     */
    public Frota() {
        super();
        frota = new ArrayList<Veiculo>();
    }

    /**
     * Adiciona um veículo à frota.
     * @param veiculo o veículo a ser adicionado à frota
     */
    public void adicionar(Veiculo veiculo) {
        frota.add(veiculo);
    }

    /**
     * Retorna um iterador para percorrer os veículos da frota.
     * @return um iterador para percorrer os veículos da frota
     */
    @Override
    public Iterator<Veiculo> iterator() {
        return frota.iterator();
    }

    /**
     * Retorna a lista de veículos da frota.
     * @return a lista de veículos da frota
     */
    public ArrayList<Veiculo> getFrota() {
        return frota;
    }

    /**
     * Define a lista de veículos da frota.
     * @param frota a lista de veículos da frota
     */
    public void setFrota(ArrayList<Veiculo> frota) {
        this.frota = frota;
    }

    /**
     * Altera o estado de um veículo da frota com base em uma opção e um estado fornecidos.
	 * 
     * @param opcaoVeic a opção do veículo a ser alterado
     * @param estado    o estado a ser definido para o veículo
     */
    public void alterarEstado(Integer opcaoVeic, Integer estado) {
        Veiculo veiculo = frota.get(opcaoVeic - 1);
        switch (estado) {
            case 1: {
                veiculo.setEstado(Estado.PATIO);
                break;
            }
            case 2: {
                veiculo.setEstado(Estado.OPERACAO);
                break;
            }
            case 3: {
                veiculo.setEstado(Estado.OFICINA);
                break;
            }
            case 4: {
                veiculo.setEstado(Estado.PERDATOTAL);
                break;
            }
        }
    }

    /**
     * Retorna o veículo selecionado com base em uma opção fornecida.
     *
     * @param i a opção do veículo selecionado
     * @return o veículo selecionado
     */
    public Veiculo escolherVeiculo(Integer i) {
        return frota.get(i - 1);
    }

    /**
     * Retorna uma representação em formato de String da frota.
     * @return uma String contendo a representação da frota
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < frota.size(); i++) {
            sb.append(i + 1).append(". ");
            sb.append(frota.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}
