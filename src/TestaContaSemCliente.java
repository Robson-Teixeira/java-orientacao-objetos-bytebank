
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("Conta - Saldo: " + conta.getSaldo());

		System.out.println("Conta - Cliente: " + conta.getCliente());

		conta.setCliente(new Cliente());
		System.out.println("Conta - Cliente: " + conta.getCliente());

		conta.getCliente().setNome("Robson Teixeira");
		System.out.println("Conta > Cliente - Nome: " + conta.getCliente().getNome());
	}
}
