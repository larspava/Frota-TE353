package Model;

/**
 * Enumeração que representa os possíveis estados de um veículo.
 *
 * @author Willy Oliveira
 * @version 1.0
 * @since 1.0
 */
public enum Estado {
    /**
     * Estado de veículo no pátio.
     */
    PATIO("Pátio"),

    /**
     * Estado de veículo em operação.
     */
    OPERACAO("Em operação"),

    /**
     * Estado de veículo na oficina.
     */
    OFICINA("Oficina"),

    /**
     * Estado de veículo com perda total.
     */
    PERDATOTAL("Perda total");

    private String descricao;

    /**
     * Construtor privado para o enum Estado.
     * @param descricao a descrição do estado
     */
    private Estado(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a descrição do estado.
     * @return a descrição do estado
     */
    public String getDescricao() {
        return descricao;
    }
}
