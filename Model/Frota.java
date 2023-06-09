package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class Frota implements Iterable<Veiculo> {
	
	private ArrayList<Veiculo> frota;

	
	public Frota() {
		super();
		frota = new ArrayList<Veiculo>();
	}

	public void adicionar(Veiculo veiculo) {
		frota.add(veiculo);
	}

	@Override
	public Iterator<Veiculo> iterator() {
		return frota.iterator();
	}
	
	// outros métodos, getters, setter etc

	public ArrayList<Veiculo> getFrota() {
		return frota;
	}

	public void setFrota(ArrayList<Veiculo> frota) {
		this.frota = frota;
	}

	public boolean emprestarVeiculo(Integer opcao){
		Veiculo veiculo = frota.get(opcao - 1);
		if(veiculo == null){
			System.out.println("Número para veículo inválido!");//TODO CRIAR EXCEÇÃO
			return false;
		}
		if(veiculo.getEstado().getDescricao().equals("Pátio")){
			veiculo.setEstado(Estado.OPERACAO);
			return true;
		} else {
			return false;
		}
	}

	public void alterarEstado(Integer opcaoVeic, Integer estado){
		Veiculo veiculo = frota.get(opcaoVeic - 1);
		switch(estado){
			case 1:{
				veiculo.setEstado(Estado.PATIO);
				break;
			}
			case 2:{
				veiculo.setEstado(Estado.OPERACAO);
				break;
			}
			case 3:{
				veiculo.setEstado(Estado.OFICINA);
				break;
			}
			case 4:{
				veiculo.setEstado(Estado.PERDATOTAL);
				break;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < frota.size(); i++){
			sb.append(i + 1 + ". ");
			sb.append(frota.get(i).toString()).append("\n");
		}
		return sb.toString();
	}
}


