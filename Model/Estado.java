package Model;

public enum Estado {
	// os atributos de um enum são constantes, por isso escritos em MAIUSCULA
	PATIO("Pátio"),
	OPERACAO("Em operação"),
	OFICINA("Oficina"),
	PERDATOTAL("Perda total");
	
	private String descricao;

	// construtor de um enum, se usado, é sempre privado
	private Estado(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
