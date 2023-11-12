
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("Conta - Saldo: " + conta.getSaldo());

		System.out.println("Conta - Cliente: " + conta.cliente);

		conta.cliente = new Cliente();
		System.out.println("Conta - Cliente: " + conta.cliente);

		conta.cliente.nome = "Robson Teixeira";
		System.out.println("Conta > Cliente - Nome: " + conta.cliente.nome);
	}
}
