package br.com.zup.cadastro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.zup.desafio2.model.Cliente;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Map<Long, Cliente> listaDeClientes = new HashMap<Long, Cliente>();

		adicionaCliente(teclado, listaDeClientes);
		System.out.println();

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
		System.out.println("Digite o endereço :");
		clienteAdicionado.setEndereco(teclado.next());

		return listaDeClientes.put(clienteAdicionado.getCpf(), clienteAdicionado);
	}
	
	
	public static Cliente buscaCliente () {
		Cliente clienteBuscado = new Cliente();
		System.out.println("Digite o cpf do cliente :");
		
		return null;		
	}

}
