package Model;

import java.time.OffsetDateTime;

public class Transporte {
	// condutor deveria ser uma classe, com todos os atributos necessários
	// reduzido aqui para string para reduzir volume
	private String condutor; 
	private int kmInicial;
	private int kmFinal;
	// deveria ter dataEmprestimo, dataDevolucao e demais controles
	// da operação real, simplificado aqui para reduzir volume

	public Transporte() {
	}

	public Transporte(String condutor, int kmInicial, int kmFinal) {
		this.condutor = condutor;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

	public Transporte(String condutor, int kmInicial) {
		this.condutor = condutor;
		this.kmInicial = kmInicial;
	}

	public String getCondutor() {
		return condutor;
	}

	public void setCondutor(String condutor) {
		this.condutor = condutor;
	}

	public int getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}

	public int getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
}
