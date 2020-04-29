package br.com.zup.cadastro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.zup.desafio2.model.Cliente;

public class Main {

	private static final int DIGITO_MAX = 4;
	private static final int DIGITO_MIN = 0;
	private static final String MSG_DE_INSTRU��O_DO_MENU = "Ol� seja bem vindo ao seu sistema de cadastro de clientes!"
			+ " \nDigite :\n 1-[para inserir cadastro]\n 2-[para alterar cadastro]\n 3-[para buscar cadastro ]\n 4-[para deletar cadastro]";

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Map<Long, Cliente> listaDeClientes = new HashMap<Long, Cliente>();

		int opera��o;

		do {
			System.out.println(MSG_DE_INSTRU��O_DO_MENU);
			opera��o = teclado.nextInt();
			if (opera��o < DIGITO_MIN || opera��o > DIGITO_MAX) {
				System.out.println("\nDigite uma opera��o v�lida\n");
			}

			switch (opera��o) {

			case 1:
				adicionaCliente(teclado, listaDeClientes);
				break;
			
			case 2:
				//TODO: m�todo para alterar cadastro
			
			case 3:
				//TODO: m�todo para buscar cadastro
				
			case 4 :
				//TODO: m�todo para deletar cadastro

			default:
				break;
			}

		} while (opera��o != 0);

	}

	public static Cliente adicionaCliente(Scanner teclado, Map<Long, Cliente> listaDeClientes) {
		Cliente clienteAdicionado = new Cliente();

		System.out.println("Digite o nome :");
		clienteAdicionado.setNome(teclado.next());
		System.out.println("Digite a idade :");
		clienteAdicionado.setIdade(teclado.nextInt());
		System.out.println("Digite o cpf :");
		clienteAdicionado.setCpf(teclado.nextLong());
		System.out.println("Digite email :");
		clienteAdicionado.setEmail(teclado.next());
		System.out.println("Digite o telefone :");
		clienteAdicionado.setTelefone(teclado.nextInt());
		System.out.println("Digite o endere�o :");
		clienteAdicionado.setEndereco(teclado.next());

		return listaDeClientes.put(clienteAdicionado.getCpf(), clienteAdicionado);
	}

	public static Cliente buscaCliente(Map<Long, Cliente> listaDeClientes) {
		Cliente clienteBuscado = new Cliente();
		System.out.println(clienteBuscado.getNome());
		System.out.println(clienteBuscado.getIdade());
		System.out.println(clienteBuscado.getCpf());
		System.out.println(clienteBuscado.getEmail());
		System.out.println(clienteBuscado.getEndereco());
		System.out.println(clienteBuscado.getTelefone());

		return clienteBuscado;
	}

}
