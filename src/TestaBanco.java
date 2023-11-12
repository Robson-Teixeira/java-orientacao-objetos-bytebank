
public class TestaBanco {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.nome = "Robson Teixeira";
		cliente.cpf = "079.371.220-30";
		cliente.profissao = "Programador";

		Conta conta = new Conta();
		conta.deposita(100);

		conta.cliente = cliente;
		System.out.println("Cliente - Nome: " + conta.cliente.nome);
		System.out.println("Conta > Cliente - Nome: " + cliente.nome);
		System.out.println(cliente);
	}
}
