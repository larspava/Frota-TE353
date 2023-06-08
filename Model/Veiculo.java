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
	
	/**
	* Construtor especificando apenas a placa.
	* Considera que o veículo estará disponível do pátio.
	* Cria o arraylist de operaçoes para armazenar os empréstimos deste veículo.
	*/
	public Veiculo(String placa) {
		super();
		this.placa = placa;
		this.estado = Estado.PATIO;
	}

	/**
	 * Retorna a placa do veiculo.
	 * @return a placa
	 */
	public String getPlaca() {
		return placa;
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
	
	
	// precisa desenvolver os métodos
	
	// emprestar, lê os dados de um Transporte (condutor, kmInicial)
	// altera estado para OPERACAO e adiciona este transporte do 
	// ArrayList operacoes
	
	// devolver
	
	// setEstado
	
	// getters
	
	
	// setters
	
	// toString
	
	// o que achar necessário

}
