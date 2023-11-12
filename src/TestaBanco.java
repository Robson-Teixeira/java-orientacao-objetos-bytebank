
public class TestaBanco {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		cliente.setNome("Robson Teixeira");
		cliente.setCpf("079.371.220-30");
		cliente.setProfissao("Programador");

		Conta conta = new Conta();
		conta.deposita(100);

		conta.setCliente(cliente);
		System.out.println("Cliente - Nome: " + conta.getCliente().getNome());
		System.out.println("Conta > Cliente - Nome: " + cliente.getNome());
		System.out.println(cliente);
	}
}
