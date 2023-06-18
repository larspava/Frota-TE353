package Aplicacao;

import Model.*;

import java.util.Scanner;

public class Main {
	private static Frota frota = new Frota();
	//scanner
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int opcao;
		
		// base de veiculos hardcoded para facilitar os testes
		Veiculo c1 = new Carro("PQR 1234", "Corolla", "Toyota");
		Veiculo c2 = new Carro("ABY 7B99","Golf", "Volkswagen", 2);
		Veiculo cam1 = new Caminhao("XYZ 8X66", "Volvo", "FH 540",8900);
		Veiculo cam2 = new Caminhao("MNO 4Z23", "Scania", "R450", 22000);
		Veiculo moto = new Moto("ERR 0R00", "Honda", "CB 500");
		
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
		do{
			System.out.println("\n   -- MENU --\n");
			System.out.println("0 - sair");
			System.out.println("1 - cadastrar novo veiculo");
			System.out.println("2 - emprestar veículo para operação");
			System.out.println("3 - devolver veículo depois da operação");
			System.out.println("4 - alterar estado de veículo");
			System.out.println("5 - listar frota");

			System.out.print("\n   Qual sua opcao? ");
			opcao = teclado.nextInt(); // ler um inteiro do teclado
			teclado.nextLine(); // somente para consumir o Enter

			switch(opcao){
				case 1: {
					System.out.println("Cadastrando novo veículo ...");
					createVehicle();
					break;
				}
				case 2: {
					emprestarVeiculo();
					break;
				}
				case 3: {
					devolverVeiculo();
					break;
				}
				case 4: {
					alterarEstado();
					break;
				}
				case 5: {
					System.out.println("Frota: ");
					System.out.println(frota.toString());
					break;
				}
			}
		} while (opcao != 0);
			teclado.close();
		}
		// menu do sistema deve conter:
		// X - alguma função extra opcional (eventual bônus)
		// para tal criar métodos static aqui na main que dialogam
		// com os métodos de Frota, Veiculo etc.
		
		// as classes precisam usar comentários em Javadoc
		// e então gerar o javadoc e mostrar no video
		// ver explicações em: https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
		// e exemplo feito na classe Veiculo
		
		// o sistema deve armazenar a frota (persistir os dados em disco)
		// usando serialização de objetos (tema a ser visto)

	public static void createVehicle(){
		String placa, marca, modelo, tipo;
		System.out.print("Digite a PLACA do novo veículo: ");
		placa = teclado.nextLine();
		System.out.print("Digite a MARCA do novo veículo: ");
		marca = teclado.nextLine();
		System.out.print("Digite o MODELO do novo veículo: ");
		modelo = teclado.nextLine();
		System.out.print("Digite o TIPO do novo veículo (digite \"carro\", \"moto\" ou \"caminhão\"): ");
		tipo = teclado.nextLine();

		if(tipo.equalsIgnoreCase("CARRO")){
			Carro novoCarro;
			int portas = 0;
			String temLuxo;
			System.out.print("Digite o número de portas do novo carro: ");
			portas = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe se o carro é de luxo (digite sim ou não): ");
			temLuxo = teclado.nextLine();
			if(temLuxo.equalsIgnoreCase("SIM")){
				if(portas > 0 && portas < 5){
					novoCarro = new Carro(placa, marca, modelo, portas, true);
				} else {
					novoCarro = new Carro(placa, marca, modelo, true);
				}
			} else {
				if(portas > 0 && portas < 5){
					novoCarro = new Carro(placa, marca, modelo, portas);
				} else {
					novoCarro = new Carro(placa, marca, modelo);
				}
			}
			System.out.println("Carro criado!");
			frota.adicionar(novoCarro);
		} else if (tipo.equalsIgnoreCase("MOTO")) {
			Moto novaMoto;
			int cilindradas = 0;
			String temBagageiro;
			System.out.print("Digite o número de cilindradas da nova moto: ");
			cilindradas = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Informe se a moto possui bagageiro (digite sim ou não): ");
			temBagageiro = teclado.nextLine();
			if(temBagageiro.equalsIgnoreCase("SIM")){
				novaMoto = new Moto(placa, marca, modelo, cilindradas, true);
			} else {
				novaMoto = new Moto(placa, marca, modelo, cilindradas, false);
			}
			System.out.println("Moto criada!");
			frota.adicionar(novaMoto);
		} else if (tipo.equalsIgnoreCase("CAMINHÃO") || tipo.equalsIgnoreCase("CAMINHAO")){
			Caminhao novoCaminhao;
			int capacidade = 0;
			System.out.print("Digite a capacidade do novo caminhão: ");
			capacidade = teclado.nextInt();
			teclado.nextLine();
			novoCaminhao = new Caminhao(placa, marca, modelo, capacidade);
			System.out.println("Caminhão criado!");
			frota.adicionar(novoCaminhao);
		} else {
			System.out.println("Tipo de veículo invalido!");
		}
	}

	public static void alterarEstado(){
		Integer num_veiculo, estado;
		System.out.println(frota.toString());
		System.out.print("Digite o número do veículo que deseja alterar o estado: ");
		num_veiculo = teclado.nextInt();
		teclado.nextLine();

		System.out.println("Escolha o estado para o véiculo: ");
		System.out.println("1. Pátio");
		System.out.println("2. Em operação");
		System.out.println("3. Oficina");
		System.out.println("4. Perda total");
		System.out.print("Escolha um número para o estado do veículo escolhido: ");
		estado = teclado.nextInt();
		frota.alterarEstado(num_veiculo, estado);
	}

	public static void emprestarVeiculo(){
		String condutor;
		Integer emprestimo, qtdOperacoes;
		Veiculo veiculoEscolhido;
		Transporte transporte;

		System.out.print("Insira o nome do condutor: ");
		condutor = teclado.nextLine();

		System.out.println("Veja os veículos disponíveis: ");
		System.out.println(frota.toString());
		System.out.print("Digite o número do veículo que deseja emprestar: ");
		emprestimo = teclado.nextInt();
		teclado.nextLine();

		try{
			veiculoEscolhido = frota.escolherVeiculo(emprestimo);
		} catch (Exception e){
			System.out.println("O número para o veículo é inválido!");
			return;
		}

		if(!veiculoEscolhido.getEstado().equals(Estado.PATIO)){
			System.out.println("Veículo não disponível para emprestimo");
			return;
		}

		qtdOperacoes = veiculoEscolhido.getOperacoes().size();
		if(veiculoEscolhido.getOperacoes().size() == 0){
			System.out.print("Veículo 0 km!!!");
			transporte = new Transporte(condutor, 0);
			veiculoEscolhido.addOperacao(transporte);
		} else {
			Integer ultimoKm = veiculoEscolhido.getTransporte(qtdOperacoes - 1).getKmFinal();
			transporte = new Transporte(condutor, ultimoKm);
			veiculoEscolhido.addOperacao(transporte);
		}
		veiculoEscolhido.setEstado(Estado.OPERACAO);
		System.out.print("Veículo Emprestado!!!!!");
	}

	public static void devolverVeiculo(){
		Integer estado, devolucao, kmFinal;
		Veiculo veiculoEscolhido;

		System.out.println("Veja os veículos disponíveis: ");
		System.out.println(frota.toString());
		System.out.print("Digite o número do veículo que deseja devolver: ");
		devolucao = teclado.nextInt();
		teclado.nextLine();

		try{
			veiculoEscolhido = frota.escolherVeiculo(devolucao);
		} catch (Exception e){
			System.out.println("O número para o veículo é inválido!");
			return;
		}

		if(!veiculoEscolhido.getEstado().equals(Estado.OPERACAO)){
			System.out.println("Veículo não disponível para devolução");
			return;
		}

		System.out.print("Digite o km do veículo na devolução: ");
		kmFinal = teclado.nextInt();
		teclado.nextLine();

		try{
			Transporte t = veiculoEscolhido.getTransporte(veiculoEscolhido.getOperacoes().size() - 1);
			t.setKmFinal(kmFinal);
		} catch (Exception e){
			System.out.println("Erro ao adicionar kmFinal");
		}

		System.out.println("Escolha o estado para o véiculo: ");
		System.out.println("1. Pátio");
		System.out.println("2. Em operação");
		System.out.println("3. Oficina");
		System.out.println("4. Perda total");
		System.out.print("Escolha um número para o estado do veículo devolvido: ");
		estado = teclado.nextInt();

		if(estado == 2){
			System.out.println("Não é possível colocar em operação véiculo que está sendo devolvido");
			return;
		}

		try{
			frota.alterarEstado(devolucao, estado);
		} catch (Exception e){
			System.out.println("Estado para o veículo inválido");
			return;
		}
		System.out.println("Veículo devolvido com sucesso!");
	}
}


