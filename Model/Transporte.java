package Model;

/**
 * Representa uma operação de transporte.
 * Classe utilizada para registrar informações sobre um transporte específico.
 * Os atributos foram simplificados para reduzir o volume do código.
 * Recomenda-se adicionar informações adicionais, como data de empréstimo e devolução.
 *
 * @author Willy Oliveira
 * @version 1.1
 * @since 1.0
 */
public class Transporte {
	private String condutor; 
	private int kmInicial;
	private int kmFinal;

	/**
     * Construtor padrão. Cria uma instância vazia de Transporte.
     */
	public Transporte() {
	}

	/**
     * Construtor que recebe o nome do condutor, a quilometragem inicial e final do transporte.
     * @param condutor    o nome do condutor do transporte
     * @param kmInicial   a quilometragem inicial do transporte
     * @param kmFinal     a quilometragem final do transporte
     */
	public Transporte(String condutor, int kmInicial, int kmFinal) {
		this.condutor = condutor;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

	/**
     * Construtor que recebe o nome do condutor e a quilometragem inicial do transporte.
     * A quilometragem final é indefinida.
     * @param condutor    o nome do condutor do transporte
     * @param kmInicial   a quilometragem inicial do transporte
     */
	public Transporte(String condutor, int kmInicial) {
		this.condutor = condutor;
		this.kmInicial = kmInicial;
	}

	/**
     * Retorna o nome do condutor do transporte.
     * @return o nome do condutor
     */
	public String getCondutor() {
		return condutor;
	}

	/**
     * Define o nome do condutor do transporte.
     * @param condutor o nome do condutor
     */
	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}

	/**
     * Retorna a quilometragem inicial do transporte.
     * @return a quilometragem inicial
     */
	public int getKmInicial() {
		return kmInicial;
	}

	/**
     * Define a quilometragem inicial do transporte.
     * @param kmInicial a quilometragem inicial
     */
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	/**
     * Retorna a quilometragem final do transporte.
     * @return a quilometragem final
     */
	public int getKmFinal() {
		return kmFinal;
	}

	/**
     * Define a quilometragem final do transporte.
     * @param kmFinal a quilometragem final
     */
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
}
