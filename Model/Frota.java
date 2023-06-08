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

}


