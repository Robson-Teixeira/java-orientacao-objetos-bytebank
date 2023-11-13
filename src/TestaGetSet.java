
public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1123, 1337);
		System.out.println("Conta - Saldo: " + conta.getSaldo());
		System.out.println("Conta - Agência: " + conta.getAgencia());
		System.out.println("Conta - Número: " + conta.getNumero());

		Cliente cliente = new Cliente();
		cliente.setNome("Robson Teixeira");

		conta.setCliente(cliente);

		System.out.println("Conta > Cliente - Nome: " + conta.getCliente().getNome());

		conta.getCliente().setProfissao("Programador");

		System.out.println("Cliente: " + cliente);
		System.out.println("Conta - Cliente: " + conta.getCliente());
	}
}
