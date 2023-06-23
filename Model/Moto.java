package Model;

/**
 * Representa uma motocicleta, que é um tipo específico de veículo.
 * Esta classe estende a classe abstrata Veiculo.
 *
 * @author Willy Oliveira
 * @version 1.1
 * @since 1.0
 */
public class Moto extends Veiculo {
    private int cilindrada;
    private boolean bagageiro;

    /**
     * Construtor que cria uma instância de Moto com placa, marca e modelo especificados.
     * @param placa  a placa da motocicleta
     * @param marca  a marca da motocicleta
     * @param modelo o modelo da motocicleta
     */
    public Moto(String placa, String marca, String modelo) {
        super(placa, marca, modelo);
    }

    /**
     * Construtor que cria uma instância de Moto com placa, marca, modelo e cilindrada especificados.
     * O bagageiro é definido como verdadeiro.
     * @param placa      a placa da motocicleta
     * @param marca      a marca da motocicleta
     * @param modelo     o modelo da motocicleta
     * @param cilindrada a cilindrada da motocicleta
     */
    public Moto(String placa, String marca, String modelo, int cilindrada) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.bagageiro = true;
    }

    /**
     * Construtor que cria uma instância de Moto com placa, marca, modelo e bagageiro especificados.
     * A cilindrada é definida como 150.
     * @param placa      a placa da motocicleta
     * @param marca      a marca da motocicleta
     * @param modelo     o modelo da motocicleta
     * @param bagageiro  indica se a motocicleta possui bagageiro ou não
     */
    public Moto(String placa, String marca, String modelo, boolean bagageiro) {
        super(placa, marca, modelo);
        this.cilindrada = 150;
        this.bagageiro = bagageiro;
    }

    /**
     * Construtor que cria uma instância de Moto com placa, marca, modelo, cilindrada e bagageiro especificados.
     * @param placa      a placa da motocicleta
     * @param marca      a marca da motocicleta
     * @param modelo     o modelo da motocicleta
     * @param cilindrada a cilindrada da motocicleta
     * @param bagageiro  indica se a motocicleta possui bagageiro ou não
     */
    public Moto(String placa, String marca, String modelo, int cilindrada, boolean bagageiro) {
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
        this.bagageiro = bagageiro;
    }

    /**
     * Retorna a cilindrada da motocicleta.
     * @return a cilindrada da motocicleta
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * Define a cilindrada da motocicleta.
     * @param cilindrada a cilindrada da motocicleta
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * Verifica se a motocicleta possui bagageiro.
     * @return true se a motocicleta possui bagageiro, false caso contrário
     */
    public boolean isBagageiro() {
        return bagageiro;
    }

    /**
     * Define se a motocicleta possui bagageiro.
     * @param bagageiro true se a motocicleta possui bagageiro, false caso contrário
     */
    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }
}