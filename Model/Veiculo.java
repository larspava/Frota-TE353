package Model;

import java.util.ArrayList;

/**
 * Representa um veiculo abstrato com seus atributos mínimos.
 * Classe empregada para criar uma frota com diversos tipos de veículos.
 * Classe para ser estendida em subclasses concretas que de fato representam os veículos reais da frota.
 * 
 * @version 1.1
 * @since 1.1
 * @author eberspac
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
	 * @param estado o estado do enum para alterar 
	 */
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public ArrayList<Transporte> getOperacoes() {
		return operacoes;
	}

	public Transporte getTransporte(Integer num) {
		return operacoes.get(num);
	}

	public void addOperacao(Transporte operacao) {
		this.operacoes.add(operacao);
	}

	@Override
	public String toString() {
		return modelo + " " + marca + " de placa " + placa + " - " + estado;
	}
}
