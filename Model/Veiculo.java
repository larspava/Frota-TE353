package Model;

import java.util.ArrayList;

/**
 * Representa um veiculo abstrato com seus atributos mínimos.
 * Classe empregada para criar uma frota com diversos tipos de veículos.
 * Classe para ser estendida em subclasses concretas que de fato representam os veículos reais da frota.
 * 
 * @version 1.1
 * @since 1.0
 * @author Willy Oliveira
 */
public abstract class Veiculo {
	protected String placa;
	protected Estado estado;
	protected ArrayList<Transporte> operacoes;
	// poderia incluir marca e modelo, para ampliar os dados dos veículos
	protected String marca;
	protected String modelo;

	/**
	* Construtor especificando apenas a placa.
	* Considera que o veículo estará disponível do pátio.
	* Cria o arraylist de operaçoes para armazenar os empréstimos deste veículo.
	* @param placa  a placa do veículo
    * @param marca  a marca do veículo
    * @param modelo o modelo do veículo
	*/
	public Veiculo(String placa, String marca, String modelo) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.estado = Estado.PATIO;
		this.operacoes = new ArrayList<Transporte>();
	}

	/**
	 * Retorna a placa do veiculo.
	 * @return a placa
	 */
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa){
		this.placa = placa;
	}

	/**
	 * Retorna o enum com o estado do veiculo.
	 * @return o estado do enum do veículo
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Define o estado do veículo.
	 * @param estado o estado do enum para alterar 
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/**
     * Define a marca do veículo.
     * @param marca a marca do veículo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Retorna o modelo do veículo.
     * @return o modelo do veículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo do veículo.
     * @param modelo o modelo do veículo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Retorna a lista de operações de transporte do veículo.
     * @return a lista de operações de transporte
     */
    public ArrayList<Transporte> getOperacoes() {
        return operacoes;
    }

    /**
     * Retorna a operação de transporte com base no número fornecido.
     * @param num o número da operação de transporte
     * @return a operação de transporte correspondente
     */
    public Transporte getTransporte(Integer num) {
        return operacoes.get(num);
    }

    /**
     * Adiciona uma operação de transporte à lista de operações do veículo.
     * @param operacao a operação de transporte a ser adicionada
     */
    public void addOperacao(Transporte operacao) {
        this.operacoes.add(operacao);
    }

    /**
     * Retorna uma representação em formato de string do veículo.
     * @return uma representação em formato de string do veículo
     */
    @Override
    public String toString() {
        return modelo + " " + marca + " de placa " + placa + " - " + estado;
    }
}
