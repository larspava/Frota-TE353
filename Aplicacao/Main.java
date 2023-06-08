package Aplicacao;

import Model.*;

public class Main {
	private static Frota frota = new Frota();
	
	public static void main(String[] args) {
		
		// base de veiculos hardcoded para facilitar os testes
		Veiculo c1 = new Carro("ABC 1X34");
		Veiculo c2 = new Carro("ABY 7B99", 2);
		Veiculo cam1 = new Caminhao("XYZ 8X66", 8900);
		Veiculo cam2 = new Caminhao("MNO 4Z23", 22000);
		Veiculo moto = new Moto("ERR 0R00");
		
		// adicionando à frota
		frota.adicionar(c1);
		frota.adicionar(c2);
		frota.adicionar(cam1);
		frota.adicionar(cam2);
		frota.adicionar(moto);
		
		// for each foi possivel pois Frota implements iterator
		System.out.println("Composição da frota:");
		for (Veiculo veiculo: frota) {
			System.out.print(veiculo.getClass().getSimpleName() 
					+ " (" + veiculo.getPlaca() + ") - " 
					+ veiculo.getEstado().getDescricao());
			
			// poderia usar instanceof para verificar
			// se algum atributo específico das classes concretas
			// deveria ser exibido ou algo neste sentido
			// exemplo:
			if (veiculo instanceof Caminhao) {
				if (((Caminhao)veiculo).isVuc())
					System.out.println(" (VUC)");
				else System.out.println(" (tranporte pesado)");
			} else System.out.println();
		}
		
		// codigos acima apenas para teste básico das classes projetadas
		
		// menu do sistema deve conter:
		// 0 - sair
		// 1 - cadastrar novo veiculo
		// 2 - emprestar veículo para operação
		// 3 - devolver veículo depois da operação
		// 4 - alterar estado de veículo
		// 5 - listar frota
		// X - alguma função extra opcional (eventual bônus)
		// para tal criar métodos static aqui na main que dialogam
		// com os métodos de Frota, Veiculo etc.
		
		// as classes precisam usar comentários em Javadoc
		// e então gerar o javadoc e mostrar no video
		// ver explicações em: https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
		// e exemplo feito na classe Veiculo
		
		// o sistema deve armazenar a frota (persistir os dados em disco)
		// usando serialização de objetos (tema a ser visto)
	}

}
