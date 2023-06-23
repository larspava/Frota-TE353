package Model;

/**
 * Representa um veículo do tipo carro.
 * Esta classe estende a classe abstrata Veiculo, herdando seus atributos e métodos.
 * @author Willy Oliveira
 * @version 1.1
 * @since 1.0
 */
public class Carro extends Veiculo {

    private boolean luxo;
    private int qtdePortas;

    /**
     * Construtor que cria um carro especificando a placa, modelo e marca.
     * Define o carro como não luxuoso (luxo = false) e com 4 portas (qtdePortas = 4).
     * @param placa  a placa do carro
     * @param modelo o modelo do carro
     * @param marca  a marca do carro
     */
    public Carro(String placa, String modelo, String marca) {
        super(placa, modelo, marca);
        this.luxo = false;
        this.qtdePortas = 4;
    }

    /**
     * Construtor que cria um carro especificando a placa, modelo, marca e quantidade de portas.
     * Define o carro como não luxuoso (luxo = false).
     * @param placa       a placa do carro
     * @param modelo      o modelo do carro
     * @param marca       a marca do carro
     * @param qtdePortas  a quantidade de portas do carro
     */
    public Carro(String placa, String modelo, String marca, int qtdePortas) {
        super(placa, modelo, marca);
        this.luxo = false;
        this.qtdePortas = qtdePortas;
    }

    /**
     * Construtor que cria um carro especificando a placa, modelo, marca e se é luxuoso.
     * Define a quantidade de portas como 4.
     * @param placa  a placa do carro
     * @param modelo o modelo do carro
     * @param marca  a marca do carro
     * @param luxo   indica se o carro é luxuoso
     */
    public Carro(String placa, String modelo, String marca, Boolean luxo) {
        super(placa, modelo, marca);
        this.luxo = luxo;
        this.qtdePortas = 4;
    }

    /**
     * Construtor que cria um carro especificando a placa, modelo, marca, quantidade de portas e se é luxuoso.
     * @param placa       a placa do carro
     * @param modelo      o modelo do carro
     * @param marca       a marca do carro
     * @param qtdePortas  a quantidade de portas do carro
     * @param luxo        indica se o carro é luxuoso
     */
    public Carro(String placa, String modelo, String marca, int qtdePortas, Boolean luxo) {
        super(placa, modelo, marca);
        this.luxo = luxo;
        this.qtdePortas = qtdePortas;
    }

    /**
     * Retorna se o carro é luxuoso.
     * @return true se o carro é luxuoso, false caso contrário
     */
    public boolean isLuxo() {
        return luxo;
    }

    /**
     * Define se o carro é luxuoso.
     * @param luxo true se o carro é luxuoso, false caso contrário
     */
    public void setLuxo(boolean luxo) {
        this.luxo = luxo;
    }

    /**
     * Retorna a quantidade de portas do carro.
     * @return a quantidade de portas do carro
     */
    public int getQtdePortas() {
        return qtdePortas;
    }

    /**
     * Define a quantidade de portas do carro.
     * @param qtdePortas a quantidade de portas do carro
     */
    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
}
